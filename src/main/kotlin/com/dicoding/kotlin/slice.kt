package com.dicoding.kotlin

fun main () {
    //slice satu
    println("SLice from start with interval")
    val numbers = listOf<Int>(1,2,3,4,5,6)
    val slice = numbers.slice(3..4)
    println(slice)

    //slice sith step
    val numbers1 = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    val slice2 = numbers.slice(3..6 step 2)
    println(slice2)

    //slice with index
    val index = listOf<Int>(1,5,6)
    val numbers3 = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    val slice3 = numbers3.slice(index)
    println(slice3)
}