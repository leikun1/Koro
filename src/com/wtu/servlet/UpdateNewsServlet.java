package com.wtu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.wtu.dao.NewsDAO;
import com.wtu.vo.News;

public class UpdateNewsServlet extends HttpServlet {

	private NewsDAO ndao = null;
	/**
	 * Constructor of the object.
	 */
	public UpdateNewsServlet() {
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

		String nid = request.getParameter("nid");
		News nvo = ndao.findById(nid);
		request.setAttribute("nvo", nvo);
		request.getRequestDispatcher("/WEB-INF/update.jsp").forward(request, response);
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

		String nid = request.getParameter("id");
		String title =new String( request.getParameter("title").getBytes("iso-8859-1"),"utf-8");
		String content = new String(request.getParameter("content1").getBytes("iso-8859-1"),"utf-8");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String currentTime = df.format(new Date());
		
		News nvo = new News();
		nvo.setNid(Integer.parseInt(nid));
		nvo.setNcontent(content);
		nvo.setNtitle(title);
		nvo.setNtime(currentTime);
		
		if(ndao.updateById(nvo)){
			JOptionPane.showMessageDialog(null, "修改成功");
			request.getRequestDispatcher("SelectListServlet").forward(request, response);
		}else {
			JOptionPane.showMessageDialog(null, "修改失败");
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
