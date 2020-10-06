package com.mysonez.workoutapp

import java.io.File
import java.io.BufferedReader
import java.util.*

fun main(args: Array<String>) {
    val recoveryDays = 3.0 //used to calculate how long muscles take to recover fully
    val fileName = "musclelog.json"  //name of the file where info is stored
    var fileObject = File(fileName)
    var gson = Gson()
    var fileReadInput = readJson(fileObject,gson)  //info read in from json file
    var body=Body()
    setupBody(fileReadInput,body)  //creates a body and reads in current info from json file

    var lastWorkoutTime = fileReadInput.lastWorkoutDate  //date and time of the last logged workout for calculating recovery
    //TODO: Change lastWorkoutTime to lastUpdate, so fatigue is updated each time the program is run, not just when workout is entered
    val myUser = User(fileReadInput.userInfo?.name, fileReadInput.userInfo?.birthday, fileReadInput.userInfo?.sex, fileReadInput.userInfo?.maxHR,body)

    println("Welcome ${myUser.name}!")
    //workout(myUser,lastWorkoutTime,body,gson,fileObject,recoveryDays)  //TODO: figure out good way to log workouts

    //testing stuff
    for (item in body.muscles){
        println("${item.key} value ${item.value.fatigue}")
    }
}

//Read in the info from json file
//inputs: fileObject, gson
//outputs: Post
fun readJson(fileObject: File,gson: Gson):Post{
    val bufferedReader: BufferedReader = fileObject.bufferedReader()
    val inputString = bufferedReader.use { it.readText() }
    return gson.fromJson(inputString, Post::class.java)
}

//write log to json file
//inputs: body, myUser, lastWorkoutTime, gson, fileObject
//outputs: none
fun writeJson(body: Body,myUser:User,lastWorkoutTime:GregorianCalendar,gson: Gson,fileObject:File){
    var post = Post(body.muscles,myUser,lastWorkoutTime)
    var jsonString:String = gson.toJson(post)
    fileObject.writeText(jsonString)
}

//on startup, log values from json file into body
//inputs: fileReadInput, body
//outputs: none
//TODO: need to make it so weight isn't hard coded.
fun setupBody(fileReadInput:Post,body: Body){
    fileReadInput.userInfo?.body?.muscles?.let { body.readMuscles(it) }
    body.weight = 208.0
}

//log a new workout
//inputs: myUser, lastWorkoutTime, body, gson, fileObject, recoveryDays
//outputs: none
//Calls addWorkout function in myUser, calls updateFatigue in body, calls writeJson to log changes to json file
//TODO: need to make it so the workout is passed into the function
fun workout(myUser: User,lastWorkoutTime: GregorianCalendar,body: Body,gson: Gson,fileObject: File,recoveryDays:Double){
    myUser.addWorkout("burpees",100,0.0,60000,100.0)
    val workoutTime = body.updateFatigue(lastWorkoutTime,recoveryDays)
    writeJson(body, myUser,workoutTime,gson,fileObject)
}
