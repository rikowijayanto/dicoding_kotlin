package com.dicoding.kotlin

import java.lang.IllegalArgumentException

//function dalam function
fun main (){
    println("Ini adalah function dalam function")
    println("\n")
    println("Percobaan dipanggil pertama")
    val sumnilai = sum(3,6,3)
    println("Nilainya adalah $sumnilai")

}


//function inside the function
fun sum(value_a : Int, value_b : Int, value_c : Int) : Int {
    fun Int.convert() {
        if (this == 0) {
            throw IllegalArgumentException("Value must bigger than 0")
        }
    }

    value_a.convert()
    value_b.convert()
    value_c.convert()

    return value_a+value_c
}


//fold function
