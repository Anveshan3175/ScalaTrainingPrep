package com.sealedClasses

object SealedObjectLogger {
  
  def main(args:Array[String]) {
    val cl = new SealedClassLogger();
    cl.debug(StringMessage("String error message"))
  }
}