package com.nestedFuncs

object NestedInMain {
  
  
  def main(args:Array[String]){
    
    // Defining a new function inside a main method --nested function
     def incrByTen(x:Int) = x + 10;
     println(incrByTen(37))
     
     // define on type
     type diff = (Int,Int) => Int
     def sub(a:Int,b:Int) = a - b
     
     println(manipulate(sub,10,12)) // Even though we are passing sub, the sum is doing the manipulation
     //println(manipulate(diff,10,12))  Will not work. Gives compilation error
     
     // calling the multi nested functions
     println(fMethod(1))
  }
  
  //def manipulate(f:(Int => Int),a:Int) = f(a) perfectly fine definition of method
  
  def manipulate(f:((Int,Int)=> Int), x:Int,y:Int):Int = {
      // define nested method
      def sum(a:Int,b:Int):Int = a + b
      sum(x,y)
  }
  
  
  def fMethod(a:Int) = {
    def sMethod(b:Int) = {
      def tMethod(c:Int) = {
        c+1
      }
      var temp = b+1
      tMethod(temp)
    }
    var temp = a+1
    sMethod(temp)
  }
  
  def simpleFunc(a:Int) = {
    //a = a + 12 why is there a compilation error
  }
  
}