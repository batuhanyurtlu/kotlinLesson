package com.batuhan.kotlinlesson

fun main(args:Array<String>) {

/*   println("hello")
  println("batuhan")
  var ogrenciAdi = "ahmet"
  var ogrenciYas = 23
  println(ogrenciAdi)
  println(ogrenciYas)

  var ad = "Ahmet"
  var yas = 10
  println("$ad Bursada $yas yıldır yaşamaktadır.")
*/


/*  val numberOfShirts = 10
   var numberOfPants = 5
println("I have ${ numberOfShirts + numberOfPants } items of clothing")
*/

/*    var score = 10
   val name = "Batu"
score = 100
   println(score)
*/
/*   var count1 = 10
  var count2 = 40
  if (count1>count2){
      println("count1 büyüktür (KOŞUL SAĞLANDI)")
  } else {
      println("count1 küçüktür (KOŞUL SAĞLANMADI)")
  }
*/

/*   val guest = 30
if(guest == 0 ){
      println("No guest")
}else if (guest < 20){
    println("Small group")
  } else {
      println("Large group")
  }
*/
/*  val ogrencisayisi = 50
if(ogrencisayisi in 1..100){
    println(ogrencisayisi)
}
*/

/*
   val result = 75
   when (result){
       0 -> println("No result")
       in 1..80 -> println("have is result")
       else -> println("No result")
   }
*/


/*
val pets = arrayOf( "dog" , "cat" ,"canary"  )
for (item in pets )
 print(item + " ")             // or print("$item ") de yapabiliriz aynı şey

*/
/*   val pets = arrayOf( "dog" , "cat" ,"canary"  )
   for ((index,item) in pets.withIndex()) {
       print("$index - $item \n ")
   }
*/
/*
for (i in 1..5 ) print(i)
    println()
    for (i in 5 downTo 1 ) print(i)
    */

/*  var bicycles = 0
  while (bicycles < 50 ){
      bicycles ++
  }
  println(bicycles)
  do {
      bicycles--
  } while (bicycles > 50)

   println("$bicycles")
*/
    /*
    repeat(3) {
        println("merhaba")
    }
    */
    /*
    val instruments = mutableListOf("trumpet","piano","violin")
    instruments.set(0,"flut")         // atama yapabiliriz değişkenlere
    // instruments.removeAt(2)           burada gitarı siler
    // instruments.add(3,"trumpet")      burada kemanın yerine trumpet ekler.
    // instruments.remove("piano")
    println(instruments)
    */

    /*
    val pets = arrayOf ("dog","cat","canary")
    println(pets.toList())           // arrayOf u toliste çevirmek gerekiyor yoksa okumuyor

    */
/*
val pets = arrayOf ("dog",2,"bird")
val number = arrayOf (1,2,3)
val compined = pets + number      // birşeyi birleştirirken tiplere dikkat etmek gerekiyor
println(compined.toList())
*/


//     ------------------------------- 2 .VİDEO -----------------------------------

/*
  val temperature = 20        // burada farklı bir if else metodu uyguladık çıktı => FALSE oluyor çünkü şartı sağlamıyor
    val isHot = if ( temperature > 40) true else false

  println(isHot)

*/


/*
// Everything is an expression
val isUnit = println("Patika")   // İlk önce değişkeni yazdırıyoruz PATİKA yazıyor sonra bunun Unit değer olduğunu belirtiyor (kotlin.Unit) şeklinde
  println(isUnit)

 */

    drive()
    drive("slow")

}
fun drive(speed: String = "fast"){
  println("driving $speed")
    
}