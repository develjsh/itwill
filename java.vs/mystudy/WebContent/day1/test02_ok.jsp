<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>test02_ok.jsp</title>
</head>
<body>
<%
	//test02.jsp���� post������� ����Ե�
	
	//��û �Ķ���Ϳ� ���� �ѱ� ���ڵ� ó��
	request.setCharacterEncoding("euc-kr");

	//��û �Ķ���� �о����(����ڰ� �Է��� ��)
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	String agree=request.getParameter("agree");
	String[] pet=request.getParameterValues("pet");
	
	String petStr="";
	if(pet!=null){
		for(int i=0;i<pet.length;i++){
			petStr+=pet[i]+" ";
		}
	}
%>
<h1>��û �Ķ���� ��</h1>
<p>�̸� : <%=name %></p>
<p>�ּ� : <%=address  %></p>
<p>���ǿ��� : <%=agree %></p>
<p>���� : <%=petStr %></p>
</body>
</html>






