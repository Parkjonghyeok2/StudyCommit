<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������</title>
</head>
<body>
	<h2>���</h2>
	<p>�������</p>
	<form action="step2" method="post">
		<input type="hidden" name="path" value="week11"/> 
		<input type="hidden" name="view" value="registerStep"/> 
		<label>
			<input type="checkbox" name="agree" value="true"/> �������
		</label> 
		<input type="submit" value="�����ܰ�" />
	</form>
</body>
</html>