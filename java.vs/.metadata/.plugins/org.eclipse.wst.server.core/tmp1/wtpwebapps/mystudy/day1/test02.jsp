<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>request ��ü ����</h1> 
<form action="test02_ok.jsp" method="post">
�̸�: <input type="text" name="name" > <br>
�ּ�: <input type="text" name="address" > <br>
�����ϴ� ����:
	<input type="checkbox" name="pet" value="dog">������
	<input type="checkbox" name="pet" value="cat">�����
	<input type="checkbox" name="pet" value="pig">����
	�����մϴ�<input type="checkbox" name="agree">
	<br><br>
	<input type="submit" value="����">
</form> <br>
<a href="test03.jsp?no=7&name=ȫ�浿">test03 �������� �̵��ϱ�</a>
</body>
</html>