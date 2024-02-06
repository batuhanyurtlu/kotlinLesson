package com.batuhan.learning

fun main() {
    fun selamla (){
        val sonuc = "Merhaba Batu"
        println(sonuc)
    }
    selamla()

    fun selamla1():String{
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }
    val gelenSonuc = selamla1()
    println(gelenSonuc)

    fun selamla2(isim:String){
        val sonuc ="Merhaba $isim"
        println(sonuc)
    }
    selamla2("Zeynep")

    fun toplama(){         //GERİ DÖNÜŞÜ OLAN
        val toplam = 30 + 40
        println("Toplama : $toplam")
    }
    toplama()

    fun toplama1():Int{      //GERİ DÖNÜŞÜ OLMAYAN
        val toplam = 30 + 40
    return toplam
    }

    val t1 = toplama1()
    println("t1 : $t1")

    fun toplama2(sayi1:Int,sayi2:Int):Int{
        val toplam = sayi1 + sayi2
        return  toplam
    }

    val t2 = toplama2(100,200)
    println("t2 : $t2")

}