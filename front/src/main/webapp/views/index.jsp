<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% Boolean isLogin = true;%>
<!DOCTYPE html>
<html lang="en">

<body>
	<h1>Bienvenue chez Arnassure 2000, le champion de <s>l'arnaque</s> l'assurance</h1>
	<br />
	${message}
    <br />
    <% if (isLogin) {%>
	<p><a href="/devis/habitation/etape1">Devis Immobilier</a></p>
    <p><a href="/devis/vehicule/etape1">Devis Véhicule</a></p>
    <p><a href="/logout">Se déconnecter</a></p>
    <% }else{ %>
    <p><a href="/login">Se connecter</a></p>
    <p><a href="/signin">S'enregistrer</a></p>
    <% } %>

</body>

</html>
