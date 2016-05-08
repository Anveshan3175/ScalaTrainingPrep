package com.caseclasses

/*abstract class Term
 *case class Var(name:String) extends Term
 *case class Fun(arg:String,body:Term) extends Term
 *case class App(f:Term,v:Term) extends Term
 */

object TermTest extends scala.App{
  
  def printTerm(term:Term){
    // case Pattern => Body
    term match {
      case Var(n) => println(n)
      case Fun(x,b) => print("^" + x +"."); printTerm(b)
      case App(f,v) => print("(");  printTerm(f);print(" ");printTerm(v);print(")")
    }
  }
  
  /* This example uses deep patterns and guards. After matching a pattern with a given value, the guard 
   * (defined after the keyword if) is evaluated. If it returns true, the match succeeds; otherwise, it fails 
   * and the next pattern will be tried.
   */
  def isIdentityFun(term:Term):Boolean = term match {
    case Fun(x,Var(y)) if x == y => true
    case _ =>  false
  }
  
  
  val id = Fun("x",Var("x"))
  val t = Fun("a", Fun("b", App(Var("c"), Var("d"))))
  println(printTerm(t))
  println("Testing the identity func : "+isIdentityFun(id))
  println("Testing the identity func : "+isIdentityFun(t))
}