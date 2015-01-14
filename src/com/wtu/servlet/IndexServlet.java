package com.wtu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wtu.dao.FlinkDAO;
import com.wtu.dao.NewsViewDAO;
import com.wtu.vo.Flink;
import com.wtu.vo.NewsView;

public class IndexServlet extends HttpServlet {

	private NewsViewDAO nvdao= null;
	private FlinkDAO fldao = null;
	/**
	 * Constructor of the object.
	 */
	public IndexServlet() {
		nvdao = new NewsViewDAO();
		fldao = new FlinkDAO();
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

		List<NewsView> lst1 = nvdao.findXYXW();
		List<NewsView> lst2 = nvdao.findXYDT();
		List<NewsView> lst3 = nvdao.findXGDT();
		List<NewsView> lst4 = nvdao.findTZGG();
		
		List<Flink> flst1 = fldao.find_link_one();
		List<Flink> flst2 = fldao.find_link_two();
		List<Flink> flst3 = fldao.find_link_three();
		
		request.setAttribute("list1",lst1);
		request.setAttribute("list2",lst2);
		request.setAttribute("list3",lst3);
		request.setAttribute("list4",lst4);
		
		request.getSession().setAttribute("flst1", flst1);
		request.getSession().setAttribute("flst2", flst2);
		request.getSession().setAttribute("flst3", flst3);
		
//		request.setAttribute("flst1",flst1);
//		request.setAttribute("flst2",flst2);
//		request.setAttribute("flst3",flst3);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
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
