package com.wtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wtu.utl.DBHelper;
import com.wtu.vo.Teacher;

public class TecDAO {
	
	private ResultSet rs;
	private Connection conn;
	private PreparedStatement pstm;
	
	private String strSql = null;
	
	public boolean insertTec(Teacher tvo){
		boolean flag = false;
		conn = DBHelper.getConn();
		strSql = "insert into teacher (tname,tjob,tprief,tmajor,tdate)values(?,?,?,?,?)";
		try {
			pstm = conn.prepareStatement(strSql);
			pstm.setString(1,tvo.getTname());
			pstm.setString(2,tvo.getTjob());
			pstm.setString(3,tvo.getTprief());
			pstm.setInt(4, tvo.getTmajor());
			pstm.setString(5, tvo.getTdate());
			int i = pstm.executeUpdate();
			if(i>0){
				flag = true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}
