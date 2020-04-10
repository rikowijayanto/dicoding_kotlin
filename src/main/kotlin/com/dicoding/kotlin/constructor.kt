package com.dicoding.kotlin


    fun main() {
        val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
        println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
    }

class Animal(pname : String, pweight : Double, page : Int, pisMammal : Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        name = pname
        weight = if (pweight < 0.0) 0.0 else pweight
        age = if (page < 0) 0 else page
        isMammal = pisMammal
    }
}
