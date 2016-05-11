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
    <title>Profil utilisateur</title>
</head>
<body>
<h1>Profil de ${userLogin}</h1>
<p>Prénom : ${userName}</p>
<p>Nom : ${userLastName}</p>
<p>Adresse : ${userAddress}</p>
<p>Ville : ${userCity}</p>

<br /><br />
<a href="/"><input type="button" value="Retour" /></a>
</body>
</html>
