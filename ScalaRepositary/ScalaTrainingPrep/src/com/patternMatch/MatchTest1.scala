package com.patternMatch

object MatchTest1 extends App{
  
  
  // Below  case statements defines a function which maps integers to strings
  def matchTest1(x : Int): String = x match {
     case 1 => "One"
     case 2 => "Two"
     case 3 => "Three"
     case _ => "Other Value"
  }
  
  println(matchTest1(3))
  println(matchTest1(7))
  
  
  def matchTest2(x:Any):Any = x match {
    case 1 => "ONE"
    case "TWO" => 2
    case x:Int => "scala.Int" // case x => "scala" would have been suffice. it can be treated as variable pattern.
                       // case x:String => "scala": would give error for match 7 since there will be no match for 7. x matches all strings
                       // Or you can use case x:String => "scala" but for match 7 leep a default case _
  }
  
  println(matchTest2("TWO"))
  println(matchTest2(1))  // Since match is found in first case, "ONE" is returned
  println(matchTest2(7))  // Since match is found in third case, "scala.Int" is returned
  
}