package com.companionObject

class MyString[T](val firstName: String) {
  private var lastName:String = " "
  override def toString = firstName + lastName
}

// This is manually created Companion object
object MyString{
  def apply(firstName: String,lastName:String) = {
    val s = new MyString(firstName)
    s.lastName = lastName
  }
  def apply(firstName: String) = new MyString(firstName)
}

