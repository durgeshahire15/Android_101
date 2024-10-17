package com.example.test

open class OopsTest {
    private var name:String? = null
    private var age:Int? = null
//    init {
//        this.name = name
//        this.age = age
//    }
     constructor( name1:String){
        name = name1
        age = 15
    }
    constructor(age1: Int){
        name = "Raj"
        age = age1
    }

//    constructor()

    open fun printName(){
        println("My name is $name")
    }
    fun printAge(m:Int){
        println("My age is overloaded")
    }
    fun printAge(){
        println("My age is $age")
    }
}

class Oops2: OopsTest("hi"){

    override fun printName(){
        super.printName()
        println("Inside Oops2 printName")
    }
}

fun main(){
    val obj2 = OopsTest(age1 = 3)
    obj2.printAge(3)
    val obj1 = Oops2()
    obj1.printName()
}