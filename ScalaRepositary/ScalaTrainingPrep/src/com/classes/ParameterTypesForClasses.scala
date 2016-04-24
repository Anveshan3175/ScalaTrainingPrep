package com.classes

class ParameterTypesForClasses 

class ClassWithValParameter(val name:String) // only getter defined for name

class ClassWithVarParameter(var name:String) // Both getter and setter defined for name

class ClassWithPrivateFields(name:String) // This is both private and  val. cannot access name unless you have getter

class ClassWithDiffParameter(val name:String){
  var cname:String = name
}

class ClassWithPrivateFieldsGetter(name:String){
  def getName():String = name
}

object TestParameterTypesForClasses extends App {
  
  
  val parameterTypesForClasses = new ParameterTypesForClasses
  val classWithValParameter = new ClassWithValParameter("Value Parameter")
  val classWithVarParameter = new ClassWithVarParameter("Variable Parameter")
  val classWithPrivateFields = new ClassWithPrivateFields("Private Field")
  
  
  println(parameterTypesForClasses)
  println(classWithValParameter.name)
  println(classWithVarParameter.name) // name can be modified
  classWithVarParameter.name = "Changed Variable Parameter"
  println(classWithVarParameter.name)
  //classWithValParameter.name = "changed Value Parameter" will not compile since parameter is value
  // println(classWithPrivateFields.name) // This if enabled will give compilation error
  
}