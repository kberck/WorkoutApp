package com.mysonez.workoutapp

import java.util.*

class User (val name : String?,
            val birthday : Calendar?,
            val sex : String?,
            var maxHR : Int?,
            val body: Body?){

    val exerciseList = ExerciseList(body)

    init {
        this.maxHR = 220 - safeAge  //initialize maxHR to a calculated guess
    }

    val safeAge : Int
        get() = age ?: -1  //Safely check for null

    val age : Int?
        get() = getAge(birthday)

    companion object {
        fun getAge(dateOfBirth: Calendar?) : Int? {
            if (dateOfBirth == null) return null

            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
            return if (dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) years -1 else years
        }
    }

    fun addWorkout(name: String,reps:Int, weight: Double, workoutTime: Long, cals: Double){
        exerciseList.musclesWorked(name,reps,weight,workoutTime,cals)
    }
}

