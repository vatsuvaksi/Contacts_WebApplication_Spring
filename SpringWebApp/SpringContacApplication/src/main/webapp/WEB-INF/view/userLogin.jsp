<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<link href= "static/css/style.css" rel="stylesheet" type="text/css">
</head>
<s:url var="url_back" value="/static/images/back.jpg"/>
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
 <tr>
                <td height="350px" valign="top">
                    <%-- Page Content Area--%>
                    <h3>User Login</h3>
                    <c:if test="${err!=null}">
                        <p class="error">${err}</p>
                    </c:if>
                    <c:if test="${param.act eq 'lo'}">
                        <p class="success">Logout Successfully! Thanks for using contact application.</p>
                    </c:if>
                    <c:if test="${param.act eq 'reg'}">
                        <p class="success">User Registered Successfully. Please login</p>
                    </c:if>  
                    <s:url var="url_login"  value="/login"/>
                    <f:form action="${url_login}" modelAttribute="command">
                        <table border="1">
                            <tr>
                                <td>Username</td>
                                <td><f:input path="LoginName" /> </td>
                            </tr>
                            <tr>
                                <td>Password</td>
                                <td><f:password path="password" /> </td>
                            </tr>
                            <tr>                                
                                <td colspan="2" align="right">
                                    <button>Login</button> <br/>
                                    <a href="<s:url value="/reg_form"/>">New User Registration</a>
                                </td>
                            </tr>
                        </table>
                    </f:form>
                </td>
            </tr>
<tr>
<td height ="25px">
<jsp:include page="include/footer.jsp"></jsp:include>
</td>
</tr>
</table>
</body>
</html>