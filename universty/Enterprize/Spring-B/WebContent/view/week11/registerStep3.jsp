<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p>
		<strong>${registerRequest.name}��</strong>ȸ�������� �Ϸ��Ͽ����ϴ�.
	</p>
	<p>
		<a href=<c:url value='/main'/>">[ù ȭ�� �̵�]></a>
	</p>
</body>
</html>