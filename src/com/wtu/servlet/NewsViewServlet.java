package com.wtu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wtu.dao.NewsViewDAO;
import com.wtu.vo.NewsView;

public class NewsViewServlet extends HttpServlet {
	
	private NewsViewDAO nvdao = null;

	/**
	 * Constructor of the object.
	 */
	public NewsViewServlet() {
		nvdao = new NewsViewDAO();
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

		NewsView nvvo = new NewsView();
		String ncid = request.getParameter("nid");
		String ncname = new String(request.getParameter("ncname").getBytes("iso-8859-1"),"utf-8");
		if(ncid==null){
			nvvo = nvdao.findByNname(ncname);
		}else {
			nvvo = nvdao.findById(Integer.parseInt(ncid));
		}
		request.setAttribute("nvvo", nvvo);
		request.setAttribute("ncname", ncname);
		if(ncname.equals("师资队伍")){
			request.getRequestDispatcher("szdwContent.jsp").forward(request, response);
		}else if(ncname.equals("本科生教育")||ncname.equals("研究生教育")||ncname.equals("实验教学")){
			request.getRequestDispatcher("rcpyContent.jsp").forward(request, response);
		}else if(ncname.equals("科研项目")||ncname.equals("学术论文")||ncname.equals("基地建设")){
			request.getRequestDispatcher("kxyjContent.jsp").forward(request, response);
		}else if(ncname.equals("组织架构")||ncname.equals("党员风采")||ncname.equals("党组织活动")){
			request.getRequestDispatcher("djgzContent.jsp").forward(request, response);
		}else if(ncname.equals("学生会")||ncname.equals("学工动态")){
			request.getRequestDispatcher("xsgzContent.jsp").forward(request, response);
		}else if(ncname.equals("本科生招生")||ncname.equals("研究生招生")||ncname.equals("就业信息")){
			request.getRequestDispatcher("zsjyContent.jsp").forward(request, response);
		}else if(ncname.equals("教学")||ncname.equals("科研")||ncname.equals("财务")){
			request.getRequestDispatcher("gzzdContent.jsp").forward(request, response);
		}else if(ncname.equals("校友动态")||ncname.equals("校友风采")||ncname.equals("校友留言")){
			request.getRequestDispatcher("xyhContent.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("xygkContent.jsp").forward(request, response);
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
