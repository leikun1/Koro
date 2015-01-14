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
		
		if(ncname.equals("ʦ�ʶ���")){
			request.getRequestDispatcher("szdw.jsp").forward(request, response);
		}else if(ncname.equals("����������")||ncname.equals("�о�������")||ncname.equals("ʵ���ѧ")){
			request.getRequestDispatcher("rcpy.jsp").forward(request, response);
		}else if(ncname.equals("������Ŀ")||ncname.equals("ѧ������")||ncname.equals("���ؽ���")){
			request.getRequestDispatcher("kxyj.jsp").forward(request, response);
		}else if(ncname.equals("��֯�ܹ�")||ncname.equals("��Ա���")||ncname.equals("����֯�")){
			request.getRequestDispatcher("djgz.jsp").forward(request, response);
		}else if(ncname.equals("ѧ����")||ncname.equals("ѧ����̬")){
			request.getRequestDispatcher("xsgz.jsp").forward(request, response);
		}else if(ncname.equals("����������")||ncname.equals("�о�������")||ncname.equals("��ҵ��Ϣ")){
			request.getRequestDispatcher("zsjy.jsp").forward(request, response);
		}else if(ncname.equals("��ѧ")||ncname.equals("����")||ncname.equals("����")){
			request.getRequestDispatcher("gzzd.jsp").forward(request, response);
		}else if(ncname.equals("У�Ѷ�̬")||ncname.equals("У�ѷ��")||ncname.equals("У������")){
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
