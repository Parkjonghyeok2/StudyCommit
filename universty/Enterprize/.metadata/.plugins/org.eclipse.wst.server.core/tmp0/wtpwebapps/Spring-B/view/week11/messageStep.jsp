<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title><spring:message code="member.register"></spring:message></title>
</head>
<body>

	<h2>
		<spring:message code="term.agree" />
	</h2>
	<p>�������</p>
	<form action="step2" method="post">

		<input type="hidden" name="path" value="week11"> <input
			type="hidden" name="view" value="messageStep"> <label>
			<input type="checkbox" name="agree" value="true"> <spring:message
				code="term.agree" />
		</label> <input type="submit" value=<spring:message code="next.btn" /> />
</body>
</html>