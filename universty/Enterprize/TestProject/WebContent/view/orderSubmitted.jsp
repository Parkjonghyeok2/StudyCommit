<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p>�ֹ� ���� :</p>
	<ul>
		<c:forEach var="order" items="${orderCommand}"
			varStatus="status">
			<li>�𵨸� : ${order.itemName}</li>
			<li>������ :${order.maker }</li>
			<li>�ֹ����� : ${order.num }</li>
		</c:forEach>
	</ul>
</body>
</html>