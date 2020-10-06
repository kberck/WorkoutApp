package com.mysonez.workoutapp


import kotlin.math.abs

class ExerciseList(private val body: Body?) {

    val myList = HashMap<String,Exercise>()

    init {
        createExerciseList()
    }


    //Creating a Hashmap of exercises with the name as the key and exercise as value
    //inputs None
    //outputs None
    private fun createExerciseList() {
        if (body != null) {

            myList["barbell front raise"] = Exercise("arms straight, barbell front raise",
                arrayOf("strength","weights","barbell"),
                arrayOf(body.articulations["Deltoid Anterior"],body.articulations["Pectoralis Major Clavicular"],body.articulations["Deltoid Lateral"],
                    body.articulations["Trapezius Middle Fibers"],body.articulations["Trapezius Lower Fibers"],
                    body.articulations["Trapezius Upper Fibers"],body.articulations["Levator Scapulae"],body.articulations["Extensor Digitorum"],
                    body.articulations["Extensor Carpi Radialis Longus"],body.articulations["Extensor Carpi Radialis Brevis"],body.articulations["Extensor Carpi Ulnaris"],
                    body.articulations["Extensor Indicis"],body.articulations["Extensor Digiti Minimi"],body.articulations["Extensor Pollicis Longus"],
                    body.articulations["Extensor Pollicis Brevis"]),
                arrayOf(9,5,5,5,5,3,3,7,5,6,5,4,2,3,3))

            myList["barbell military press"] = Exercise("military press",
                arrayOf("strength","weights","barbell"),
                arrayOf(body.articulations["Deltoid Anterior"],body.articulations["Pectoralis Major Clavicular"],body.articulations["Triceps Brachii"],
                    body.articulations["Deltoid Lateral"],body.articulations["Trapezius Middle Fibers"],body.articulations["Trapezius Lower Fibers"],
                    body.articulations["Serratus Anterior"],body.articulations["Trapezius Upper Fibers"],body.articulations["Levator Scapulae"]),
                arrayOf(9,6,7,7,5,3,2,1,1))

            myList["behind the neck press"] = Exercise("behind the neck press",
                arrayOf("strength","weights","barbell"),
                arrayOf(body.articulations["Deltoid Anterior"],body.articulations["Deltoid Lateral"],body.articulations["Supraspinatus"],
                    body.articulations["Triceps Brachii"],body.articulations["Trapezius Middle Fibers"],body.articulations["Trapezius Lower Fibers"],
                    body.articulations["Serratus Anterior"],body.articulations["Trapezius Upper Fibers"],body.articulations["Levator Scapulae"]),
                arrayOf(9,5,1,1,5,1,1,1,1))

            myList["burpees"] = Exercise("burpee",
                arrayOf("cardio","crossfit","body weight"),
                arrayOf(body.articulations["Scapula Abduction"],body.articulations["Elbow Extension"],body.articulations["Hip Flexion"],
                    body.articulations["Hip Extension"],body.articulations["Knee Extension"],body.articulations["Ankle Plantar Flexion"],
                    body.articulations["Shoulder Flexion"]),
                arrayOf(5,5,2,3,4,2,2))

            myList["cable twisting overhead press"] = Exercise("punching across body upwards using cable",
                arrayOf("strength","weight machine"),
                arrayOf(body.articulations["Deltoid Anterior"],body.articulations["Pectoralis Major Clavicular"],body.articulations["Deltoid Lateral"],
                    body.articulations["Supraspinatus"],body.articulations["Triceps Brachii"],body.articulations["Trapezius Middle Fibers"],
                    body.articulations["Trapezius Lower"],body.articulations["Serratus Anterior"],body.articulations["Gluteus Maximus"],
                    body.articulations["Adductor Magnus"],body.articulations["Quadriceps"],body.articulations["Soleus"],
                    body.articulations["Obliques"],body.articulations["Psoas Major"],body.articulations["Quadratus Lumborum"],
                    body.articulations["Iliocastalis Lumborum"],body.articulations["Tensor Fasciae Latae"],body.articulations["Gluteus Medius"],
                    body.articulations["Hamstrings"],body.articulations["Gastrocnemius"],body.articulations["Trapezius Upper"],
                    body.articulations["Levator Scapulae"],body.articulations["Erector Spinae"]),
                arrayOf(8,7,6,5,7,3,2,5,3,3,3,3,4,3,2,1,1,3,1,1,1,1,1))

            myList["dumbbell arnold press"] = Exercise("dumbbells in hands, palms facing you, press upward rotating wrist to palms frontwards as you raise",
                arrayOf("strength","weights","dumbbells"),
                arrayOf(body.articulations["Deltoid Anterior"],body.articulations["Deltoid Lateral"],body.articulations["Supraspinatus"],
                    body.articulations["Triceps Brachii"],body.articulations["Trapezius Middle"],body.articulations["Trapezius Lower"],
                    body.articulations["Serratus Anterior"],body.articulations["Trapezius Upper"],body.articulations["Levator Scapulae"]),
                arrayOf(9,7,7,7,6,6,5,3,3))

            myList["pullups"] = Exercise("strict pullups with palms forward facing",
                arrayOf("strength","crossfit","body weight"),
                arrayOf(body.articulations["Shoulder Downward Rotation"],body.articulations["Shoulder Adduction"],body.articulations["Shoulder Extension"],
                    body.articulations["Shoulder Depression"]),
                arrayOf(7,7,3,5))

            myList["pushups"] = Exercise("pushups",
                arrayOf("strength","crossfit","body weight"),
                arrayOf(body.articulations["Scapula Abduction"],body.articulations["Elbow Extension"],body.articulations["Transverse Flexion"]),
                arrayOf(7,7,6))

            myList["thrusters"] = Exercise("Thrusters",
                arrayOf("strength","crossfit","weights","barbell","body weight"),
                arrayOf(body.articulations["Knee Extension"],body.articulations["Hip Extension"],body.articulations["Elbow Extension"],
                    body.articulations["Scapula Upward Rotation"],body.articulations["Shoulder Abduction"],body.articulations["Shoulder Flexion"]),
                arrayOf(7,7,7,7,7,3))
        }
    }

    fun musclesWorked(workoutName: String, reps:Int = 0, weight: Double = 0.0, workoutTime: Long = 0, cals: Double = 0.0): Int{
        val musclesWorkedList = HashMap<String,Double?>()
        if (workoutName in myList.keys){
            val workout = myList[workoutName]
            if (workout != null&&(workout.articulations.size!=workout.toughness.size)) {
                val mainMultiplier = calcMultiplier(reps = reps,weight = weight,time = workoutTime,cal = cals,myExercise = workout)
                for ((artCounter, element) in workout.articulations.withIndex()) {
                    if (element != null) {
                        var counter = 0
                        for (pm in element.primaryMuscles) {
                            //println("primary muscle $pm, intensity ${element.intensity[counter]}, toughness ${workout.toughness[artCounter]}")
                            if (body != null) {
                                if (pm in body.muscles.keys) {
                                    var pmVal:Double = if (musclesWorkedList[pm] == null){
                                        0.0
                                    }else {
                                        musclesWorkedList[pm]!!
                                    }
                                    if (pm in musclesWorkedList) {

                                        if ((element.primaryIntensity[counter] * mainMultiplier * workout.toughness[artCounter]) > musclesWorkedList[pm]!!) {
                                            println("$pm in list already, list = ${musclesWorkedList[pm]}, element = ${element.primaryIntensity[counter]}")
                                            musclesWorkedList[pm] =
                                                pmVal + element.primaryIntensity[counter] * workout.toughness[artCounter] *mainMultiplier
                                        }
                                    } else {
                                        musclesWorkedList[pm] =
                                            pmVal!! + element.primaryIntensity[counter] * workout.toughness[artCounter] * mainMultiplier
                                    }
                                }else{
                                    println("$pm not in muscle list!")
                                }
                            }
                            counter++
                        }
                        counter = 0
                        for (sm in element.secondaryMuscles){
                            if (sm != "") {
                                if (body != null) {
                                    if (sm in body.muscles.keys) {
                                        var smVal:Double = if (musclesWorkedList[sm] == null){
                                            0.0
                                        }else {
                                            musclesWorkedList[sm]!!
                                        }
                                        //println("secondary muscle $sm, intensity ${element.intensity[counter]}, toughness ${workout.toughness[artCounter]}")
                                        if (sm in musclesWorkedList) {
                                            if ((element.secondaryIntensity[counter] * mainMultiplier * workout.toughness[artCounter]) > musclesWorkedList[sm]!!) {
                                                println("$sm in list already, list = ${musclesWorkedList[sm]}, element = ${element.secondaryIntensity[counter]}")
                                                musclesWorkedList[sm] =
                                                    smVal!! + element.secondaryIntensity[counter] * workout.toughness[artCounter] * mainMultiplier
                                            }
                                        } else {
                                            musclesWorkedList[sm] =
                                                smVal!! + element.secondaryIntensity[counter] * workout.toughness[artCounter] * mainMultiplier
                                        }
                                    }else{
                                        println("$sm not in muscle list!")
                                    }
                                }
                                counter++
                            }
                        }
                    }
                }
            }else{
                println("Workout null or array size of articulation is different than array size of toughness $workoutName")
            }
        }
        else{
            println("Workout not on the list! $workoutName")
            return -1
        }
        for (item in musclesWorkedList){
            //println("Name: ${item.key}, num: ${item.value}")
            item.value?.let { updateMuscleFatigue(item.key, it) }
        }
        return 1
    }

    //Update the fatigue in a muscle
    //inputs: Name (name of the muscle), fatigue (new fatigue)
    //outputs: None
    fun updateMuscleFatigue(name:String,fatigue:Double){
        if (body != null) {
            body.muscles[name]?.fatigue = body.muscles[name]?.fatigue?.plus(fatigue)!!
        }
    }


    //Calculates Toughness multiplier of the exercise.
    //Returns the average
    fun calcMultiplier(reps:Int=0, weight:Double=0.0, time:Long=0, cal:Double=0.0,myExercise: Exercise): Double{
        var repsMul:Double = 1.0
        var weightMul:Double = 1.0
        var timeMul:Double = 1.0
        var calMul:Double = 1.0
        var bodyWeightMul:Double = 1.0

        if(reps>0){
            if(myExercise.maxReps==0){
                myExercise.maxReps=reps
                repsMul = 100.0
            }else{
                repsMul = (reps/myExercise.maxReps*100).toDouble()
            }
        }

        if(weight>0){
            if(myExercise.maxWeight==0.0){
                myExercise.maxWeight=weight
                weightMul = 100.0
            }else{
                weightMul = (weight/myExercise.maxWeight*100).toDouble()
            }
        }

        if(time>0){
            val startLong:Long=0
            if(myExercise.maxTime==startLong){
                myExercise.maxTime=time
                timeMul = 100.0
            }else{
                timeMul = (time/myExercise.maxTime*100).toDouble()
            }
        }

        if(cal>0){
            if(myExercise.maxCals==0.0){
                myExercise.maxCals=cal
                calMul = 100.0
            }else{
                calMul = (cal/myExercise.maxCals*100).toDouble()
            }
        }

        val bodyWeight = body!!.weight

        if ("body weight" in myExercise.type) {
            val test = ((bodyWeight - 150.0) / 150.0)*100
            if (test <= 0) {
                bodyWeightMul = 1.0
            } else {
                bodyWeightMul = abs(test)
            }
        }

        println("Reps: $repsMul, Weight: $weightMul, Time: $timeMul, Cals: $calMul, Body: $bodyWeightMul, mul: ${((repsMul+weightMul+timeMul+calMul+bodyWeightMul)/500.0)*100}")
        return ((repsMul+weightMul+timeMul+calMul+bodyWeightMul)/500.0)*100
    }
}

