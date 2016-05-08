package com.sealedClasses


sealed trait Maybe[+T]
case class Value[T](Value: T) extends Maybe[T]
case object NoValue extends Maybe[Nothing]

object SealedObjectMaybe {
  
   def main(args:Array[String]) {
     
     val v1:Maybe[Int] = Value(42)
     val v2:Maybe[Nothing] = NoValue
     
     logValue(v1)
     logValue(v2)
     
   }
   
   def logValue[T](value:Maybe[T]):Unit = value match {
     case Value(v) => println("We have a value here : "+v)
     case NoValue  => println("No value is defined")
   }
}