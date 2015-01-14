package com.wtu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wtu.dao.SZDWDAO;
import com.wtu.dao.XYGKDAO;
import com.wtu.utl.TecTotalPage;
import com.wtu.utl.TotalPage;
import com.wtu.vo.NewsView;
import com.wtu.vo.Teacher;

public class SZDWServlet extends HttpServlet {

	private SZDWDAO szdwdao = null;

	/**
	 * Constructor of the object.
	 */
	public SZDWServlet() {
		szdwdao = new SZDWDAO();
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
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String tid = request.getParameter("id");
		String major = request.getParameter("major");
		String indexPage = (String) request.getParameter("pageIndex");
		if(tid == null){
			int pageIndex;
			if (indexPage == null) {
				pageIndex = 1;
			} else {
				pageIndex = Integer.parseInt(indexPage);
			}

			List<Teacher> lst = szdwdao.findByPage(pageIndex,
					Integer.parseInt(major));

			request.setAttribute("lst", lst);

			request.setAttribute("pageIndex", pageIndex);
			request.setAttribute("totalPage", TecTotalPage.getTotalPage());
			String ncname = null;
			if (Integer.parseInt(major) == 1) {
				ncname = "计算机系";
			} else {
				ncname = "数学系";
			}
			request.setAttribute("ncname", ncname);

			request.getRequestDispatcher("/szdw.jsp").forward(request, response);
		}else {
			Teacher tvo = szdwdao.findById(Integer.parseInt(tid));
			request.setAttribute("tvo", tvo);
			String ncname = null;
			if (tvo.getTmajor() == 1) {
				ncname = "计算机系";
			} else {
				ncname = "数学系";
			}
			request.setAttribute("ncname", ncname);
			request.getRequestDispatcher("/szdwContent.jsp").forward(request, response);
		}
		
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
