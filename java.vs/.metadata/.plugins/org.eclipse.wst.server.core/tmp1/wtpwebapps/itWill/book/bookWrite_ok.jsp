<%@page import="com.itWill.book.model.bookDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	//bookWrite���� [���]�� Ŭ���Ͽ� post������� �̵�
	//�ѱ� �Է� �����ϰ� �����
	request.setCharacterEncoding("euc-kr");

	//1.
	String name = request.getParameter("bookName");
	String price =request.getParameter("price");
	String publisher=request.getParameter("publisher");
	
	
	//2.db�۾�
	bookDAO dao = new bookDAO();
	dao.insertBook(dto)
	
	//3.��� ó��
%>

</body>
</html>