package com.collections

object ListEx1 {
  
  def main(s:Array[String]) {
    
    val intList:List[Int]  = List(1,3,7,3)
    val stringList:List[String] = List("Hi","Hello","Welcome")
    val floatList = 1.5 :: (3.7 :: (5.9 :: Nil))
    val emptyList = Nil
    val anotherEmptyList:List[Nothing] = List()
    val numsList = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
    
    
    println("Head of floats is "+floatList.head)
    println("Tails of the ints is "+intList.tail)
    println ("Is String list empty ? "+stringList.isEmpty)
    println ("Is empty list really empty ? "+emptyList.isEmpty)
    
    println("intList is "+(intList ::: floatList))
    
    var hybridList = intList ::: floatList;
    println("hybridList is "+hybridList)
     
     val lisOfLists:List[List[Int]] = List(
         List(1,3,6,9,4),
         List(),
         List(23,56,90))
    
         println("lisOfLists is "+lisOfLists)
    
         // The list type in Scala is covariant. This means that for each pair of types S and T, if S is a subtype of T, 
         // then List[S] is a subtype of List[T]. For instance, List[String] is a subtype of List[Object]
      val objList:List[Object] = List("String1","String2")
      val emptyString:List[String] = List() //Nothing is the bottom type in Scala's class hierarchy
      
      // Testing cons
      println("printing numsList "+numsList)
      numsList.head :: numsList.tail // THis will compile but not  numsList.head :: 8
      println("printing modified numsList "+(numsList.head :: 7 :: Nil))
  }
}