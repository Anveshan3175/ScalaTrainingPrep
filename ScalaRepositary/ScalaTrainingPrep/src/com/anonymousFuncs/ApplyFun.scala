package com.anonymousFuncs

/* apply  serves the purpose of closing the gap between Object-Oriented and Functional paradigms in Scala
 * Every function in Scala can be represented as an object ==> Every function also has an OO type: for instance, 
 * a function that takes an Int parameter and returns an Int will have OO type of Function1[Int,Int]
 * 
 *    // define a function in scala
 *		(x:Int) => x + 1  // More like function instantiation Function[Int,Int]
 *		// assign an object representing the function to a variable
 *		val f = (x:Int) => x + 1  // More like function instantiation Function[Int,Int] and assigning to reference
 * 		//Since in scala function is also an object, it should have toString().
 * 			(Not possible for pure function since functions don't have methods)
 *    
 * Every function in Scala can be treated as an object and it works the other way too - every object can be treated as a function, provided it has the apply method. 
 * Such objects can be used in the function notation: 
 * 
 * // we will be able to use this object as a function, as well as an object
 *  object Foo {
 *    var y = 5
 *    def apply (x: Int) = x + y
 *  }
 *	Foo (1) // using Foo object in function notation 
 * 
 * There are many usage cases when we would want to treat an object as a function. The most common scenario is a factory pattern. Instead of adding clutter to the code 
 * using a factory method we can apply object to a set of arguments to create a new instance of an associated class:
 *   List(1,2,3) // same as List.apply(1,2,3) but less clutter, functional notation
    
 *  // the way the factory method invocation would have looked
 *   // in other languages with OO notation - needless clutter
 *   List.instanceOf(1,2,3) 
 *   So apply method is just a handy way of closing the gap between functions and objects in Scala
 *   http://stackoverflow.com/questions/9737352/what-is-the-apply-function-in-scala
 */
object ApplyFun {
  
  
  def main(args:Array[String]) {
    
    def sum(x:Int,y:Int) = x+ y
    println("Calling SUM "+sum(6,7))
    
    val add = (a:Int,b:Int) => a+ b // we need to use => if we are defining a function
    println("Calling ADD "+add(9,10))
    
    println("Printing the function 'add' :"+add)
    
    // toString is method from Any.In scala every function is object of type Function[ , ]
    println("Calling toString method on function :"+add.toString())   // override def toString() = "<function1>"
  
  }
  
  
  
}