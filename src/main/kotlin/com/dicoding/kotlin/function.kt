package com.dicoding.kotlin

fun main () {
    println("halo ini adalah program awal saya membuat fungsi")
    val nilai_total = sum(3,4)
    println("maka nilai    totalnya adalah $nilai_total")
}


fun sum(value_a : Int, value_b :Int) : Int {
    return value_a + value_b
}