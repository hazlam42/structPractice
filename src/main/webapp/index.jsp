<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Struts Example Page</title>
</head>
<body>
<html:errors/>
<html:form action="Lookup">
    <table>
        <tr>
            <td>Symbol:</td>
            <td><html:text property="professionId"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><html:submit/></td>
        </tr>
    </table>
    <table>
        <tr>
            <td>Register now:</td>
            <td><a href="view/register.jsp">Register</a></td>
        </tr>
    </table>
</html:form>
</body>
</html>