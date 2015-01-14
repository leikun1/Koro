package com.wtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wtu.utl.DBHelper;
import com.wtu.vo.NewsView;

public class NewsViewDAO {

	private ResultSet rs;
	private Connection conn;
	private PreparedStatement pstm;

	private String strSql = null;

	public List<NewsView> findXYXW() {
		List<NewsView> lst = new ArrayList<NewsView>();
		conn = DBHelper.getConn();

		strSql = "select * from newsview where ncname = '学院新闻' and nstate = 2 order by nid desc limit 0,7";
		try {
			pstm = conn.prepareStatement(strSql);
			rs = pstm.executeQuery();
			while (rs.next()) {
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

	public List<NewsView> findXYDT() {
		List<NewsView> lst = new ArrayList<NewsView>();
		conn = DBHelper.getConn();

		strSql = "select * from newsview where ncname = '学术动态' and nstate = 2 order by nid desc limit 0,7";
		try {
			pstm = conn.prepareStatement(strSql);
			rs = pstm.executeQuery();
			while (rs.next()) {
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

	public List<NewsView> findXGDT() {
		List<NewsView> lst = new ArrayList<NewsView>();
		conn = DBHelper.getConn();

		strSql = "select * from newsview where ncname = '学工动态' and nstate = 2 order by nid desc limit 0,7";
		try {
			pstm = conn.prepareStatement(strSql);
			rs = pstm.executeQuery();
			while (rs.next()) {
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

	public List<NewsView> findTZGG() {
		List<NewsView> lst = new ArrayList<NewsView>();
		conn = DBHelper.getConn();

		strSql = "select * from newsview where ncname = '通知公告' and nstate = 2 order by nid desc limit 0,5";
		try {
			pstm = conn.prepareStatement(strSql);
			rs = pstm.executeQuery();
			while (rs.next()) {
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

	public NewsView findById(int ncid) {
		NewsView nvvo = new NewsView();

		conn = DBHelper.getConn();

		strSql = "select * from newsview where nid = ?";
		try {
			pstm = conn.prepareStatement(strSql);
			pstm.setInt(1, ncid);
			rs = pstm.executeQuery();
			while (rs.next()) {
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
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBHelper.close(rs, conn, pstm);
		}
		return nvvo;
	}
	
	public List<NewsView> findByNCname(String ncname) {
		List<NewsView> lst = new ArrayList<NewsView>();
		conn = DBHelper.getConn();

		strSql = "select * from newsview where ncname = ? and nstate = 2 order by nid desc limit 0,5";
		try {
			pstm = conn.prepareStatement(strSql);
			pstm.setString(1,ncname);
			rs = pstm.executeQuery();
			while (rs.next()) {
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
	
	public NewsView findByNname(String ncname) {
		NewsView nvvo = new NewsView();
		conn = DBHelper.getConn();

		strSql = "select * from newsview where ncname = ? and nstate = 2";
		try {
			pstm = conn.prepareStatement(strSql);
			pstm.setString(1,ncname);
			rs = pstm.executeQuery();
			while (rs.next()) {
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
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBHelper.close(rs, conn, pstm);
		}
		return nvvo;
	}
	
	public List<NewsView> findAll() {
		List<NewsView> lst = new ArrayList<NewsView>();
		conn = DBHelper.getConn();
		strSql = "select * from newsview where nstate != 2 ";
		try {
			pstm = conn.prepareStatement(strSql);
			rs = pstm.executeQuery();
			while (rs.next()) {
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
	
	public List<NewsView> findByNCid(int ncid) {
		List<NewsView> lst = new ArrayList<NewsView>();
		conn = DBHelper.getConn();
		strSql = "select * from newsview where ncid = ?";
		try {
			pstm = conn.prepareStatement(strSql);
			pstm.setInt(1,ncid);
			rs = pstm.executeQuery();
			while (rs.next()) {
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
