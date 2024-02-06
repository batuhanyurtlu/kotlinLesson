package com.batuhan.learning.oop

import com.batuhan.learning.oop.Otobus

fun main() {
    val kamilKoc = Otobus(50, "İstanbul", "Ankara", 10)
    println(kamilKoc.kapasite)
    println(kamilKoc.nereden)
    println(kamilKoc.nereye)
    println(kamilKoc.mevcutYolcu)


    kamilKoc.kapasite = 100
    kamilKoc.nereden = "İzmir"
    kamilKoc.nereye = "İstanbul"
    kamilKoc.mevcutYolcu = 30

    kamilKoc.bilgiAl()
    println("----------------------")
    kamilKoc.yolcuAl(20)
    kamilKoc.bilgiAl()
    println("----------------------")
    kamilKoc.yolcuİndir(40)
    kamilKoc.bilgiAl()

}