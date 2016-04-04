<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<body>
	<h1>Demo Spring sécurity</h1>
	<br />
	Message: ${message}
    <br />
	<a href="/logout">Déconnexion</a><br />
	<a href="/private/client">Vers une page pour utilisateur authentifié sans rôle particulier</a><br />
	<a href="/private/admin">Vers une page pour utilisateur authentifié ayant le rôle ROLE_ADMIN</a>
</body>

</html>
