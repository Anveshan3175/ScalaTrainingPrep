package com.patternMatch

case class Person (name:String,age:Int)

object SimpleMatch1 extends App{
  
  val i:Int = 2
  val month:String = i match {
    case 1 => "January"
    case 2 => "Febuary"
    case 3 => "March"
    case _ => "Others"
  }
  println (month)
  
  var any:Any = "Default"
  //any = 577 we can do this
  val num = any match {
    case x => x  // This variable can refer to any data type
    //case _ => 100  A warning message saying "unreacheable code ". No need for default case
  }
  
  println(num)
  
  val bob = Person("Bobby",35)
  val mary = Person("Maise Mary",26)
  
  /*def getPerson(person:Person):String = {
    person matches {
      case Person("Bobby",_) => "Bobby"
        
  }
    */
}

