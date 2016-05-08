package com.sealedClasses

/*
 *  If a trait/ class is sealed then all the sub classes extending it are to be defined in the same source file
 *  If in the match,any sub classes are missing then compiler will give warning.
 *  
 *  match may not be exhaustive. It would fail on the following input: BothMessage(_, _)
 */
sealed abstract class LogMessage
case class StringMessage(message:String) extends LogMessage
case class ExceptionMessage(exception:Throwable) extends LogMessage
case class BothMessage(message:String,exception:Throwable) extends LogMessage



class SealedClassLogger {
  
  
  def debug(lMsg:LogMessage) = log(10,lMsg)
  def info(lMsg:LogMessage) = log(5,lMsg)
  def error(lMsg:LogMessage) = log(1,lMsg)
  
  // Pattern matching demo for case class
  def log(level:Int,lMsg:LogMessage):Unit = lMsg match { 
    case StringMessage(msg) => println(msg) // msg is taken from constructor directly
    case ExceptionMessage(exception:Error) => exception.printStackTrace
    case ExceptionMessage(ex) => println(ex.toString)
  }
}