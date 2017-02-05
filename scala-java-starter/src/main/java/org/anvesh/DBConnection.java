package org.anvesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	/**
	 * @param args
	 */
	static Connection con;
	static Statement st;
	static ResultSet rs;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "anvesh");
			st = con.createStatement();
			rs = st.executeQuery("select * from countries");
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (st != null) {
				try {
					st.close();
				} catch (SQLException sqlEx) {
				} // ignore

				st = null;
			}
		}
	}

}
