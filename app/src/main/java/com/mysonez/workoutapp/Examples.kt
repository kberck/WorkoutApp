package com.mysonez.workoutapp


import java.io.FileInputStream
import java.math.BigDecimal
import java.util.*
import kotlin.math.roundToInt

//functions
//fun someMethod(value: String  //parameters): String  //return type  {}
//Non return functions return Unit, but you don't have to specify
private fun printAString(value: String) {  //private makes function only accessible from this file
    println(value)
}

fun addTwoNumbers(x: Double, y: Double) =  //one line function can be shorthanded, returns expression
    x + y

fun printSomeMaths(one: Double, two: Double = 3.9){  //3.9 is default if not entered
    println("one + two is ${one + two}")
    println("one - two is ${one - two}")
}

fun methodTakesALambda(input: String, action: java.util.function.Function<String, Int>){
    println(action.apply(input))
}
fun methodTakesALambda2(input:String, action: (String) -> Int){
    println(action(input))
}

@Throws (InterruptedException::class)
fun divide(a: Int, b: Int) : Double {
    Thread.sleep(1000)
    return (a.toDouble() / b)
}

//reading a file
//fun printFile(){
//val input = FileInputStream("crossfit.json")

//input.use {
//an exception could be thrown here
// }
//}


fun main(args: Array<String>) {

    //exceptions
    try{
        //println(7 / 0)
    }catch (e: ArithmeticException){
        //println("caught")
    }

    val result2 = try{
        divide(5,25)
    }catch (e: Exception) {
        println(e)
        0
    }
    println(result2)



    //collections
    //immutable list
    val colors = listOf("Red", "Green", "Blue")
    //println(colors::class.qualifiedName)
    //println(colors[2])

    //mutable list
    val days = mutableListOf("Monday", "Tuesday", "Wednesday")
    val numbers = mutableListOf<Int>()

    //maps and sets
    val months = mutableSetOf("Jan", "Feb")
    val webColors = mapOf("red" to "ff0000", "blue" to "00ff00")

    //array
    val intArray : IntArray = intArrayOf(1,2,3,4,5)
    intArray.set(3,-4)
    intArray.forEach {println(it)}
    intArray[3] = -7


    //loops
    var x : Int = 0
    while(x < 10) {
        // println(x)
        x++
    }

    val people = HashMap<Int, KotlinPerson>()
    people.put(1, KotlinPerson(1, "Mr", "James", "Apple", null))
    people.put(2, KotlinPerson(2, "Miss", "Sophie", "Orange", null))
    people.put(3, KotlinPerson(3, "Mrs", "Anita", "Banana", null))
    people.put(4, KotlinPerson(4, "Mr", "Darren", "Kumkwat", null))


    for ((key, value) in people) {
        //println("$value has key $key")
    }

    for (i in 0..9){
        println(i)
    }

    (0..9).forEach{ i -> println(i)}
    //(0..9).forEach{println(it)}
    //(0..9 step 2).forEach{println(it)}
    //(9 downTo 0).forEach {println(it)}
    //(0 until 9).forEach {println(it)}
    //('A'..'F').forEAch {println(it)}



    //printAString("Hello World")
    // println(addTwoNumbers(4.5, 3.6))
    // printSomeMaths(3.9, 93.2)
    //printSomeMaths(two = 4.2, one = 894.3)  //to enter parameters out of order

    //exploring nulls
    var name2: String? = null  //explicitly make it nullable
    // println(name2?.toUpperCase())
    var address = null  //address can never have a value


    var name = "User"
    val lastName = "Blah"  //immutable variable
    val myDouble = 21.4

    //println("Is myDouble a Double? ${myDouble is Double}")
    //println("myDouble is a ${myDouble::class.qualifiedName}")
    //println("myDouble's javaClass is ${myDouble.javaClass}")

    val myInteger = myDouble.roundToInt()
    // println("myInteger is a ${myInteger::class.qualifiedName}")

    val myFloat : Float = 13.6f
    val bd = BigDecimal(17)
    val bd2 : BigDecimal
    bd2 = bd.add(BigDecimal(30))

    //println("$name ${lastName.toUpperCase()}")
    // println("the \$name has ${name.length} characters") //escape character

    val story = """It was a dark and stormy night.
        |A foul smell crept across the sky.
        |Jane wondered what time it was, and when it would be daylight.""".trimMargin("|")

    //println(story)
    val changedStory = story.replaceAfter("it", " would be dawn.")
    //println(changedStory)

    var result: Any
    val randomNumber = Random().nextInt(3)

    if (randomNumber == 1) {
        result = BigDecimal(30)
    }
    else {
        result = "hello"
    }

    // println("Result is currently $result: $randomNumber")

    result = if (result is BigDecimal){
        result.add(BigDecimal(47))
    }
    else{
        val tempResult = result as String
        tempResult.toUpperCase()
    }
    //println("Result is currently $result")

}