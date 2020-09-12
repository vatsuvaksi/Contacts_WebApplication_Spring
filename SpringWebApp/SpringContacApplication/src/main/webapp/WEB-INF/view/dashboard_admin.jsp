<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags" prefix="v"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
<link href= "static/css/style.css" rel="stylesheet" type="text/css">
</head>
<v:url var="url_back" value="/static/images/back.jpg"/>
<body>
<table border="1" width ="80%" align ="center">
<tr>
<td height ="100px">
<jsp:include page="include/header.jsp"></jsp:include>
</td>
</tr>
<tr>
<td height ="25px">
<jsp:include page="include/menu.jsp"></jsp:include>
</td>
</tr>

<tr><td height ="350px" valign="top">
<h1>Admin Dashboard</h1>
<form>
</form>


</td></tr>
<tr>
<td height ="25px">
<jsp:include page="include/footer.jsp"></jsp:include>
</td>
</tr>
</table>
</body>
</html>