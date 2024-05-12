package com.batuhan.learning

class Hesaplayici {
    fun topla(sayi1:Int,sayi2:Int){
        println("Toplam : ${sayi1+sayi2}")
    }
    fun topla(sayi1:Double,sayi2:Int){
        println("Toplam : ${sayi1+sayi2}")
    }
    fun topla(sayi1:Int,sayi2:Double){
        println("Toplam : ${sayi1+sayi2}")
    }
    fun topla(sayi1:Int,sayi2:Int,ad:String){
        println("Toplama yapan $ad sonuç : ${sayi1+sayi2}")
    }

}