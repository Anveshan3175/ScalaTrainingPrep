package com.unifiedTypes

// UnifiedTypes is singleton object
object UnifiedTypes extends App {

    val set = new scala.collection.mutable.LinkedHashSet[Any]
  
    /* The elements are added to the set
     * The elements have to conform to the declared set element type Any
     */
    set += "This is String" // += internally calls add() method ..Adds a string
    set += 456 // adds a number
    set += 'c' // adds a character
    set += true // adds a boolean
    set += main _ //add main function
  
    val iter: Iterator[Any] = set.iterator
  
    while (iter.hasNext) {
      //println(iter.next.toString())
      println(iter.next)   //string representations of all elements are printed out.
    }

}