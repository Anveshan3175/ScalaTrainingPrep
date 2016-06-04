package com.anonymousFuncs

/* Some other ways of defining the functions
 * http://stackoverflow.com/questions/18887264/what-is-the-difference-between-def-and-val-to-define-a-function
 */


object DiffFunctionDef2 extends App{
  
  def sum(a:Int,b:Int):Int = a + b;
  def add :(Int,Int) => Int = {_ + _ + 10}; // if the name is changed to sum, there is no compilation but run time error is thrown ?
  //def sub : (Int,Int) => Int = {((a:Int,b:Int) => Int = a + b)}
  
  println(sum(10,20))
  println(add(10,20))
  
  
  val valAdd :(Int,Int) => Int = {_ + _ + 10};
  println(valAdd(10,20))

  /* Difference between val and def in illustrated in the below sections.
   * 
   */
  def even1: (Int => Boolean) = {
    println("IN the definition of def");
    (x => x % 2 == 0)
  }

  val even2: (Int => Boolean) = {
     println("IN the definition of val"); // This is not printed in below invocation. 
    (x => x % 2 == 0)
  }
  
  println("---------------------Difference between Val ad Def----------------------")
  println("Testing even1 :"+even1(3))
  println("Testing even1 :"+even1(4))
  println("Testing even2 :"+even2(5))
  println("Testing even2 :"+even2(6))
  
}