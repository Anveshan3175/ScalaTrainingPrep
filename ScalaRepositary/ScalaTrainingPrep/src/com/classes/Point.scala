package com.classes

class Point (xc: Int, yc: Int) {
  
  var x : Int = xc;
  var y : Int = yc;
  
  def move (dx:Int, dy:Int) = {
    x = x + dx
    y = y + dy
    
  }
  
  
  override def toString():String = "("+ x+","+y+")"; 
}


class Line (p1 : Point,p2 : Point) {
  val point1 : Point = p1;
  val point2 : Point = p2;
  
  def drawLine () = {
    println("Drawing Line");
  }
  
  def length () = { scala.math.abs(p1.x - p2.x)}
  
  override def toString():String = {p1 +","+p2} 
}