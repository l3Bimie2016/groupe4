<%--
  Created by IntelliJ IDEA.
  User: termiton
  Date: 05/04/16
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@page import="config.WebSecurityConfig" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Sign In</title>
</head>
<body>
${message}
<br />
<H1>Sign In</H1>

<form:form id="form" action="/signin.do" method="POST" modelAttribute="userSignin">
    <c:if test="${not empty param.err}">
        <div class="msg-container error">
            <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>
        </div>
    </c:if>

    <table>
        <tr>

            <td><label>Username:</label></td>
            <td><form:input path="username" type="text" value="Jean"/></td>
        </tr>
        <tr>
            <td><label>Password:</label></td>
            <td><form:input path="password" type="password" value="pass"/></td>
        </tr>
        <tr>
            <td><label>First Name:</label></td>
            <td><form:input path="firstName" type="text" value="Jean"/></td>
        </tr>
        <tr>
            <td><label>Last Name:</label></td>
            <td><form:input path="lastName" type="text" value="Dupont"/></td>
        </tr>
        <tr>
            <td><label>Adresse:</label></td>
            <td><form:input path="address" type="text" value="23 rue" placeholder="N° Rue"/></td>
        </tr>
        <tr>
            <td><label>Code postal:</label></td>
            <td><form:input path="postalCode" type="text" value="45689"/></td>
        </tr>
        <tr>
            <td><label>Ville:</label></td>
            <td><form:input path="city" type="text" value="Pierre"/></td>
        </tr>
    </table>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

    <div class="submit-container">
        <input value="Valider" name="submit" type="submit" class="submit-btn"/>
    </div>
</form:form>


</body>
</html>
