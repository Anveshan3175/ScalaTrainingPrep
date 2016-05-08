package com.currying

object CurryTest extends App{
  
  
  def sum(a:Int,f:Int => Int) :Int = {
    a + f(a)
  }
  
  def add(a:Int)(b:Int) = a + b
  println(add(3)_)
  
  println(sum(4,add(6)))
  
  def strConcat(s1:String) = (s2:String) => s2+s1
  println(strConcat("Hello ")("World"))
  
  def saluteName(f:String => String):String = f("Honorable ")
  println(saluteName(strConcat("Chief Justice")))
  
}