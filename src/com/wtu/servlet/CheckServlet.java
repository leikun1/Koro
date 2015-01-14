package com.wtu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wtu.dao.NewsDAO;
import com.wtu.dao.NewsViewDAO;
import com.wtu.vo.NewsView;

public class CheckServlet extends HttpServlet {
	
	private NewsViewDAO nvdao = null;
	private NewsDAO ndao = null;

	/**
	 * Constructor of the object.
	 */
	public CheckServlet() {
		nvdao = new NewsViewDAO();
		ndao = new NewsDAO();
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

		doPost(request,response);
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
		
		String nid = request.getParameter("nid");
		String nstate = request.getParameter("nstate");
		if(nstate == null){
			NewsView nvo = new NewsView();
			nvo = nvdao.findById(Integer.parseInt(nid));
			request.setAttribute("nvo", nvo);
			request.getRequestDispatcher("/WEB-INF/check.jsp").forward(request, response);
		}else {
			if(ndao.updateState(nid, nstate)){
				request.getRequestDispatcher("ManagerServlet").forward(request, response);
			}else {
				request.getRequestDispatcher("ManagerServlet").forward(request, response);
			}
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
