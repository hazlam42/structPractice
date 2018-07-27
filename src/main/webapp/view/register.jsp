<%--
  Created by IntelliJ IDEA.
  User: Hazlam
  Date: 27.07.2018
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>Registration Form</title>
</head>
<body>
<center>
    <h1>Registration Form</h1>
    <html:form action="/register">
        Username : <html:text property="username"/><br/>
        <br/>
        Password : <html:password property="password"/><br>
        <br/>
        <html:submit value="Register"/>
    </html:form>
</center>
</body>
</html>