package org.anvesh

import java.sql._
import scala.Array
import com.typesafe.config._

object EmpComission {

  def main(args: Array[String]): Unit = {
    println("EmpComission.main()	:	I am trying to establish connection with MySQL ")
    var con: Connection = null
    var stmt: Statement = null
    var rs: ResultSet = null

    try {

      val config = ConfigFactory.load("appconfig.conf").getConfig("LocalConf.DBConnectionData")
      var HOST: String = config.getString("HOST")
      val DATABASE: String = config.getString("DATABASE")
      val USER_NAME: String = config.getString("USER_NAME")
      val PASSWORD: String = config.getString("PASSWORD")
      val connctString = HOST + DATABASE + "," + USER_NAME + "," + PASSWORD
      //println("The connect String parameters are: "+connectString) 

      con = DriverManager.getConnection(HOST + DATABASE, USER_NAME, PASSWORD)

      //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "anvesh");
      stmt = con.createStatement()
      rs = stmt.executeQuery("select employee_id,first_name,last_name,IFNULL((salary * commission_pct),0.00) Commission from employees")

      var cnt = 0
      Iterator.continually((rs, rs.next())).takeWhile(_._2).map(_._1).map(rs => {
        EmpComissionClass(rs.getInt("employee_id"),
          rs.getString("first_name"),
          rs.getString("last_name"),
          rs.getDouble("Commission"))
      }).foreach(rec => {
        cnt = cnt + 1
        println("Record : " + cnt + " => " + rec)
      })

      println("The total Count is : " + cnt)

    } catch {
      case e: Exception => println("ScalaRDBMSDemo.dbConnect()	:	exception caught: " + e.getMessage)

    } finally {
      println("ScalaRDBMSDemo.dbConnect()	:	Finally after all exceptions are handles ..")
    }
  }

}

case class EmpComissionClass(employee_id: Int,
    first_name: String,
    last_name: String,
    commission: Double) {

  override def toString(): String = {
    val empString: String = "FirstName : " + first_name + ", LastName : " + last_name + " his Commission = " + commission
    empString
  }
}