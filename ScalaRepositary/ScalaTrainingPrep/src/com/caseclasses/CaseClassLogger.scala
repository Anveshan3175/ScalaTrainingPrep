package com.caseclasses

abstract class LogMessage
case class StringMessage(message:String) extends LogMessage
case class ExceptionMessage(exception:Throwable) extends LogMessage
case class BothMessage(message:String,exception:Throwable) extends LogMessage

// non case classes 
class AuditMessage(val message:String) extends LogMessage



class CaseClassLogger {
  
  
  def debug(lMsg:LogMessage) = log(10,lMsg)
  def info(lMsg:LogMessage) = log(5,lMsg)
  def error(lMsg:LogMessage) = log(1,lMsg)
  
  // Pattern matching demo for case class
  def log(level:Int,lMsg:LogMessage):Unit = lMsg match { 
    case StringMessage(msg) => println(msg) // msg is taken from constructor directly
    case ExceptionMessage(exception:Error) => exception.printStackTrace
    case ExceptionMessage(ex) => println(ex.toString)
    // case AuditMessage(msg) => println(msg) compiler error is thrown for non- case classes
  }
}


