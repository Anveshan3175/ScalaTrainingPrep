package com.caseclasses

object CaseObjectLogger {
  
  def main(args:Array[String]) {
    
    val cl = new CaseClassLogger();
    
    cl.debug(StringMessage("String error message"))
  }
  
}