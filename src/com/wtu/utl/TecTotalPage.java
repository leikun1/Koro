package com.wtu.utl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TecTotalPage {
	
	private ResultSet rs;
	private Connection conn;
	private PreparedStatement pstm;
	
	private String strSql = null;
	
	private static final int pageSize = 12;
	
	public int findAll(){
		int count = 0;
		conn = DBHelper.getConn();
		strSql = "select count(*) from teacher";
		try {
			pstm = conn.prepareStatement(strSql);
			rs = pstm.executeQuery();
			
			while(rs.next()){
				count = rs.getRow();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}
	
	public static int getTotalPage(){
		int totalPage = 0;
		int count =  new TecTotalPage().findAll();
		if(count%pageSize==0){
			totalPage = count/pageSize;
		}else{
			totalPage = count/pageSize+1;
		}
		return totalPage;
	}


}
