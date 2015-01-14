package com.wtu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wtu.dao.FlinkDAO;
import com.wtu.dao.XYGKDAO;
import com.wtu.utl.TotalPage;
import com.wtu.vo.Flink;
import com.wtu.vo.NewsView;

public class XYGKServlet extends HttpServlet {

	private XYGKDAO xygkdao = null;
	/**
	 * Constructor of the object.
	 */
	public XYGKServlet() {
		xygkdao = new XYGKDAO();
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

		String ncname =new String(request.getParameter("ncname").getBytes("iso-8859-1"),"utf-8");
		String indexPage = (String) request.getParameter("pageIndex");
		int pageIndex;
		if(indexPage == null){
			pageIndex = 1;
		}else {
			pageIndex = Integer.parseInt(indexPage);
		}
		
		List<NewsView> lst = xygkdao.findByPage(pageIndex,ncname);

		request.setAttribute("lst",lst);
		
		request.setAttribute("pageIndex", pageIndex);
		request.setAttribute("totalPage", TotalPage.getTotalPage(ncname));
		request.setAttribute("ncname", ncname);
		
		if(ncname.equals("师资队伍")){
			request.getRequestDispatcher("szdw.jsp").forward(request, response);
		}else if(ncname.equals("本科生教育")||ncname.equals("研究生教育")||ncname.equals("实验教学")){
			request.getRequestDispatcher("rcpy.jsp").forward(request, response);
		}else if(ncname.equals("科研项目")||ncname.equals("学术论文")||ncname.equals("基地建设")){
			request.getRequestDispatcher("kxyj.jsp").forward(request, response);
		}else if(ncname.equals("组织架构")||ncname.equals("党员风采")||ncname.equals("党组织活动")){
			request.getRequestDispatcher("djgz.jsp").forward(request, response);
		}else if(ncname.equals("学生会")||ncname.equals("学工动态")){
			request.getRequestDispatcher("xsgz.jsp").forward(request, response);
		}else if(ncname.equals("本科生招生")||ncname.equals("研究生招生")||ncname.equals("就业信息")){
			request.getRequestDispatcher("zsjy.jsp").forward(request, response);
		}else if(ncname.equals("教学")||ncname.equals("科研")||ncname.equals("财务")){
			request.getRequestDispatcher("gzzd.jsp").forward(request, response);
		}else if(ncname.equals("校友动态")||ncname.equals("校友风采")||ncname.equals("校友留言")){
			request.getRequestDispatcher("xyh.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("xygk.jsp").forward(request, response);
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
