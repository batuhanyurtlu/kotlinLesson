package com.batuhan.learning

import java.util.Scanner
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

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

/*
   println("Lütfen bir sayı giriniz")
   val girdi = Scanner(System.`in`)
   val sayi = girdi.nextInt()
   println("Girdiğiniz sayı $sayi")
*/
 //--------------------------------------------------
/*
   var s1= 60
   var s2= 50

   var y1= 70
   var y2= 80

   println(s1 == s2) // false
   println(s1 != s2) // true
   println(s1 > s2) // true
   println(s1 >= s2) // true
   println(s1 < s2) // false
   println(s1 <= s2) // false


   println(s1>s2 || y1>y2)  // or olduğu için True döndürcek
   println(s1>s2 && y1>y2)  // false and olduğu için her iki koşuluda sağlaması gerekiyor



   var yas = 17
   var isim = "Batu"

   // Örnek1
   if(yas >= 18 ){
      println("Reşitsiniz")
   }

   // Örnek2

   if(yas >= 18 ){
      println("Reşitsiniz")
   }else{
      println("Reşit değilsiniz")
   }

   // Örnek3

   if(isim == "Batu" ){
      println("Merhaba Batu")
   }else{
      println("Tanınmayan Kişi")
   }
 */
   // Örnek4

   /* if(isim == "Batu" ){
      println("Merhaba Batu")
   }else if(isim == Batuhan){
        println("Merhaba Batuhan")
    }else{
        println("Tanınmayan Kişi")
    } */


   // Örnek5
/*
   var kullaniciAdi = "admin"
   var sifre = 12345

   if (sifre == 12345 && kullaniciAdi == "admin"){
      println("Hoşgeldiniz")
   }else{
      println("Hatalı giriş")
   }
*/
   // Örnek6

   /*
     var sinif = 10
     if ( sinif == 9 || sinif == 10 || sinif == 11 || sinif 12 ){
         println("AYT sınavına hazırlanabilirsiniz")
     }
     // Örnek7  Kısaltma İF - ELSE

     var a = 10
     var b = 14

     if (a == b) println("Eşit") else println("Eşit Değildir")

     */

/*
   val girdi = Scanner(System.`in`)

println("Dikdörtgen Alanı(1)")
   println("Çember Alanı (2)")

val secim = girdi.nextInt()
   println("Seçiminiz: $secim")
if(secim == 1){
   println("Kısa kenar giriniz: ")
   val kısaKenar = girdi.nextInt()

   println("Uzun kenarı giriniz")
   val uzunKenar = girdi.nextInt()

   val dikdörtgeninAlanı = kısaKenar*uzunKenar
println("Dikdörtgen Alanı: $dikdörtgeninAlanı")
}
   if(secim == 2)
      println("Çemberin yarıçapını giriniz : ")
      val cemberinYarıcapı = girdi.nextInt()
   val cemberinAlanı = 3*(cemberinYarıcapı*cemberinYarıcapı)
   println("Çemberin Alanı : $cemberinAlanı ")

  */
//-------------------------------------------------
/*
   val girdi = Scanner(System.`in`)

   println("Toplama işlemi (1) ")
   println("Çıkarma işlemi (2) ")
   println("Çarpma işlemi (3) ")
   println("Bölme işlemi (4) ")
   println("Lütfen yapmak istediğiniz işlemi seçiniz : ")
   val secim = girdi.nextInt()

   println("Lütfen işlem için 1.sayıyı giriniz : ")
   val girdi1 = girdi.nextInt()
   println("Lütfen 2.sayıyı giriniz : ")
   val girdi2 = girdi.nextInt()

   if (secim == 1) {
      val toplama = girdi1 + girdi2
      println("Toplama işleminin sonucu : $toplama")
   }else if (secim == 2){
         val cıkarma = girdi1 - girdi2
         println("Çıkarma işleminin sonucu : $cıkarma")
      }else if(secim == 3){
         val carpma = girdi1 * girdi2
         println("Çarpma işleminin sonucu : $carpma")
      }else if(secim == 4){
         val bolme = girdi1 / girdi2
         println("Bölme işleminin sonucu : $bolme")
      }
*/
//---------------------------------- WHEN YAPISI -----------------------------------
/*
   println("Lütfen gün seçinizi sayılıyla 1 - 7 arasında : ")
   val girdi = Scanner(System.`in`)
   val secim = girdi.nextInt()

   when(secim){
      1 -> println("Pazartesi")
      2 -> println("Salı")
      3 -> println("Çarşamba")
      4 -> println("Perşembe")
      5 -> println("Cuma")
      6 -> println("Cumartesi")
      7 -> println("Pazar")
    else -> println("Böyle bir gün yok")
   }
 */
   /*
   println("Toplama işlemi (1) ")
   println("Çıkarma işlemi (2) ")
   println("Çarpma işlemi (3) ")
   println("Bölme işlemi (4) ")
   println("Lütfen yapmak istediğiniz işlemi seçiniz : ")
   val girdi =Scanner(System.`in`)
   val secim =girdi.nextInt()

   println("İşlem yapmak istediğiniz 1.sayıyı giriniz: ")
   val sayi1 = girdi.nextInt()
   println("İşlem yapmak istediğiniz 2. sayıyı giriniz: ")
   val sayi2 = girdi.nextInt()
   when(secim){
      1 -> println("Toplama : ${sayi1+sayi2}")
      2 -> println("Çıkarma : ${sayi1-sayi2}")
      3 -> println("Çarpma : ${sayi1*sayi2}")
      4 -> println("Bölme : ${sayi1/sayi2}")
      else -> println("Böyle bir işlem yok!")
    */

   /*
 for ( i in 3..5 ){
    println(i)
 }

for (index in 10..20 step 5){
   println(index)
}

   var baslangıc = 10
   var bitis = 50
   var artis = 5
   for (a in baslangıc..bitis step artis){
      println("a: $a")
   }

   for (b in 20 downTo 10 step 2){
      println("b : $b")
   }

   for (c in 1 until 5){   //Until 1 eksiğinde kadar döngüyü bitirir.
      println("c : $c")
   }
 var sayac = 1
   while (sayac < 4){
      println("sayac: $sayac")
      sayac+=1 // sayac= sayac + 1
   }
    */

   //------------------------------------------
   /*
   val girdi = Scanner(System.`in`)
   println("Lütfen tekrarlanması istediğiniz isminizi giriniz: ")
   val isim = girdi.next()
   println("Kaç tekrar yapmak istiyorsunuz? : ")
   val tekrar = girdi.nextInt()

   for (i in 1..tekrar){

      println("$i. $isim")
   }
    */

   /*
   val girdi = Scanner(System.`in`)
   println("İşlenecek veri miktarını giriniz : ")
   var veri = girdi.nextInt()  // NOT! : Burada var kullandık val kullanmadık çünkü veri sayaçda azalıcak bu yüzden değişeceği için var kullanıyoruz!

   while (veri > 0 ){

   println("$veri. veri")
   veri -= 1

   }
    */
// -----------------------BREAK - CONTİNUE---------------------------
/*
   for (i in 1..8){
      if (i == 5){       // Döngü beşe geldiğinde döngüden çıkarıyor.Döngüleri kontrol altına alıyor.
         break
      }
      println("Döngü1  $i ")
   }

 */
   /*
   for (i in 1..8){
      if (i==5){
         continue        //Döngüde beşi pas geçiyor.
      }
      println("Döngü2 $i")
   }
    */
/*
   val girdi = Scanner(System.`in`)

   while (true) {
 println("Sayı giriniz :  ")
      val sayi = girdi.nextInt()
      val sonuc = sayi % 2
      if (sonuc == 0 ){
         println("Sayınız ÇİFT sayıdır!")
      }

      if (sonuc == 1){
         println("Sayınız TEK sayıdır")
      }

      println("Çıkmak için (1) - Devam etmek için diğer sayılar")
      val cıkıs = girdi.nextInt()
      if (cıkıs == 1){
         println("ÇIKIŞ YAPILMIŞTIR!")
         break
      }

   }
 */   // --------------------DİZİLER-----------------------------



val dizi1 = Array<Int>(5){0} // [0,0,0,0,0]
    val dizi2 = arrayListOf(1,10,"Elma","Amasya") // eğer <türünü belirtmessen> karışık elemanlar yazabilirsin.(hem string hem int türünde)
val dizi3 = arrayListOf<Int>(1,12,35)

    val meyveler = arrayOf<String>("Çilek","Muz","Elma","Kivi","Kiraz") // index numaraları sırasıyla --> 0,1,2,3,4

    //Verilere erişim

    val str1 = meyveler [2]
    println(str1)
    val str2 = meyveler.get(3)
    println(str2)
    meyveler[1] = "Yeni Muz"
    println(meyveler.contentToString())

println(meyveler.isEmpty())
    println(meyveler.count())
    println(meyveler.first())
    println(meyveler.indexOf("Kivi")) //Kivi elemanın indexini veriri '3'
    println(meyveler.contains("Muz")) //Muz elemanı varmı yokmu onu söyler.
    println(meyveler.sort())
    println(meyveler.contentToString()) //Elemanlarını sırala demek.


    /*
    val meyveler = arrayListOf<String>("Çilek","Muz","Elma","Kivi","Kiraz")

    for (meyve in meyveler){
        println("Sonuç: $meyve")
    }

for ((index,meyve) in meyveler.withIndex()){
    println("Sonuç $index : $meyve")
}

     */


   val dersler = Array(5){""}
   val notlar = Array(5) {0}

   val girdi = Scanner(System.`in`)

   for (i in 0 until dersler.count()){
      println("${i+1}. dersi giriniz: ")
      val ders=girdi.next()
      dersler[i] = ders  // Dersi kaydetmeye yarıyor

      println("${i+1}. notunuzu giriniz: ")
      val not =girdi.nextInt()
      notlar[i] = not

   }

   var toplam = 0
   for (i in 0 until notlar.count()) {
println("${dersler[i]} : ${notlar[i]}")
      toplam += notlar[i]
   }
   val ortalama = toplam / notlar.count()
   println("NOT ORTALAMANIZ : $ortalama")

   if (50>=ortalama){
      println("GEÇTİNİZ")
   }else{
      println("KALDINIZ")
   }

/*
   val a = ceil(6.5)
   println("a: $a")
   val b = floor(6.5)
   println("b: $b")
   val c = sqrt(9.0)
   println("c: $c")
  */

   //---------------------------------------------------------------------- Nesne tabanlı programlama-----------------------------------------------------------------//



















   }





















