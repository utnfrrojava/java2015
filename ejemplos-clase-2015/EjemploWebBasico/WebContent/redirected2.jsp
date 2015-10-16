<%@page import="modelo.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Usuario u = (Usuario)request.getAttribute("user");
		//aquí leo los demás params
		Usuario usuarioSession = (Usuario)session.getAttribute("userSession");
	%>
	Usuario <%=u.getNombre()%>
	<br>
	Email <%=u.getEmail()%>
	<br><br>
	Usuario Session <%=usuarioSession.getNombre() %>
	<br>
	Cuidado con que datos envían en los objetos como passwords, esto acá está mal: (<%=usuarioSession.getPassword() %>)
</body>
</html>