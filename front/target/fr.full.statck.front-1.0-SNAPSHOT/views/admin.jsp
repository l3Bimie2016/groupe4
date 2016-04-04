<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<body>
	<h1>Page pour utilisateur authentifié avec le rôle ROLE_ADMIN</h1>
    	<br />
    	Message: ${message} <br />
    	<a href="/">Retour à la page d''accueil</a><br />
    	<a href="/logout">Déconnexion</a><br />
</body>

</html>
