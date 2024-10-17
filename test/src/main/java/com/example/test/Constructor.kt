package com.example.test

class Constructor(var a:Int, var b:Int) {
    fun printSum(){
        println("The sum is ${a+b}")
    }
}

fun main(){
    val obj1 = Constructor(5,6)
    obj1.printSum()
    val obj2 = Constructor(10,26)
    println(obj1.a, )
    println(obj2.b)
}