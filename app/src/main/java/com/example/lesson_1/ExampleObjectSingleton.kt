package com.example.lesson_1

object ExampleObjectSingleton {
    private var myDateCopy: String = ""
    private var myCountCopy: Int = 0

    fun classCopy(myDataClass: ExampleDataClass) {
        val myDataClassCopy = myDataClass.copy()
        myDateCopy = myDataClassCopy.myDate
        myCountCopy = myDataClassCopy.myCount
    }

    fun getMyDate(): String {
        return myDateCopy
    }

    fun getMyCount(): Int {
        return myCountCopy
    }
}