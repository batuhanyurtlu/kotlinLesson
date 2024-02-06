package com.batuhan.learning.oop

import com.batuhan.learning.oop.Araba

fun main() {
  val bmw = Araba("kırmızı",10,false)
    bmw.bilgiAl()
  println("--------------------------")
    bmw.hiz = 900
    bmw.calisiyorMu = true
    bmw.renk = "beyaz"

    println(bmw.renk)
    println(bmw.calisiyorMu)       //direk bunların yerine bmw.bilgiAl yapabilirdik
    println(bmw.hiz)
  println("--------------------------")
  bmw.durdur()
  bmw.bilgiAl()
  println("--------------------------")
  bmw.hizlan(100)
  bmw.hizlan(30)
  bmw.bilgiAl()
  println("--------------------------")
  bmw.yavasla(50)
  bmw.bilgiAl()

  println("-----------ŞAHİN-ÖRNEĞİ------------------")

  val sahin = Araba("Sarı",100,true)  //Bir sınıfda birden fazla nesne atayabiliyoruz.
  sahin.bilgiAl()

  sahin.hizlan(100)
  sahin.bilgiAl()

  sahin.durdur()
  sahin.bilgiAl()
}