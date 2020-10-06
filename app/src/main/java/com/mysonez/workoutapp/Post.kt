package com.mysonez.workoutapp

import java.util.*
import kotlin.collections.HashMap

class Post {
    var postMuscleList: HashMap<String,Muscle>? = null
    var userInfo: User? = null
    var lastWorkoutDate = GregorianCalendar()

    constructor() : super() {}

    constructor(PostMuscleList: HashMap<String,Muscle>,PostUserInfo: User, LastWorkoutDate: GregorianCalendar) : super() {
        this.postMuscleList = PostMuscleList
        this.userInfo = PostUserInfo
        this.lastWorkoutDate = LastWorkoutDate
    }
}