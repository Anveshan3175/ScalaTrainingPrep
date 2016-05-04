package com.nestedFuncs

object FilterTest extends App{
  
  //filter function for extracting values from a list of integers that are below a threshold value
  def filter(xs:List[Int],threshold:Int) = {
    
    def process(ys:List[Int]):List[Int] = {
      if(ys.isEmpty) {
         ys // head : Selects the first element of this list. 
      }
      else if (ys.head < threshold) {
        ys.head :: process(ys.tail) // :: Adds an element at the beginning of this list.
      }
      else {
        process(ys.tail) // tail : Selects all elements except the first.
      }
    }
    process(xs  )
  }
  
  println(filter(List(1,2,3,4,5,6,7),3))
}