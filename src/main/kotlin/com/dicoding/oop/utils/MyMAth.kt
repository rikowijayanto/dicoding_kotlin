package com.dicoding.oop.utils

fun sayHello() = println("Hello this is math function")

const val PI = 3.14 //package level

//membuat function pangkat

fun pow (number : Double, power : Double) : Double {
    var result = 1.0
    var counter = power
    while (counter > 0) {
        result *= number
        counter--
    }

    return result
}

fun factorial (number : Double) : Double {
    var result = 1.0
    var counter = 1.0
    while (counter <= number) {
        result *= counter
        counter++
    }
    return result

}

fun areacircle (radius : Double) : Double {
    return PI*radius*radius
}
