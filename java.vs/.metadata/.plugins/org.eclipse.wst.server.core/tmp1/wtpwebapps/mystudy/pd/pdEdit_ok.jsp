<%@page import="com.mystudy.pd.model.PdDTO"%>
<%@page import="com.mystudy.pd.model.PdDAO"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdEdit_ok.jsp</title>
</head>
<body>
<%
	//pdEdit.jsp���� post������� ����Ե�
	//1. ��û �Ķ���� �о����
	//��û �Ķ���Ϳ� ���� �ѱ� ���ڵ� ó��
	request.setCharacterEncoding("euc-kr");

	String pdname=request.getParameter("pdName");
	String price=request.getParameter("price");
	String no=request.getParameter("no");
	
	//2 db�۾�
	PdDAO dao=new PdDAO();
	try{
		PdDTO dto = new PdDTO();
		dto.setPdName(pdname);
		dto.setPrice(Integer.parseInt(price));
		dto.setNo(Integer.parseInt(no));
		
		int cnt=dao.updatePd(dto);
		
		//3 ��� ó��
		if(cnt>0){
			System.out.println("��ǰ ���� ����");
			response.sendRedirect("pdDetail.jsp?no="+no);
		}else{
			System.out.println("��ǰ ���� ����");			
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	
%>


</body>
</html>