package com.batuhan.learning

fun main() {
   /* fun Int.carpi(sayi:Int) : Int {
        return this * sayi
    }
    val sonuc = 5.carpi(2)
    println(sonuc)

    */
   infix fun Int.carpi(sayi:Int) : Int {      // bu daha düzenli hali İnfix
       return this * sayi
   }
    val sonuc = 5 carpi 2
    println(sonuc)
}