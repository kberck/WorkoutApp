package com.mysonez.workoutapp

//Articulation class is a Particular Movement of a Joint in the body (bend elbow, etc)
//it has a list of primary muscles that are used, and secondary muscles that are used
//it also has an array of intensities that go with each muscle
class Articulation(val primaryMuscles: Array<String>,
                   val primaryIntensity: Array<Int>,
                   val secondaryMuscles: Array<String>,
                   val secondaryIntensity: Array<Int>) {

    override fun toString(): String {
        var myString : String = ""
        for (s in primaryMuscles) {
            myString = "$myString $s"
        }
        return myString
    }
}