package com.mysonez.workoutapp

data class Exercise(
    val description: String,
    val type: Array<String>,
    val articulations: Array<Articulation?>,
    val toughness: Array<Int>){

    var maxReps = 0
    var maxWeight:Double = 0.0
    var maxTime:Long = 0
    var maxCals:Double=0.0
}