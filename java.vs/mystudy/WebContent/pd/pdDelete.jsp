<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdDelete.jsp</title>
</head>
<body>
<%
	//pdDetail.jsp���� [����]Ŭ���ϸ� get������� �̵�
	//=> http://localhost:9090/mystudy/pd/pdDelete.jsp?no=2
	//1. ��û �Ķ���� �о����
	String no=request.getParameter("no");
	
	//2 db�۾�
	PdDAO dao=new PdDAO();
	try{
		int cnt=dao.deletePd(Integer.parseInt(no));
		
		//3 ��� ó��
		if(cnt>0){
			System.out.println("��ǰ ���� ����");
			response.sendRedirect("pdList.jsp");
		}else{
			System.out.println("��ǰ ���� ����");			
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	
%>
</body>
</html>