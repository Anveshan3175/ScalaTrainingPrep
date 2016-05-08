package com.caseclasses


/*abstract class Term
case class Var(name:String) extends Term
case class Fun(arg:String,body:Term) extends Term
case class App(f:Term,v:Term) extends Term
*/

object CaseObject2  {
  
  def main(args:Array[String]) {
     //val termObj = Term();  compilation error since Term is abstract class
    val varObj = Var("NamedVar")
    println(varObj)
    
    val fx = Fun("x", Fun("y", App(Var("x"), Var("y"))))
    println(fx.arg)
  }
 
}



