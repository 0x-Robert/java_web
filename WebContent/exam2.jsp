<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- jsp 주석입니다. 
여러줄로 사용가능--%>

<!-- html 주석입니다. -->
<%

//자바주석입니다
/*
여러줄도 가능
*/
	for(int i = 1; i<=5; i++){
		
	
%>
<H<%=i %>>아름다운 한영</H<%=i %>>
<%
	}
%>



</body>
</html>