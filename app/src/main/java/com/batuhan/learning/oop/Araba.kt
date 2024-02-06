package com.batuhan.learning.oop

class Araba (var renk:String, var hiz:Int, var calisiyorMu:Boolean){
    lateinit var otobus: Otobus // bir değer atamadan da yazabiliriz lateinit sayesinde. Int ve booleanda geçerli değil
    fun calistir () {
        calisiyorMu = true
    }
    fun durdur (){
        calisiyorMu = false
        hiz = 0
    }
    fun hizlan(kacKm:Int){
        hiz = hiz + kacKm
    }
    fun yavasla(kacKm:Int){
        hiz = hiz - kacKm
    }
   fun bilgiAl(){
       println("Renk: $renk")
       println("Hız: $hiz")
       println("Çalışıyormu: $calisiyorMu")
  }
}