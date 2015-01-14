package com.wtu.utl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHelper {

	private static final String DIRVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/mcs";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	static {
		try {
			Class.forName(DIRVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConn(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(ResultSet rs ,Connection conn ,PreparedStatement pstm){
		try {
			if(rs!=null){
				rs.close();
			}
			if(conn!=null){
				conn.close();
			}
			if(pstm!=null){
				pstm.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		System.out.println(DBHelper.getConn());
//	}
}
