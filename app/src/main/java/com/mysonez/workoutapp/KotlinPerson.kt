package com.mysonez.workoutapp

import java.util.*

data class KotlinPerson (val id: Long,
                         val title: String,
                         val firstName: String,
                         val surname: String,
                         val dateOfBirth: Calendar?) {



    var favoriteColor : String? = null

    fun getLastLetter(a: String) = a.takeLast(1)

    fun getUpperCaseColor() : String{
        return favoriteColor?.toUpperCase() ?: ""   //safely return with a null check
    }

    fun getLastLetterColor() : String {
        return favoriteColor?.let { getLastLetter(it) } ?: ""  //using let lambda to overcome null
    }  //if favoriteColor is not null, run let to run getLastLetter(favoriteColor), else return ""

    fun getColorType(): String{
        val color = getUpperCaseColor()
//        return if (color == "")
//            "empty"
//        else if (color == "RED" || color == "BLUE" || color == "GREEN")
//            "rgb"
//        else
//            "other"
        return when (color){
            "" -> "empty"
            "RED", "BLUE", "GREEN" -> "rgb"
            else -> "other"
        }
    }

    override fun toString() =
        "$title $firstName $surname"

    val safeAge : Int
        get() = age ?: -1  //Safely check for null


    val age : Int?
        get() = getAge(dateOfBirth)

    companion object {
        fun getAge(dateOfBirth: Calendar?) : Int? {
            if (dateOfBirth == null) return null

            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
            return if (dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) years -1 else years
        }
    }
}

fun main(args: Array<String>) {
    val john = KotlinPerson(1L, "Mr", "John", "Blue", GregorianCalendar(1977,9,3))
    val jane = KotlinPerson(2L, "Mrs", "Jane", "Green", null)
    println("$john's age is ${john.age}")
    println("$jane's age is ${jane.age}")
    println("The age of someone born on July 27, 1973 is " + KotlinPerson.getAge(GregorianCalendar(1973, 7, 27)))
    val olderPerson = if (john.safeAge > jane.safeAge) john else jane
}