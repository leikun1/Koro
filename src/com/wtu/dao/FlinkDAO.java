package com.wtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wtu.utl.DBHelper;
import com.wtu.vo.Flink;

public class FlinkDAO {
	
	private ResultSet rs;
	private Connection conn;
	private PreparedStatement pstm;
	
	private String strSql = null;
	
	public List<Flink> find_link_one(){
		List<Flink> lst = new ArrayList<Flink>();
		conn = DBHelper.getConn();
		
		strSql = "select * from Flink where fcategory = 1";
		try {
			pstm = conn.prepareStatement(strSql);
			rs = pstm.executeQuery();
			while(rs.next()){
				Flink fvo = new Flink();
				fvo.setFid(rs.getInt("fid"));
				fvo.setFname(rs.getString("fname"));
				fvo.setFurl(rs.getString("furl"));
				fvo.setFcategory(rs.getInt("fcategory"));
				
				lst.add(fvo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBHelper.close(rs, conn, pstm);
		}
		return lst;
	}
	
	public List<Flink> find_link_two(){
		List<Flink> lst = new ArrayList<Flink>();
		conn = DBHelper.getConn();
		
		strSql = "select * from Flink where fcategory = 2";
		try {
			pstm = conn.prepareStatement(strSql);
			rs = pstm.executeQuery();
			while(rs.next()){
				Flink fvo = new Flink();
				fvo.setFid(rs.getInt("fid"));
				fvo.setFname(rs.getString("fname"));
				fvo.setFurl(rs.getString("furl"));
				fvo.setFcategory(rs.getInt("fcategory"));
				
				lst.add(fvo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBHelper.close(rs, conn, pstm);
		}
		return lst;
	}
	
	public List<Flink> find_link_three(){
		List<Flink> lst = new ArrayList<Flink>();
		conn = DBHelper.getConn();
		
		strSql = "select * from Flink where fcategory = 3";
		try {
			pstm = conn.prepareStatement(strSql);
			rs = pstm.executeQuery();
			while(rs.next()){
				Flink fvo = new Flink();
				fvo.setFid(rs.getInt("fid"));
				fvo.setFname(rs.getString("fname"));
				fvo.setFurl(rs.getString("furl"));
				fvo.setFcategory(rs.getInt("fcategory"));
				
				lst.add(fvo);
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
