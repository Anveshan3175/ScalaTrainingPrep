package com.anonymousFuncs


// Class name should have been DiffMethodDefs
// In java there cannot be any method which doesn't accept any params
// http://joelabrahamsson.com/learning-scala-part-five-methods/ 
object DiffFunctionDefs extends App {
  
  
  def f1 = 10;
  /* Is a method that returns only the content-free placeholder (). If you write it out in full the syntax would be : def f: Unit = {}
   * 
   * when you try to return a value of the wrong type, instead of complaining it throws away the value and gives you type Unit, but typically emits a warning:
   * def f: Unit = 5  // No error only warning and returns ()
   * def f { 5 }  gives ()
   * 
   * More info : http://stackoverflow.com/questions/18368346/quite-confused-about-this-code-snippet-return-types-with-without
   */
  def f2 {20}
  def f3 = {30}
  def f4() = 40
  def f5() {50} // Same as f2... Is used to maintain the consistency of defining methods
  def f6() = {60}
  
  /*  f7,f8, and f9 are actually functions that return functions that return 10, rather than returning 10 directly. 
   *  When you declare def f8 = () => {10}, you are declaring a function f8 that takes no arguments and returns a function that takes no arguments and 
   *  returns a single integer. When you invoke println(f8) then f8 dilligently returns that function to you. When you call println(f8()) it returns 
   *  the function, then immediately invokes it.
   * 
   */
  def f7 = () => 70 // The return value is function
  def f8 = () => {80}
  def f9 = {() => {90}}
  
  // Be careful of printing the printing the function definition and invoking the function
  
  // Below are invocations of the functions directly. Not with params
  println("f1 : "+f1); // printing the function definition. Here function definition is 10>
  println("f2 : "+f2);
  println("f3 : "+f3);
  println("f4 : "+f4);
  println("f5 : "+f5);
  println("f6 : "+f6);
  println("f7 : "+f7);  // <function0> is printed since return value is function which takes no input param and returns integer 10
  println("f8 : "+f8);  // printing the function definition. Here function definition is <func0)>
  println("f9 : "+f9);
  
  // Below are other invocations :
  println("f4() : "+f4()); // invoking f4 with empty param
  println("f5() : "+f5()); // invoking f5 with empty param
  println("f6() : "+f6()); 
  println("f7() : "+f7()); 
  println("f8() : "+f8());  // invoking the function definition.
  println("f9() : "+f9()); 
  
}