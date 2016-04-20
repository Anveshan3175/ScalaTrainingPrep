package com.traits

trait Similarity {
  def isSimilar(x: Any):Boolean
  def isNotSimilar(a:Any):Boolean = !isSimilar(a);
}

trait Equality {
  def arePointsEqual(obj:Point):Boolean;
}

class Point(xc:Int,yc:Int) extends Similarity with Equality{
  var x : Int = xc;
  var y : Int = yc;
  def isSimilar(obj:Any) = {
    obj.isInstanceOf[Point]
  }
  
  def arePointsEqual(pt:Point):Boolean = {
    return pt.isInstanceOf[Point] && pt.x == x && pt.y == this.y
  }
  
}


object testPoint {
  
  def main(args:Array[String]) {
    val p1 = new Point(5,6);
    val p2 = new Point(5,6);
    
    println("p1 == p2 : " +p1.arePointsEqual(p2))
    
  }
}