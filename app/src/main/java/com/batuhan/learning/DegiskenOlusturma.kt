package com.batuhan.learning

import java.util.Scanner

fun main(){
    /*
    // F = m x a
    var m = 12.5
    var a = 10.0
    var f = m*a
    println("F : $f ")

    var v = 12.7
    var v0 = 23.56
    var t = 3.5

    var x1 = ((v+v0)/2)*t
    println(" x1 = $x1 ")
    var x2 = ( (v0*t)+((a*t*t)/2))
    println(" x2 = $x2 ")

    var y = 10
    y = y + 2
    println(y)
    y += 2       // Bu kısaltması -=2 , *=2 diye gidiyor kısaltmalar.
    println(y)
    */

    /*
    var i = 42
    var d = 42.45
    var f = 42.89f

    var sonuc1:Int = d.toInt()           // double olan değeri int' e çevirmek istersek böyle kullanıyoruz
    var sonuc2:Double = i.toDouble()     // int olan değeri double' a çevirmek istersek
    var sonuc3:Int = f.toInt()

    println(sonuc1)
    println(sonuc2)
    println(sonuc3)

        // Burasıda sayısal bir ifadeyi metine çeviriyoruz
    var str1 = i.toString()
    var str2 = d.toString()
    var str3 = f.toString()

    println(str1)
    println(str2)
    println(str3)

     */
    /*
    // Metinsel ifadeyi sayısal bir ifadeye çevirirken kullandığımız yöntemler

    //Yöntem 1
    var yazi1 = "34T"
    try {
        var x = yazi1.toInt()
        println(x)
    }catch (e:Exception){
        println("Dönüşümde hata var!")
    }

    //Yöntem 2  En kolayı bu
    var yazi2 = "48.56"

    var y =yazi2.toDoubleOrNull()

    if (y != null){
        println("y : $y")
    }else{
        println("Dönüşümde hata var!")
    }

    //Yöntem 3
    var yazi3 ="67"   // Eğer içerde harf olsaydı çökme hatsasından korunmuş olcaktık direk kodu çalıştırmicaktı.

    var z =yazi3.toIntOrNull()
    z?.let {
        println("z: $z")
    }
     */

    /*
    println("Adınızı giriniz : ")

    val girdi = Scanner(System.`in`)
    val ad = girdi.next()      // Buraya birden fazla tür girdi girilebilir yanlız ona uygun metod seçilir
    println("Adınız $ad")      // Örneğin sayı gireceksin -> val sayi = girdi.nextInt() yazarız.

     */
    println("Lütfen bir sayı giriniz")
    val girdi = Scanner(System.`in`)
    val sayi = girdi.nextInt()
    println("Girdiğiniz sayı $sayi")


}



