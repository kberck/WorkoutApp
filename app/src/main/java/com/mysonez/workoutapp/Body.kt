package com.mysonez.workoutapp

import java.util.*

class Body() {
    var muscles = HashMap<String, Muscle>()
    val articulations = HashMap<String, Articulation>()
    var weight:Double = 150.0

    init {
        muscleBuilder()
        println("making new muscles")
        articulationBuilder()
    }

    private fun muscleBuilder() {
        muscles["1st Dorsal Interosseous"] = Muscle()
        muscles["Abdominals"] = Muscle()
        muscles["Abductors"] = Muscle()
        muscles["Abductor Brevis"] = Muscle()
        muscles["Abductor Digiti Minimi"] = Muscle()
        muscles["Abductor Longus"] = Muscle()
        muscles["Abductor Pollicis Brevis"] = Muscle()
        muscles["Abductor Pollicis Longus"] = Muscle()
        muscles["Adductors"] = Muscle()
        muscles["Adductor Brevis"] = Muscle()
        muscles["Adductor Longus"] = Muscle()
        muscles["Adductor Magnus"] = Muscle()
        muscles["Adductor Pollicis"] = Muscle()
        muscles["Anconeus"] = Muscle()
        muscles["Biceps Brachii"] = Muscle()
        muscles["Biceps Brachii Short"] = Muscle()
        muscles["Biceps Femoris"] = Muscle()
        muscles["Brachioradialis"] = Muscle()
        muscles["Brachialis"] = Muscle()
        muscles["Coracobrachialis"] = Muscle()
        muscles["Deltoid Anterior"] = Muscle()
        muscles["Deltoid Lateral"] = Muscle()
        muscles["Deltoid Posterior"] = Muscle()
        muscles["Dorsal Interossei"] = Muscle()
        muscles["Gemellus Superior"] = Muscle()
        muscles["Gemellus Inferior"] = Muscle()
        muscles["Erector Spinae"] = Muscle()
        muscles["Extensor Carpi Ulnaris"] = Muscle()
        muscles["Extensor Carpi Radialis Brevis"] = Muscle()
        muscles["Extensor Carpi Radialis Longus"] = Muscle()
        muscles["Extensor Digiti Minimi"] = Muscle()
        muscles["Extensor Digitorum"] = Muscle()
        muscles["Extensor Digitorum Longus"] = Muscle()
        muscles["Extensor Hallucis Longus"] = Muscle()
        muscles["Extensor Indicis"] = Muscle()
        muscles["Extensor Pollicis Brevis"] = Muscle()
        muscles["Extensor Pollicis Longus"] = Muscle()
        muscles["Flexor Carpi Radialis"] = Muscle()
        muscles["Flexor Carpi Ulnaris"] = Muscle()
        muscles["Flexor Digiti Minimi"] = Muscle()
        muscles["Flexor Digitorum Longus"] = Muscle()
        muscles["Flexor Digitorum Profundus"] = Muscle()
        muscles["Flexor Digitorum Superficialis"] = Muscle()
        muscles["Flexor Hallucis Posterior"] = Muscle()
        muscles["Flexor Pollicis Brevis"] = Muscle()
        muscles["Flexor Pollicis Longus"] = Muscle()
        muscles["Gastrocnemius"] = Muscle()
        muscles["Gluteus Maximus"] = Muscle()
        muscles["Gluteus Medius"] = Muscle()
        muscles["Gluteus Minimus"] = Muscle()
        muscles["Gracilis"] = Muscle()
        muscles["Hamstrings"] = Muscle()
        muscles["Iliocastalis Cervicis"] = Muscle()
        muscles["Iliocastalis Lumborum"] = Muscle()
        muscles["Iliocastalis Thoracis"] = Muscle()
        muscles["Iliopsoas"] = Muscle()
        muscles["Infraspinatus"] = Muscle()
        muscles["Interossei"] = Muscle()
        muscles["Interspinales"] = Muscle()
        muscles["Intertransversarii"] = Muscle()
        muscles["Latissimus Dorsi"] = Muscle()
        muscles["Levator Scapulae"] = Muscle()
        muscles["Longissimus Capitis"] = Muscle()
        muscles["Longissimus Cervicis"] = Muscle()
        muscles["Longus Capitis"] = Muscle()
        muscles["Longus Colli"] = Muscle()
        muscles["Lumbricals"] = Muscle()
        muscles["Multifidus"] = Muscle()
        muscles["Obliques"] = Muscle()
        muscles["Obliquus Capitis Inferior"] = Muscle()
        muscles["Obliquus Capitis Superior"] = Muscle()
        muscles["Obturator Externus"] = Muscle()
        muscles["Obturator Internus"] = Muscle()
        muscles["Opponens Pollicis"] = Muscle()
        muscles["Palmaris Longus"] = Muscle()
        muscles["Pectineus"] = Muscle()
        muscles["Pectoralis Major Clavicular"] = Muscle()
        muscles["Pectoralis Major Sternal"] = Muscle()
        muscles["Pectoralis Major"] = Muscle()
        muscles["Pectoralis Minor"] = Muscle()
        muscles["Peroneus Tertius"] = Muscle()
        muscles["Piriformis"] = Muscle()
        muscles["Plantaris"] = Muscle()
        muscles["Popliteus"] = Muscle()
        muscles["Pronator Quadratus"] = Muscle()
        muscles["Pronator Teres"] = Muscle()
        muscles["Psoas Major"] = Muscle()
        muscles["Quadratus Femoris"] = Muscle()
        muscles["Quadratus Lumborum"] = Muscle()
        muscles["Quadriceps Femoris"] = Muscle()
        muscles["Rectus Abdominis"] = Muscle()
        muscles["Rectus Capitis Anterior"] = Muscle()
        muscles["Rectus Capitis Lateralis"] = Muscle()
        muscles["Rectus Capitis Posterior Major"] = Muscle()
        muscles["Rectus Capitis Posterior Minor"] = Muscle()
        muscles["Rectus Femoris"] = Muscle()
        muscles["Rhomboids"] = Muscle()
        muscles["Rotatores"] = Muscle()
        muscles["Sartorius"] = Muscle()
        muscles["Scalenes"] = Muscle()
        muscles["Semimembranosus"] = Muscle()
        muscles["Semispinalis Capitis"] = Muscle()
        muscles["Semispinalis Cervicis"] = Muscle()
        muscles["Semitendinosus"] = Muscle()
        muscles["Serratus Anterior"] = Muscle()
        muscles["Serratus Anterior Lower"] = Muscle()
        muscles["Serratus Anterior Upper"] = Muscle()
        muscles["Soleus"] = Muscle()
        muscles["Splenius"] = Muscle()
        muscles["Splenius Capitis"] = Muscle()
        muscles["Sternocleidomastoid"] = Muscle()
        muscles["Subscapularis"] = Muscle()
        muscles["Supinator"] = Muscle()
        muscles["Supraspinatus"] = Muscle()
        muscles["Tensor Fasciae Latae"] = Muscle()
        muscles["Teres Major"] = Muscle()
        muscles["Teres Minor"] = Muscle()
        muscles["Tibialis Anterior"] = Muscle()
        muscles["Tibialis Posterior"] = Muscle()
        muscles["Transverse Abdominus"] = Muscle()
        muscles["Trapezius Lower Fibers"] = Muscle()
        muscles["Trapezius Middle Fibers"] = Muscle()
        muscles["Trapezius Upper Fibers"] = Muscle()
        muscles["Triceps Brachii"] = Muscle()
        muscles["Triceps Brachii Long"] = Muscle()
        muscles[""] = Muscle()

    }

    fun articulationBuilder() {
        //chest and back
        articulations["Scapula Abduction"] = Articulation(
            arrayOf("Serratus Anterior", "Pectoralis Minor"),
            arrayOf(5, 5),
            arrayOf("Levator Scapulae", "Pectoralis Major Sternal"),
            arrayOf(2, 2)
        )  //pushup
        articulations["Scapula Adduction"] = Articulation(
            arrayOf("Trapezius Middle Fibers", "Trapezius Lower Fibers", "Rhomboids"),
            arrayOf(5, 5, 5),
            arrayOf("Latissimus Dorsi"),
            arrayOf(2)
        )  //row movement toward body midline
        articulations["Scapula Depression"] = Articulation(
            arrayOf("Pectoralis Minor", "Latissimus Dorsi"),
            arrayOf(5, 5),
            arrayOf("Pectoralis Major", "Trapezius Lower Fibers"),
            arrayOf(2, 2)
        )  //shoulder only dips
        articulations["Scapula Elevation"] = Articulation(
            arrayOf("Trapezius Upper Fibers", "Trapezius Middle Fibers", "Levator Scapulae"),
            arrayOf(5, 5, 5),
            arrayOf("Serratus Anterior Upper"),
            arrayOf(2)
        )  //Shrug
        articulations["Scapula Upward Rotation"] = Articulation(
            arrayOf("Trapezius Middle Fibers", "Trapezius Lower Fibers", "Serratus Anterior Lower"),
            arrayOf(5, 5, 5),
            arrayOf(""),
            arrayOf()
        )  //Military press
        articulations["Scapula Downward Rotation"] = Articulation(
            arrayOf("Levator Scapulae", "Rhomboids", "Pectoralis Minor"),
            arrayOf(5, 5, 5),
            arrayOf("Pectoralis Major", "Latissimus Dorsi"),
            arrayOf(2, 2)
        )  //Pullup

        //Shoulder
        articulations["Shoulder Flexion"] = Articulation(
            arrayOf("Deltoid Anterior", "Deltoid Lateral", "Pectoralis Major Clavicular", "Coracobrachialis"),
            arrayOf(5, 5, 5, 5),
            arrayOf("Biceps Brachii Short"),
            arrayOf(2)
        )  //Straight arm barbell raise
        articulations["Shoulder Extension"] = Articulation(
            arrayOf("Latissimus Dorsi", "Deltoid Posterior", "Pectoralis Major Sternal"),
            arrayOf(5, 5, 5),
            arrayOf("Teres Major", "Triceps Brachii Long"),
            arrayOf(2, 2)
        )  //seated bent arm pull down
        articulations["Shoulder Adduction"] = Articulation(
            arrayOf("Latissimus Dorsi", "Pectoralis Major Sternal"),
            arrayOf(5, 5),
            arrayOf("Pectoralis Major Clavicular", "Teres Major", "Coracobrachialis", "Triceps Brachii"),
            arrayOf(2, 2, 2, 2)
        )  //pullup moving upper arm down toward the body midline
        articulations["Shoulder Abduction"] = Articulation(
            arrayOf("Deltoid Lateral", "Deltoid Anterior", "Supraspinatus"),
            arrayOf(5, 5, 5),
            arrayOf("Pectoralis Major Clavicular"),
            arrayOf(2)
        )  //dumbell side arm raises
        articulations["Shoulder Transverse Adduction"] = Articulation(
            arrayOf("Pectoralis Major Sternal", "Pectoralis Major Clavicular", "Coracobrachialis"),
            arrayOf(5, 5, 5),
            arrayOf(""),
            arrayOf()
        )  //fly machine, arms 90 degrees
        articulations["Shoulder Traverse Flexion"] = Articulation(
            arrayOf("Pectoralis Major Sternal", "Pectoralis Major Clavicular", "Deltoid Anterior", "Coracobrachialis"),
            arrayOf(5, 5, 5, 5),
            arrayOf("Biceps Brachii Short"),
            arrayOf(2)
        )  //bench dumbell flys (laying down cable flys)
        articulations["Shoulder Transverse Abduction"] = Articulation(
            arrayOf("Deltoid Posterior", "Deltoid Lateral"),
            arrayOf(5, 5),
            arrayOf("Infraspinatus", "Teres Minor"),
            arrayOf(2, 2)
        )  //laying down reverse dumbell flys on bench
        articulations["Shoulder Traverse Extension"] = Articulation(
            arrayOf("Deltoid Posterior"),
            arrayOf(5),
            arrayOf("Latissimus Dorsi", "Infraspinatus", "Teres Minor"),
            arrayOf(2, 2, 2)
        )  //wide grip bar row pullback to shoulders
        articulations["Shoulder Medial Rotation"] = Articulation(
            arrayOf("Pectoralis Major Sternal", "Pectoralis Major Clavicular", "Latissimus Dorsi", "Deltoid Anterior"),
            arrayOf(5, 5, 5, 5, 5),
            arrayOf("Subscapularis", "Teres Major", "Supraspinatus"),
            arrayOf(2, 2)
        )  //elbow at side, single arm fly
        articulations["Shoulder Lateral Rotation"] = Articulation(
            arrayOf("Teres Minor", "Infraspinatus", "Deltoid Posterior"),
            arrayOf(5, 5, 5),
            arrayOf("Supraspinatus"),
            arrayOf(2)
        )  //Laying on Side, elbow on side, dumbell raise

        //Elbow
        articulations["Elbow Flexion"] = Articulation(
            arrayOf("Brachialis", "Biceps Brachii", "Brachioradialis"),
            arrayOf(5, 5, 5),
            arrayOf(""),
            arrayOf()
        )  //seated preacher curl
        articulations["Elbow Extension"] = Articulation(
            arrayOf("Triceps Brachii", "Anconeus"),
            arrayOf(5, 5),
            arrayOf(""),
            arrayOf()
        )  //nose breakers

        //Forearm
        articulations["Forearm Pronation"] = Articulation(
            arrayOf("Pronator Quadratus", "Pronator Teres"),
            arrayOf(5, 5),
            arrayOf("Flexor Carpi Radialis", "Anconeus"),
            arrayOf(2, 2)
        )  //weighted wrist rotation, palm rotates from facing in to down
        articulations["Forearm Supination"] = Articulation(
            arrayOf("Supinator", "Biceps Brachii"),
            arrayOf(5, 5),
            arrayOf(""),
            arrayOf()
        )  //weighted wrist rotation, palm rotates from facing out to down

        //Wrist
        articulations["Wrist Flexion"] = Articulation(
            arrayOf("Flexor Carpi Radialis", "Flexor Carpi Ulnaris"),
            arrayOf(5, 5),
            arrayOf("Palmaris Longus","Abductor Pollicis Longus","Flexor Digitorum Profundus","Flexor Digitorum Superficialis","Flexor Pollicis Longus"),
            arrayOf(2, 2, 2, 2, 2)
        )  //Seated Dumbell finger rollup
        articulations["Wrist Extension"] = Articulation(
            arrayOf("Extensor Carpi Radialis Longus", "Extensor Carpi Radialis Brevis", "Extensor Carpi Ulnaris"),
            arrayOf(5, 5, 5),
            arrayOf("Extensor Digitorum", "Extensor Pollicis Longus", "Extensor Indicis", "Extensor Digiti Minimi"),
            arrayOf(2, 2, 2, 2)
        )  //Seated Dumbell palm down wrist raise
        articulations["Wrist Adduction"] = Articulation(
            arrayOf("Flexor Carpi Ulnaris", "Extensor Carpi Ulnaris"),
            arrayOf(5, 5),
            arrayOf(""),
            arrayOf()
        )  //palms in grip, press twisting hands down at wrist
        articulations["Wrist Abduction"] = Articulation(
            arrayOf("Extensor Carpi Radialis Longus", "Extensor Carpi Radialis Brevis", "Flexor Carpi Radialis"),
            arrayOf(5, 5, 5),
            arrayOf("Abductor Pollicis Longus", "Extensor Pollicis Brevis", "Extensor Pollicis Longus"),
            arrayOf(2, 2, 2)
        )  //palms in grip, twisting hands down, raising forearms

        //fingers
        articulations["Finger Flexion"] = Articulation(
            arrayOf("Flexor Digitorum Profundus", "Flexor Digitorum Superficialis", "Flexor Digiti Minimi"),
            arrayOf(5, 5, 5),
            arrayOf("Abductor Digiti Minimi", "Interossei", "Lumbricals"),
            arrayOf(2, 2, 2)
        )  //Seated Dumbell finger rollup
        articulations["Finger Extension"] = Articulation(
            arrayOf("Extensor Digitorum", "Extensor Digiti Minimi", "Extensor Indicis"),
            arrayOf(5, 5, 5),
            arrayOf(""),
            arrayOf()
        )  //Moving base of fingers away from the palm
        articulations["Finger Abduction"] = Articulation(
            arrayOf("Dorsal Interossei", "Extensor Digitorum", "Extensor Digiti Minimi"),
            arrayOf(5, 5, 5),
            arrayOf("Extensor Indicis", "Abductor Digiti Minimi"),
            arrayOf(2, 2)
        )  //Spreading the fingers apart

        //finger joint
        articulations["Finger Joint Flexion"] = Articulation(
            arrayOf("Flexor Digitorum Profundus", "Flexor Digitorum Superficialis"),
            arrayOf(5, 5),
            arrayOf(""),
            arrayOf()
        )  //Bending finger Joint
        articulations["Finger Joint Extension"] = Articulation(
            arrayOf("Extensor Digitorum", "Extensor Digiti Minimi", "Extensor Indicis", "Lumbricals", "Interossei"),
            arrayOf(5, 5, 5, 5, 5),
            arrayOf(""),
            arrayOf()
        )  //Extending finger joint

        //Thumb base joint
        articulations["Thumb Flexion"] = Articulation(
            arrayOf("Flexor Pollicis Brevis", "Flexor Pollicis Longus"),
            arrayOf(5, 5),
            arrayOf("Opponens Pollicis"),
            arrayOf(2)
        )  //Thumb bend
        articulations["Thumb Extension"] = Articulation(
            arrayOf("Flexor Pollicis Longus", "Flexor Pollicis Brevis", "Abductor Pollicis Longus"),
            arrayOf(5, 5, 5),
            arrayOf(""),
            arrayOf()
        )  //Thumb extend
        articulations["Thumb Adduction"] = Articulation(
            arrayOf("Adductor Pollicis", "1st Dorsal Interosseous"),
            arrayOf(5, 5),
            arrayOf("Extensor Pollicis Longus", "Flexor Pollicis Longus"),
            arrayOf(2, 2)
        )  //Moving bone below the thumb towards the back of the wrist
        articulations["Thumb Abduction"] = Articulation(
            arrayOf("Abductor Pollicis Longus", "Abductor Pollicis Brevis"),
            arrayOf(5, 5),
            arrayOf(""),
            arrayOf()
        )  //Moving the bone below the thumb towards the front of the wrist
        articulations["Thumb Opposition"] = Articulation(
            arrayOf("Opponens Pollicis", "Abductor Pollicis Brevis", "Flexor Pollicis Brevis"),
            arrayOf(5, 5, 5),
            arrayOf("Flexor Pollicis Longus", "Adductor Pollicis"),
            arrayOf(2, 2)
        )  //Moving thumb towards fingers

        //Neck
        articulations["Neck Flexion"] = Articulation(
            arrayOf("Longus Capitis", "Rectus Capitis Anterior", "Sternocleidomastoid"),
            arrayOf(5, 5, 5),
            arrayOf(""),
            arrayOf()
        )  //Moving chin towards the chest
        articulations["Neck Extension"] = Articulation(
            arrayOf(
                "Semispinalis Capitis",
                "Splenius Capitis",
                "Rectus Capitis Posterior Major",
                "Rectus Capitis Posterior Minor",
                "Obliquus Capitis Superior",
                "Longissimus Capitis"),
            arrayOf(5, 5, 5, 5, 5, 5),
            arrayOf("Trapezius Upper Fibers", "Sternocleidomastoid"),
            arrayOf(2, 2)
        )  //Moving chin away from the chest
        articulations["Neck Rotation"] = Articulation(
            arrayOf(
                "Sternocleidomastoid",
                "Obliquus Capitis Inferior",
                "Obliquus Capitis Superior",
                "Rectus Capitis Lateralis",
                "Longissimus Capitis",
                "Splenius Capitis"),
            arrayOf(5, 5, 5, 5, 5, 5),
            arrayOf("Semispinalis Capitis", "Trapezius Upper Fibers"),
            arrayOf(2, 2)
        )  //Rotating the head

        //Upper Spine
        articulations["Upper Spine Flexion"] = Articulation(
            arrayOf("Sternocleidomastoid", "Longus Colli", "Longus Capitis"),
            arrayOf(5, 5, 5),
            arrayOf(""),
            arrayOf()
        )  //Moving chin towards the chest
        articulations["Upper Spine Extension"] = Articulation(
            arrayOf(
                "Splenius",
                "Semispinalis Capitis",
                "Semispinalis Cervicis",
                "Iliocastalis Cervicis",
                "Longissimus Capitis",
                "Longissimus Cervicis"),
            arrayOf(5, 5, 5, 5, 5, 5),
            arrayOf("Trapezius Upper Fibers", "Interspinales"),
            arrayOf(2, 2)
        )  //Moving chin away from the chest
        articulations["Upper Spine Lateral Flexion"] = Articulation(
            arrayOf("Scalenes", "Levator Scapulae"),
            arrayOf(5, 5),
            arrayOf(""),
            arrayOf()
        )  //Moving Head Laterally sideways towards the shoulder
        articulations["Upper Spine Reduction"] = Articulation(
            arrayOf("Scalenes", "Levator Scapulae"),
            arrayOf(5, 5),
            arrayOf(""),
            arrayOf()
        )  //Moving head laterally away from the shoulder

        //Lower Spine
        articulations["Lower Spine Flexion"] = Articulation(
            arrayOf("Rectus Abdominis"),
            arrayOf(5),
            arrayOf("Obliques"),
            arrayOf(2)
        )  //Stomach machine
        articulations["Lower Spine Extension"] = Articulation(
            arrayOf("Erector Spinae"),
            arrayOf(5),
            arrayOf("Quadratus Lumborum", "Trapezius Lower Fibers"),
            arrayOf(2, 2)
        )  //Back machine
        articulations["Lower Spine Rotation"] = Articulation(
            arrayOf(
                "Obliques",
                "Psoas Major",
                "Quadratus Lumborum",
                "Multifidus",
                "Iliocastalis Lumborum",
                "Iliocastalis Thoracis",
                "Rotatores"),
            arrayOf(5, 5, 5, 5, 5, 5),
            arrayOf("Intertransversarii"),
            arrayOf(2)
        )  //Lateral movement and rotation of spine

        //Hip
        articulations["Hip Flexion"] = Articulation(
            arrayOf("Iliopsoas", "Tensor Fasciae Latae", "Rectus Femoris"),
            arrayOf(5, 5, 5),
            arrayOf("Sartorius", "Adductor Longus", "Adductor Brevis", "Pectineus"),
            arrayOf(2, 2, 2, 2)
        )  //High knees
        articulations["Hip Extension"] = Articulation(
            arrayOf("Gluteus Maximus", "Semitendinosus", "Semimembranosus", "Biceps Femoris"),
            arrayOf(5,5,5,5),
            arrayOf("Adductor Magnus"),
            arrayOf(2)
        )  //Good Mornings
        articulations["Hip Adduction"] = Articulation(
            arrayOf("Adductors"),
            arrayOf(5),
            arrayOf("Pectineus", "Gracilis", "Gluteus Maximus"),
            arrayOf(2, 2, 2)
        )  //Moving the thigh inward while standing straight
        articulations["Hip Abduction"] = Articulation(
            arrayOf("Gluteus Medius", "Gluteus Minimus"),
            arrayOf(5, 5),
            arrayOf("Tensor Fasciae Latae", "Sartorius"),
            arrayOf(2, 2)
        )  //Moving the thigh outward while standing straight
        articulations["Hip Transverse Abduction"] = Articulation(
            arrayOf("Gluteus Maximus", "Gluteus Medius", "Gluteus Minimus"),
            arrayOf(5, 5, 5),
            arrayOf("Piriformis", "Obturator Externus"),
            arrayOf(2, 2)
        )  //Moving thigh outward with hip bent
        articulations["Hip Transverse Adduction"] = Articulation(
            arrayOf("Adductors"),
            arrayOf(5),
            arrayOf("Pectineus", "Gracilis"),
            arrayOf(2, 2)
        )  //Moving thigh inward with the hip bent
        articulations["Hip Medial Rotation"] = Articulation(
            arrayOf("Tensor Fasciae Latae", "Gluteus Medius", "Gluteus Minimus"),
            arrayOf(5, 5, 5),
            arrayOf("Piriformis"),
            arrayOf(2)
        )  //Rotating the top of the thigh inward
        articulations["Hip Lateral Rotation"] = Articulation(
            arrayOf(
                "Gemellus Superior",
                "Gemellus Inferior",
                "Obturator Internus",
                "Obturator Externus",
                "Quadratus Femoris"),
            arrayOf(5, 5, 5, 5, 5),
            arrayOf("Piriformis", "Gluteus Maximus", "Sartorius", "Gluteus Medius"),
            arrayOf(2, 2, 2, 2)
        )  //Rotating the top of the thigh outward

        //Knee
        articulations["Knee Flexion"] = Articulation(
            arrayOf("Hamstrings"),
            arrayOf(5),
            arrayOf("Gracilis", "Sartorius", "Popliteus", "Gastrocnemius"),
            arrayOf(2, 2, 2, 2)
        )  //Hamstring machine
        articulations["Knee Extension"] = Articulation(
            arrayOf("Quadriceps Femoris"),
            arrayOf(5),
            arrayOf(""),
            arrayOf()
        )  //Leg extension machine
        articulations["Knee Medial Rotation"] = Articulation(
            arrayOf("Popliteus", "Semimembranosus", "Semitendinosus"),
            arrayOf(5, 5, 5),
            arrayOf("Gracilis", "Sartorius"),
            arrayOf(2, 2)
        )  //Turning front of lower leg inward
        articulations["Knee Lateral Rotation"] = Articulation(
            arrayOf("Biceps Femoris"),
            arrayOf(5),
            arrayOf(""),
            arrayOf()
        )  //Turning front of lower leg outward

        //Ankle
        articulations["Ankle Plantar Flexion"] = Articulation(
            arrayOf("Gastrocnemius", "Soleus"),
            arrayOf(5, 5),
            arrayOf("Plantaris", "Tibialis Posterior", "Flexor Hallucis Posterior", "Flexor Digitorum Longus"),
            arrayOf(2, 2, 2, 2)
        )  //Calf raises
        articulations["Ankle Dorsal Flexion"] = Articulation(
            arrayOf("Tibialis Anterior"),
            arrayOf(5),
            arrayOf("Extensor Digitorum Longus", "Extensor Hallucis Longus", "Peroneus Tertius"),
            arrayOf(2, 2, 2)
        )  //Toe raises
    }
    fun updateFatigue(lastWorkout: GregorianCalendar,recoveryDays: Double):GregorianCalendar{
        val today = GregorianCalendar()
        val years = today.get(Calendar.YEAR) - lastWorkout.get(Calendar.YEAR)
        val months = today.get(Calendar.MONTH) - lastWorkout.get(Calendar.MONTH)
        val days = today.get(Calendar.DAY_OF_MONTH) - lastWorkout.get(Calendar.DAY_OF_MONTH)
        val hours = today.get(Calendar.HOUR_OF_DAY) - lastWorkout.get(Calendar.HOUR_OF_DAY)
        if (years > 0||months > 0){
            changeFatigue(recoveryD = recoveryDays)
        } else {
            val hourTrack = (days * 24) + hours
            changeFatigue(hourTrack,recoveryDays)
        }
        println("Hours: $hours, Days: $days, Months: $months, Years: $years")
        //println("Hours: ${today.get(Calendar.HOUR_OF_DAY)}, Days: ${today.get(Calendar.DAY_OF_MONTH)}, Months: ${today.get(Calendar.MONTH)}, Years: ${today.get(Calendar.YEAR)}")
        return today
    }

    private fun changeFatigue(hours:Int = 0,recoveryD: Double){

        val percentPerHour:Double = 1/(recoveryD*24)

        for (mus in muscles){
            //println("Start: ${mus.value.fatigue}, hours: $hours, percent: $percentPerHour, change: ${percentPerHour*hours*mus.value.fatigue} ")
            mus.value.fatigue = mus.value.fatigue - percentPerHour*hours*mus.value.fatigue
            //println("Finish: ${mus.value.fatigue}")
        }
    }

    fun readMuscles(musclesIn:HashMap<String, Muscle>){
        muscles=musclesIn
    }

}