package com.dicoding.kotlin

//sebuah fold dengan nilai inisiasi awal

//fold umum
val number = listOf<Int>(1,2,3)
val fold = number.fold(10) { current, item ->
    println("current $current")
    println("item $item")
    println()
    item + current
}
println("Fold adalah $fold")


//fold right dari kanan
val numbers = listOf(1, 2, 3)
val fold = numbers.foldRight(10) { item, current ->
    println("current $current")
    println("item $item")
    println()
    item + current
}

println("Fold result: $fold")

//drop item in a list
val number = listOf(1, 2, 3, 4, 5, 6)
val drop = number.drop(3)

println(drop)

//drop from last
val number = listOf(1, 2, 3, 4, 5, 6)
val drop = number.dropLast(3)

println(drop)
//take from zero index
val total = listOf(1, 2, 3, 4, 5, 6)
val take = total.take(3)

println(take)

//take from last index
val total = listOf(1, 2, 3, 4, 5, 6)
val take = total.takeLast(3)

println(take)
