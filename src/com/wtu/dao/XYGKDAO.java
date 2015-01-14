package com.wtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wtu.utl.DBHelper;
import com.wtu.vo.NewsView;

public class XYGKDAO {
	
	private ResultSet rs;
	private Connection conn;
	private PreparedStatement pstm;
	
	private String strSql = null;
	
	private static final int pageSize = 12;
	
	public List<NewsView> findByPage(int pageIndex,String ncname){
		List<NewsView> lst = new ArrayList<NewsView>();
		conn = DBHelper.getConn();
		strSql = "select * from newsview where ncname = ? and nstate = 2 order by nid desc limit "+(pageIndex-1)*12+","+pageSize;
		try {
			pstm = conn.prepareStatement(strSql);
			pstm.setString(1, ncname);
			//pstm.setInt(0,(pageIndex-1)*12);
			//pstm.setInt(1,12);
			rs = pstm.executeQuery();
			while(rs.next()){
				NewsView nvvo = new NewsView();
				nvvo.setNcid(rs.getInt("ncid"));
				nvvo.setNcname(rs.getString("ncname"));
				nvvo.setNcontent(rs.getString("ncontent"));
				nvvo.setNcount(rs.getInt("ncount"));
				nvvo.setNid(rs.getInt("nid"));
				nvvo.setNpicUrl(rs.getString("npicurl"));
				nvvo.setNsource(rs.getString("nsource"));
				nvvo.setNstate(rs.getInt("nstate"));
				nvvo.setNtime(rs.getString("ntime"));
				nvvo.setNuploadUrl(rs.getString("nuploadurl"));
				nvvo.setNtitle(rs.getString("ntitle"));
				lst.add(nvvo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBHelper.close(rs, conn, pstm);
		}
		
		return lst;
	}
	
	public List<NewsView> findAll(String ncname){
		List<NewsView> lst = new ArrayList<NewsView>();
		conn = DBHelper.getConn();
		strSql = "select * from newsview where ncname = ? and nstate = 2";
		try {
			pstm = conn.prepareStatement(strSql);
			pstm.setString(1,ncname);
			rs = pstm.executeQuery();
			while(rs.next()){
				NewsView nvvo = new NewsView();
				nvvo.setNcid(rs.getInt("ncid"));
				nvvo.setNcname(rs.getString("ncname"));
				nvvo.setNcontent(rs.getString("ncontent"));
				nvvo.setNcount(rs.getInt("ncount"));
				nvvo.setNid(rs.getInt("nid"));
				nvvo.setNpicUrl(rs.getString("npicurl"));
				nvvo.setNsource(rs.getString("nsource"));
				nvvo.setNstate(rs.getInt("nstate"));
				nvvo.setNtime(rs.getString("ntime"));
				nvvo.setNuploadUrl(rs.getString("nuploadurl"));
				nvvo.setNtitle(rs.getString("ntitle"));
				lst.add(nvvo);
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
