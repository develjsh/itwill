package com.mystudy.pd.serv;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy.pd.model.PdDAO;
import com.mystudy.pd.model.PdDTO;


//@WebServlet("/DeleteServ")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//detailServlet.java���� get ������� �̵�
		//=> http://localhost:9090/mystudy/DeleteServ?no=7
		 response.setContentType("text/html;charset=euc-kr");
		//1 �Ķ���� �о����
		 String no = request.getParameter("no");
		 
		//2
		 PdDAO dao = new PdDAO();
		 PdDTO dto=null;
		 try {
			int cnt = dao.deletePd(Integer.parseInt(no));
			
			//3
			if(cnt>0) {
				System.out.println("���� ����");
				response.sendRedirect("/mystudy/ListServ");
			}else {
				System.out.println("���� ����");
				
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
