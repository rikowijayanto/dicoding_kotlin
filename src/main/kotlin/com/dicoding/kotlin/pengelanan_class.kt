package com.dicoding.kotlin

fun main () {
    val dicodingcat = Animal("Kuskus", 7.5, 3,true)
    println ("Namanya adalah ${dicodingcat.name}, Berat ${dicodingcat.weight}, umur ${dicodingcat.age}, dan ${dicodingcat.isMammal} mamal")
    dicodingcat.eat()
    dicodingcat.sleep()
}

class Animal (name : String, weight : Double, age : Int, isMammal : Boolean ) {

    val name: String

    fun eat () {
        println ("$name makan")
    }

    fun sleep () {
        println ("$name tidur")
    }
}

