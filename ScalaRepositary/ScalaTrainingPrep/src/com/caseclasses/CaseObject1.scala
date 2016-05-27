package com.caseclasses

object CaseObject1 {
  
  def main(args:Array[String]){
    
    val stud1 = CaseStudent("Anveshan",100) // No need for new key word for case class
    println(stud1)    // Will have proper toString method by default with class parameters
  
    val stud2 = new NormalStudent("Ravi",90)
    println(stud2)
    
    val cs1 = CaseClass1("Test Case",6)
    println("Printing cs1"+cs1) // toString is given by scala compiler for case classes

    val cs2 = CaseClass1("Test Case",6)
    
    println("Comparing the instances of case classes :"+(cs1 == cs2)) // Equals method is also generated for case classes
    
    //val cs3 = cs1.copy() // Will copy cs2 to cs3 with all values from cs1
    val cs3 = cs1.copy("Test case copied") // Will copy cs2 to cs3 with name changed 
    println("Printing the copied case object :"+cs3) 
    //Add comment
  }
  
}