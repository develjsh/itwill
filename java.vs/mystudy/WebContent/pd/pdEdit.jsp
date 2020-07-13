<%@page import="com.mystudy.pd.model.PdDTO"%>
<%@page import="com.mystudy.pd.model.PdDAO"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdEdit.jsp</title>
</head>
<body>
<%
	//pdDetail.jsp ���� [����]Ŭ���ϸ� get������� �̵�
	//=> http://localhost:9090/mystudy/pd/pdEdit.jsp?no=3
	//1. ��û �Ķ���� �о����
	String no=request.getParameter("no");
	
	//2 db�۾�
	PdDAO dao = new PdDAO();
	PdDTO dto=null;
	try{
		dto=dao.selectByNo(Integer.parseInt(no));
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	//3 ��� ó��
%>
<h1>��ǰ ����</h1>
<form name="frmWrite" method="post" action="pdEdit_ok.jsp">
	<!-- ������  no�� �ʿ��ϹǷ� hidden �ʵ忡 �־ �ѱ�� -->
	<input type="hidden" name="no" value="<%=no%>">
	
	<label for="pdName">��ǰ��</label>
	<input type="text" name="pdName" id="pdName" 
		value="<%=dto.getPdName()%>"><br>
	<label for="price">����</label>
	<input type="text" name="price" id="price"
		value="<%=dto.getPrice()%>">
	<br><br>
	<input type="submit" value="����">
	<input type="reset" value="���">	
</form>
<hr>
<a href="pdList.jsp">��ǰ ���</a>	

</body>
</html>