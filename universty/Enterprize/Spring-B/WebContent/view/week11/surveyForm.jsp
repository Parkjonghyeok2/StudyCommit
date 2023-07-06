<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>설문조사 양식</title>
</head>
<body>
	<h2>설문조사</h2>
	<form action="survey" method="post">
		<!-- Controller에서 받은 List questions 이 적용된다
		 for문 내부에서 var=q는 value값으로 인식, 실제 questions값의 key값을 status로 인식한다  -->
		<c:forEach var="q" items="${questions}" varStatus="status">
		<!-- 따라서 실제 questions리스트 key값은 status value값은 q로 인식하여 풀이한다-->
		<!-- 1,2번 문항 -->
			<p>${status.index + 1}.${q.title}<br>
				<!-- value값이 choice된 값을 넣는다-->
				<c:if test="${q.choice}">
					<!--Question.options 속성을 option이라는 value 값을 선언하고 해당 값이 들어갈 path는 questions의 value값에 들어간다-->
					<c:forEach var="option" items="${q.options}">
						<!-- 1, 2문항에 값이 있다면 그 값을 넣어라 -->
						<label><input type="radio"
							name="responses[${status.index}]" value="${option}"> ${option}</label>
					</c:forEach>
				</c:if>
				<!--1, 2문항에 아무런 값이 없다면 그냥 빈 값을 넣어라 -->
				<c:if test="${!q.choice}">
					<input type="text" name="responses[${status.index}]/">
				</c:if>
			</p>
		</c:forEach>

		<p>
			<label>응답자 위치 : <br> <!-- AnsweredData.res속성 --> <input
				type="text" name="res.location">
			</label>
		</p>
		<p>
			<label>응답자 나이 : <br> <input type="text" name="res.age">
			</label>
		</p>
		<input type="submit" value="전송" />
	</form>
</body>
</html>