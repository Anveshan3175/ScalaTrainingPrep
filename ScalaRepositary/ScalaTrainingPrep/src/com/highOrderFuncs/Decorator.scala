package com.highOrderFuncs

class Decorator(left:String,right:String) {
  //def layout (x:Int):String = left+x.toString()+right
  def layout[A] (x:A) = left+x.toString()+right // This is called polymorphic  method = i.e. it abstracts over some of its signature types
  
}


object TestDecorator extends App {
  
  //def apply(f:Int => String,x:Int):String = f(x)
  def apply(f:Int => String,x:Int) = f(x)
  
  val decorate = new Decorator("[","]");
  println(apply(decorate.layout,7)) // I am not passing the return value from the method.Instead I am passing the method itself to apply
  
  type convert = (Integer => String)  //declare type
  def IntToStringConvert(a:Integer):String = a.toString() +".00"  // create a method which has signature as above TYPE
  
  def conversion(f:convert,v:Int):String = f(v)  // Use the TYPE to define new method'
  
  println(conversion(IntToStringConvert,10)) // call the function
}
