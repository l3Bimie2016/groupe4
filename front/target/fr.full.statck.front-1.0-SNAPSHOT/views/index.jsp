<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<body>
	<h1>Bienvenue chez Arnassure 2000, le champion de <s>l'arnaque</s> l'assurance</h1>
	<br />
	${message} ${isLogin}
    <br />
	<p><a href="/devis/habitation/etape1">Devis Immobilier</a></p>
    <p><a href="/devis/vehicule/etape1">Devis Véhicule</a></p>
    <p><a href="/logout" id="logout">Se déconnecter</a></p>

    <p><a href="/login" id="login">Se connecter</a></p>
    <p><a href="/signin" id="signup">S'enregistrer</a></p>

    <script>

        console.log(${isLogin});

        if(${isLogin}) {
            document.getElementById("login").remove();
            document.getElementById("signup").remove();
        } else {
            document.getElementById("logout").remove();
        }
    </script>

</body>

</html>
