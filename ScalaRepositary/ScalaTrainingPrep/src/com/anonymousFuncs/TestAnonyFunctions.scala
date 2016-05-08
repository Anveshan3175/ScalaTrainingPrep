package com.anonymousFuncs

/*object TestAnonyFunctions extends App{
  def add(a:Int,b:Int):Int = a + b
}*/

object TestAnonyFunctions {
  
 
  type twoParamFunc = (Int,Int) => Int
  type oneParamFunc = (Int) => Int
  def incr(a:Int):Int = a + 1
  
  def main(args:Array[String]){
    println("Testing anonymous functions");
    
    // Defining and using a function - 1
    def add(a:Int,b:Int):Int = a + b  // can define new function inside a function
    println("Calling addition of numbers "+add(3,4))
    
    // Defining and using a function - 2
    val increment = (x:Int) => x + 1
    println("Calling incr for 3 :"+increment(3))
    
    //val addFunction = (a:Int,b:Int) =>  a + b  will compile
    //val sum = (x:Int,y:Int):Int => x + y  will not compile  ?
    
    // Defining and using a function - 3..Using Type in the function definition
    def manipulate(a:Int,b:Int,f:twoParamFunc):String = { "The result is "+f(a,b)}
    val sumFun = manipulate(3,4,add)
    println(sumFun)
    def diff(a:Int,b:Int):Int = {a - b}
    val diffFun = manipulate(3,4,diff)
    println(diffFun)
    
    // define a function in scala
   (x:Int) => x + 1

   // function definition
   def fOne(x:Int) = x + 1
   
   // assign an object representing the function to a variable
   val fTwo = (x:Int) => x + 1
   println("Hello")
   println("plain fTwo"+fTwo)
   println("Plain toString"+fTwo.toString())
    
  }
  
 
}