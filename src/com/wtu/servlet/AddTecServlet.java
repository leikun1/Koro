package com.wtu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wtu.dao.TecDAO;
import com.wtu.vo.Teacher;

public class AddTecServlet extends HttpServlet {

	private TecDAO tdao = null;
	/**
	 * Constructor of the object.
	 */
	public AddTecServlet() {
		tdao = new TecDAO();
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

		String name =new String( request.getParameter("name").getBytes("iso-8859-1"),"utf-8");
		String job =new String( request.getParameter("job").getBytes("iso-8859-1"),"utf-8");
		String prief =new String( request.getParameter("content1").getBytes("iso-8859-1"),"utf-8");
		String major = request.getParameter("department");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		String currentTime = df.format(new Date());
		
		Teacher tvo = new Teacher();
		tvo.setTname(name);
		tvo.setTjob(job);
		tvo.setTprief(prief);
		tvo.setTmajor(Integer.parseInt(major));
		tvo.setTdate(currentTime);
		
		if(tdao.insertTec(tvo)){
			System.out.println("��ӳɹ���");
		}else {
			System.out.println("���ʧ��");
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
