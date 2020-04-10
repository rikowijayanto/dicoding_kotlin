package com.dicoding.kotlin

fun main () {
    val hitung = factorial1(4)
    println(hitung)
}

//factorial pure
fun factorial (angka : Int) : Int {
    return if (angka == 1) {
        angka
    } else {
        var result = 1
        for (i in 1..angka) {
            result = result * i
        }
        result
    }
}

//factorial function
fun factorial1 (angka : Int) : Int {
    return if (angka == 1) {
        angka
    } else {
        angka * (factorial1(angka-1))
    }
}