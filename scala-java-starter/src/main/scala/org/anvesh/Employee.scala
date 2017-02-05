package org.anvesh

class Employee (var name:String,var id:Int){
  
  var salary:Int = 5000
  
  def isEmpVeteren(criteria:Int):Boolean={
    id > criteria
  }
  
  def increaseSal(increment:Int):Int = {
    salary = salary + increment
    salary
  }
  
  override def toString:String={
    name
  }
}


case class Worker(name:String,id:Int,category:String)


