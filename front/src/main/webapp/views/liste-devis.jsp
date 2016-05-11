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
    <c:set var="step" scope="request" value="${quote.quotStep}"/>
    <c:set var="id" scope="request" value="${quote.quotHid}"/>
    <c:if test="${step != 4}">
        <p><a href="/private/devis/vehicule/resume?id=${id}"><c:out value="${quote.quotHName}"></c:out></a> <span style="font-weight: bold;">... En cours étape n°${step}</span></p>
    </c:if>
    <c:if test="${step == 4}">
        <p><c:out value="${quote.quotHName}"></c:out> <span style="font-weight: bold;">... Terminé</span></p>
    </c:if>
</c:forEach>

<h4>Devis Véhicule</h4>
<c:forEach var="quote" items="${devisVehicle}">
    <c:set var="step" scope="request" value="${quote.quotStep}"/>
    <c:set var="id" scope="request" value="${quote.quotVid}"/>
    <c:if test="${step != 4}">
        <p><a href="/private/devis/vehicule/resume?id=${id}"><c:out value="${quote.quotVName}"></c:out></a> <span style="font-weight: bold;">... En cours étape n°${step}</span></p>
    </c:if>
    <c:if test="${step == 4}">
        <p><c:out value="${quote.quotVName}"></c:out> <span style="font-weight: bold;">... Terminé</span></p>
    </c:if>

</c:forEach>

</body>
</html>
