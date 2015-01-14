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
		if(ncname.equals("ʦ�ʶ���")){
			request.getRequestDispatcher("szdwContent.jsp").forward(request, response);
		}else if(ncname.equals("����������")||ncname.equals("�о�������")||ncname.equals("ʵ���ѧ")){
			request.getRequestDispatcher("rcpyContent.jsp").forward(request, response);
		}else if(ncname.equals("������Ŀ")||ncname.equals("ѧ������")||ncname.equals("���ؽ���")){
			request.getRequestDispatcher("kxyjContent.jsp").forward(request, response);
		}else if(ncname.equals("��֯�ܹ�")||ncname.equals("��Ա���")||ncname.equals("����֯�")){
			request.getRequestDispatcher("djgzContent.jsp").forward(request, response);
		}else if(ncname.equals("ѧ����")||ncname.equals("ѧ����̬")){
			request.getRequestDispatcher("xsgzContent.jsp").forward(request, response);
		}else if(ncname.equals("����������")||ncname.equals("�о�������")||ncname.equals("��ҵ��Ϣ")){
			request.getRequestDispatcher("zsjyContent.jsp").forward(request, response);
		}else if(ncname.equals("��ѧ")||ncname.equals("����")||ncname.equals("����")){
			request.getRequestDispatcher("gzzdContent.jsp").forward(request, response);
		}else if(ncname.equals("У�Ѷ�̬")||ncname.equals("У�ѷ��")||ncname.equals("У������")){
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
