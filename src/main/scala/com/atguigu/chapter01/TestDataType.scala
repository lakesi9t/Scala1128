package com.atguigu.chapter01

object TestDataType {

  def main(args: Array[String]): Unit = {
//    var n1:Byte = 928349218347923
    var n1 = 928349218347923l
    println(n1)

    val i1= Integer.parseInt("123")
    val i2="456".toInt
    val d1="234".toDouble


    println(i1)
    println(i2)
    println(d1)

  }

}
