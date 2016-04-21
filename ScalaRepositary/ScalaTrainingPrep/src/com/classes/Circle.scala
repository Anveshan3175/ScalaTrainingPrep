package com.classes

class Circle (xc:Int,yc:Int,rc:Int){
  
  var x:Int = xc
  var y:Int = yc
  val r:Int = rc
  
  def perimeter = 2 * 3.14f * r
  
  def moveCircle(inc:Int) = {
    x = x + xc
    y = y + yc
  }
  
  override def toString() = {
     ("The center of circle is ("+x+","+y+") and the radius is" +r)
  }
}

class BigCircle(xc:Int,yc:Int,rc:Int) extends Circle(xc:Int,yc:Int,rc:Int) {
  
  val pointONCircle:Array[Int] = new Array(10)
  
  def incRadius(incr:Int) = {
   // r = r+incr
  }
}

object TestCircle extends App {
  
   val circle = new Circle(3,4,5);
   
   println(circle)
}