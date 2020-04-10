package com.dicoding.kotlin

fun main () {
    //materi distinct

    val numbers = listOf<Int>(1,2,2,3,4,5)
    val distinct = numbers.distinct()
    println("Jumlah angka unik adalah sebanyak $distinct")

    //materi chunked
    val kata = "QWERTY"
    val hasil = kata.chunked(3)
    println(hasil)

    //lower string chunked
    val kata1 = "QWERTY"
    val hasil1 = kata.chunked(3) {
        it.toString().toLowerCase()
    }
    println(hasil1)
}