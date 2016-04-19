package com.traits

trait Similarity {
  def isSimilar(x: Any):Boolean
  def isNotSimilar(a:Any):Boolean = !isSimilar(a);
}

trait Equality {
  def arePointsEqual(obj:Point);
}

class Point(xc:Int,yc:Int) extends Similarity with Equality{
  var x : Int = xc;
  var y : Int = yc;
  def isSimilar(obj:Any) = {
    obj.isInstanceOf[Point]
  }
  
  def arePointsEqual(pt:Point) = {
    pt.isInstanceOf[Point] && pt.x == x && pt.y == this.y
  }
  
}