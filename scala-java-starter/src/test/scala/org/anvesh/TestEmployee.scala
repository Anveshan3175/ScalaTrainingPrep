package org.anvesh

object TestEmployee {
  
  def main(args:Array[String]){
    //val emp = new Employee("Anvesh",500)
    val emp:Employee = new Employee("Anvesh",500)
    println(emp)
    println("Is "+emp.name+ " old ? "+emp.isEmpVeteren(600))
  }
}