package com.websystique.springboot;


import java.sql.*;

import javax.xml.transform.Result;


public class connect {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","demo","abcd");
			Statement st = con.createStatement();
			String sql ="select * from DEMO";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
				System.out.println(rs.getString(1)+rs.getString(2));
				
			con.close();
		}
		 catch (Exception e) {
			// TODO: handle exception
		}
}
}


