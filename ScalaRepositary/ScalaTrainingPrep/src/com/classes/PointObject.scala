package com.classes

object PointObject {
  
  def main(args :Array[String]) {
    
    val pt = new Point(3,4)
    println(pt)
    pt.move(1, 1)
    println(pt)
    
   //  pt = new Point(6,7); if pt is defined as var then this assignment would have been possible
   // println(pt)
    
    
    var linePt1 = new Point(3,4)
    var linePt2 = new Point(8,9)
    
    val line = new Line(linePt1,linePt2);
    
    println("The line "+line +" is of length "+line.length());
        
  }
  
}