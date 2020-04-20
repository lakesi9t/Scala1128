package com.atguigu.chapter01

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("hello world")
    System.out.println("java hello world")

    val a = 10
    val b = 20
    var r= s"a=$a ,b=$b"
    println(r)
    println(s"a=$a  b=$b")
    var name = "jinlian"
    var age =18

    println(name + age)

  }
}
