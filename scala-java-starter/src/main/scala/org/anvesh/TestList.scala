package org.anvesh

object TestList {
  def main(args:Array[String]){
    
    val intList:List[Int] = List(11,45,23,78,34);
    val sum = intList.filter(_%2 == 0).reduce(_ + _)
    println("Sum of even numbers in the List is "+sum)
  }
}