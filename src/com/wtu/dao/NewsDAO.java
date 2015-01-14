package com.wtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wtu.utl.DBHelper;
import com.wtu.vo.News;

public class NewsDAO {
	
	private ResultSet rs;
	private Connection conn;
	private PreparedStatement pstm;
	
	private String strSql = null;
	
	public boolean Insert(News nvo){
		boolean flag = false;
		conn = DBHelper.getConn();
		strSql = "insert into news (ntitle,ncontent,ntime,nsource,ncid)values(?,?,?,?,?)";
		try {
			pstm = conn.prepareStatement(strSql);
			pstm.setString(1, nvo.getNtitle());
			pstm.setString(2, nvo.getNcontent());
			pstm.setString(3, nvo.getNtime());
			pstm.setString(4, nvo.getNsource());
			pstm.setInt(5,nvo.getNcid());
			
			int i = pstm.executeUpdate();
			if(i>0){
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBHelper.close(rs, conn, pstm);
		}
		
		return flag;
	}
	
	public boolean updateState(String nid,String nstate){
		boolean flag = false;
		conn = DBHelper.getConn();
		strSql = "update news set nstate = ? where nid = ?";
		try {
			pstm = conn.prepareStatement(strSql);
			pstm.setInt(1,Integer.parseInt(nstate));
			pstm.setInt(2,Integer.parseInt(nid));
			int i = pstm.executeUpdate();
			if(i>0){
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBHelper.close(rs, conn, pstm);
		}
		
		return flag;
	}
	
	public News findById(String nid){
	News nvo = new News();
	conn = DBHelper.getConn();
	strSql = "select * from news where nid = ?";
	try {
		pstm = conn.prepareStatement(strSql);
		pstm.setInt(1,Integer.parseInt(nid));
		rs = pstm.executeQuery();
		while(rs.next()){
			nvo.setNid(rs.getInt("nid"));
			nvo.setNtime(rs.getString("ntime"));
			nvo.setNtitle(rs.getString("ntitle"));
			nvo.setNstate(rs.getInt("nstate"));
			nvo.setNcontent(rs.getString("ncontent"));
			nvo.setNcid(rs.getInt("ncid"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		DBHelper.close(rs, conn, pstm);
	}
	
	return nvo;
}
	
	public boolean updateById(News nvo){
		boolean flag = false;
		conn = DBHelper.getConn();
		strSql = "update news set ntitle = ?,ncontent = ?,ntime = ? where nid = ?";
		try {
			pstm = conn.prepareStatement(strSql);
			pstm.setString(1,nvo.getNtitle());
			pstm.setString(2,nvo.getNcontent());
			pstm.setString(3, nvo.getNtime());
			pstm.setInt(4, nvo.getNid());
			int i = pstm.executeUpdate();
			if(i>0){
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBHelper.close(rs, conn, pstm);
		}
		
		return flag;
	}

}
