<%@page import="java.text.DecimalFormat"%>
<%@page import="com.mystudy.pd.model.PdDTO"%>
<%@page import="com.mystudy.pd.model.PdDAO"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//pdList.jsp���� [��ǰ��]Ŭ���ϸ� get������� �̵�
	//=> http://localhost:9090/mystudy/pd/pdDetail.jsp?no=3
	//1. ��û �Ķ���� �о����
	String no=request.getParameter("no");
	
	//2. db�۾�
	PdDAO dao=new PdDAO();
	PdDTO dto=null;
	try{
		dto=dao.selectByNo(Integer.parseInt(no));
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	//3. ��� ó��	
	DecimalFormat df = new DecimalFormat("#,###");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdDetail.jsp</title>
<script type="text/javascript" src="../js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#del").click(function(){
			if(confirm('�����Ͻðڽ��ϱ�?')){
				location.href="pdDelete.jsp?no=<%=no%>";
			}	
		});
		
	});
	
</script>
</head>
<body>

	<h1>��ǰ �󼼺���</h1>
	<p>��ȣ : <%=no %></p>
	<p>��ǰ�� : <%=dto.getPdName() %></p>
	<p>���� : <%=df.format(dto.getPrice()) %>��</p>
	<p>����� : <%=dto.getRegdate() %></p>
	<br><br>
	<a href="pdList.jsp">���</a>
	<a href="pdEdit.jsp?no=<%=no %>">����</a>
	<a href="#" id="del">����</a>
</body>
</html>




