<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="select" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="option" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: Blaise
  Date: 09/05/2016
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Liste des devis</title>
</head>
<body>
<h1>Liste des devis</h1>

<h3>Ass Hure 2000</h3>

<h4>Devis Habitat</h4>
<c:forEach var="quote" items="${devisHome}">
    <p><a href="" target="_blank"><c:out value="${quote.quotHName}"></c:out></a></p>
</c:forEach>

<h4>Devis Véhicule</h4>
<c:forEach var="quote" items="${devisVehicle}">
    <p><a href="" target="_blank"><c:out value="${quote.quotVName}"></c:out></a></p>
</c:forEach>

</body>
</html>
