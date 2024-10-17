package com.example.test

class Calculation {
    var num1 = 26
    var num2 = 54

    fun add(){
        println("The sum is ${num1+num2}")
    }
}

fun main(){
    val obj1 = Calculation()
    obj1.add();
    obj1.num1 = 28
    obj1.num2 = 32
    obj1.add()
    println(obj1.num1)
}