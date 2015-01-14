package com.wtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wtu.utl.DBHelper;
import com.wtu.vo.NewsCategory;

public class NewsCategoryDAO {
	
	private ResultSet rs;
	private Connection conn;
	private PreparedStatement pstm;
	
	private String strSql = null;
	
	public List<NewsCategory> findAll(){
		List<NewsCategory> lst = new ArrayList<NewsCategory>();
		conn = DBHelper.getConn();
		strSql = "select * from newscategory";
		try {
			pstm = conn.prepareStatement(strSql);
			rs = pstm.executeQuery();
			
			while(rs.next()){
				NewsCategory ncvo = new NewsCategory();
				ncvo.setNcid(rs.getInt("ncid"));
				ncvo.setNcname(rs.getString("ncname"));
				ncvo.setNremark(rs.getString("nremark"));
				
				lst.add(ncvo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBHelper.close(rs, conn, pstm);
		}
		
		return lst;
	}

}
