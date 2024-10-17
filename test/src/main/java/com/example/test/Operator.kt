package com.example.test
class DailyTask{
    fun takingBath(){
        println("...taking bath")
    }
    fun goingToCollege(){
        println("...going to college")
    }
}
fun main(){
    val rahul= 16
    val shahul = 12

//    val result =  if(rahul > shahul){
//        "rahul taller"
//    }
//    else{"Inside else statement"}
//    println("$result")
//    val age = readLine()!!.toInt()
//
//    if(age > 18){
//        println("Boi go vote")
//    }
//    else{
//        println("Sorry! Go Home boi")
//    }

//    val age = 25
//    val result = age in 1 until 100
//
//    val name:String?
//    name = null
//    println(name?.length)
/*  var t = task(1, 2)
    print(t) */

    val obj = DailyTask()
    obj.goingToCollege()
}

fun task(a:Int, b:Int = 8){


}