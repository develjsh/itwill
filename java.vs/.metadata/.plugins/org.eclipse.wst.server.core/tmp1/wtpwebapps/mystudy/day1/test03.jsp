<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>test03.jsp</title>
</head>
<body>
	<%
		//test02.jsp���� get������� �̵���
		//=> http://localhost:9090/mystudy/day1/test03.jsp?no=7&name=ȫ�浿
		//��û �Ķ���� �о����
		String no=request.getParameter("no");
		String name=request.getParameter("name");
		
	%>
	<h1>get���</h1>
	<h2>��û �Ķ���� ��</h2>
	<p>��ȣ : <%=no %></p>
	<p>�̸� : <%=name %></p>
	
</body>
</html>








