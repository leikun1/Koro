package com.wtu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.wtu.dao.UserDAO;
import com.wtu.vo.User;

public class AddUserServlet extends HttpServlet {

	private UserDAO udao = null;
	/**
	 * Constructor of the object.
	 */
	public AddUserServlet() {
		udao = new UserDAO();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/addUser.jsp").forward(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		String select = request.getParameter("select");
		if(select == null){
			select = "1";
		}
		User uvo = new User();
		uvo.setUname(name);
		uvo.setUpwd(upwd);
		uvo.setUcategory(select);
		
		if(udao.insertUser(uvo)){
			JOptionPane.showMessageDialog(null, "Ìí¼Ó³É¹¦!");
			request.getRequestDispatcher("UserServlet").forward(request, response);
		}else {
			request.getRequestDispatcher("UserServlet").forward(request, response);
		}
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
