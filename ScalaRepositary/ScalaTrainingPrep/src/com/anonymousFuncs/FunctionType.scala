package com.anonymousFuncs


/* type FunctorType = (LocalDate, HolidayCalendar, Int, Boolean) => LocalDate .
 * The type alias FunctorType is just a shorthand for  : (LocalDate, HolidayCalendar, Int, Boolean) => LocalDate
 * 
 * Type aliases are often used to keep the rest of the code simple: you can now write
 * def doSomeThing(f: FunctorType) 
 * which will be interpreted by the compiler as
 * def doSomeThing(f: (LocalDate, HolidayCalendar, Int, Boolean) => LocalDate)
 *  
 */
object FunctionType extends App{
  
  
  // Define a sum
  def sum(a:Int,b:Int) : Int = a + b;
  
  // Define a sub
  def sub(a:Int,b:Int) : Int = a - b;
  
  // Defining  function type. So skeletion is alias for function : (Int,Int) => Int
  type skeletion = (Int,Int) => Int
  
  // How manipulate is used instead of below declaration
  // def arithematic(f:(Int,Int) => Int,a:Int,b:Int) = f(a,b)
  
  def arithematic(f:skeletion,a:Int,b:Int) = f(a,b)  //Type aliases are often used to keep the rest of the code simple.
  
  
  // Calling arithmatic with passing different function at run time
  println("Printing the sum :"+arithematic(sum,20,12))
  println("Printing the Diff :"+arithematic(sub,20,12))
  
  
}


class TestTypes (a:Int,b:Int) {
  
   val manipulate : (Int,Int) => Int = (a:Int,b:Int) => a+ b;
}