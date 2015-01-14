package com.wtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wtu.utl.DBHelper;
import com.wtu.vo.Teacher;

public class SZDWDAO {

	private ResultSet rs;
	private Connection conn;
	private PreparedStatement pstm;

	private String strSql = null;

	private static final int pageSize = 12;

	public List<Teacher> findByPage(int pageIndex, int major) {
		List<Teacher> lst = new ArrayList<Teacher>();
		conn = DBHelper.getConn();
		strSql = "select * from Teacher where tmajor = ? order by tid desc limit "
				+ (pageIndex - 1) * 12 + "," + pageSize;
		try {
			pstm = conn.prepareStatement(strSql);
			pstm.setInt(1, major);
			rs = pstm.executeQuery();
			while (rs.next()) {
				Teacher tvo = new Teacher();
				tvo.setTid(rs.getInt("tid"));
				tvo.setTjob(rs.getString("tjob"));
				tvo.setTemail(rs.getString("temail"));
				tvo.setTmajor(rs.getInt("tmajor"));
				tvo.setTname(rs.getString("tname"));
				tvo.setTdate(rs.getString("tdate"));
				tvo.setTprief(rs.getString("tprief"));
				lst.add(tvo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBHelper.close(rs, conn, pstm);
		}

		return lst;
	}

	public Teacher findById(int tid) {
		Teacher tvo = new Teacher();
		conn = DBHelper.getConn();
		strSql = "select * from Teacher where tid=?";
		try {
			pstm = conn.prepareStatement(strSql);
			pstm.setInt(1, tid);
			rs = pstm.executeQuery();
			while (rs.next()) {

				tvo.setTid(rs.getInt("tid"));
				tvo.setTjob(rs.getString("tjob"));
				tvo.setTemail(rs.getString("temail"));
				tvo.setTmajor(rs.getInt("tmajor"));
				tvo.setTname(rs.getString("tname"));
				tvo.setTdate(rs.getString("tdate"));
				tvo.setTprief(rs.getString("tprief"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBHelper.close(rs, conn, pstm);
		}

		return tvo;
	}

}
