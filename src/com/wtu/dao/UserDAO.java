package com.wtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wtu.utl.DBHelper;
import com.wtu.vo.User;

public class UserDAO {

	private ResultSet rs;
	private Connection conn;
	private PreparedStatement pstm;

	private String strSql = null;

	public User login(String uname, String upwd) {
		User user = new User();
		conn = DBHelper.getConn();
		strSql = "select * from user where uname=? and upwd = ?";
		try {
			pstm = conn.prepareStatement(strSql);
			pstm.setString(1, uname);
			pstm.setString(2, upwd);

			rs = pstm.executeQuery();
			while (rs.next()) {
				user.setUid(rs.getInt("uid"));
				user.setUname(rs.getString("uname"));
				user.setUpwd(rs.getString("upwd"));
				user.setUcategory(rs.getString("ucategory"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBHelper.close(rs, conn, pstm);
		}

		return user;
	}

	public List<User> findAll() {
		List<User> lst = new ArrayList<User>();
		conn = DBHelper.getConn();
		strSql = "select * from user";
		try {
			pstm = conn.prepareStatement(strSql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setUid(rs.getInt("uid"));
				user.setUname(rs.getString("uname"));
				user.setUpwd(rs.getString("upwd"));
				user.setUcategory(rs.getString("ucategory"));
				lst.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBHelper.close(rs, conn, pstm);
		}
		return lst;
	}
	
	public boolean insertUser(User uvo) {
		boolean flag = false;
		conn = DBHelper.getConn();
		strSql = "insert into user (uname,upwd,ucategory)values(?,?,?)";
		try {
			pstm = conn.prepareStatement(strSql);
			pstm.setString(1,uvo.getUname());
			pstm.setString(2, uvo.getUpwd());
			pstm.setInt(3, Integer.parseInt(uvo.getUcategory()));
			int i = pstm.executeUpdate();
			if(i>0){
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBHelper.close(rs, conn, pstm);
		}
		return flag;
	}
	
	public boolean delUser(int uid) {
		boolean flag = false;
		conn = DBHelper.getConn();
		strSql = "delete from user where uid = ?";
		try {
			pstm = conn.prepareStatement(strSql);
			pstm.setInt(1,uid);
			int i = pstm.executeUpdate();
			if(i>0){
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBHelper.close(rs, conn, pstm);
		}
		return flag;
	}

}
