package com.example.practice

fun main(){
    helloWorld()
    checkNum(1)

}
//4.조건식
fun maxBy(a : Int , b : Int ) : Int{
  if( a > b){
      return a
  }else{
      return b
  }
}

fun maxBy2(a : Int , b : Int ) = if( a> b) a else b

fun checkNum(score : Int){
    when(score){
        0 -> println("x is zero")
        1 -> println("x is one")
        2,3 -> println("x is two or three")
        else -> println("I don't know")
    }

    var b : Int = when(score){
        1 -> 1
        2 -> 2
        else -> 0
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("you ar genius")
        in 10..80  -> println("not bad")
        else -> println("okay")
    }
}

//3. String Template
fun stringPractice(){
    val name = "Joyce"
    val lastName = "Hong"
    println("my name is ${name + lastName}") //변수쓰기
    println("is this true? ${1==0}")
    println("this is 2\$a")
}

//1.함수
fun helloWorld(){
    println("Hello World")
}

//함수 return에 : 하고 타입적어주기
fun add(a : Int, b : Int ) : Int {
    return a + b
}

//2. val vs var
// val = value

fun hi(){
    val a : Int = 5 //변하지 않는값
    var b : Int = 9 //변하는값

  // a = 100 오류발생
  // b = 100 오류발생하지않음

    val c = 100
    var d = 100

    var name = "joyce";
}

//Expression

