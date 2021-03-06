<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<body>
	<h1 style="text-align: center;">Bienvenue chez Arnassure 2000, le champion de <s>l'arnaque</s> l'assurance</h1>
	<br />
	<h2 style="text-align: center;">${message}</h2>
    <br />
    <p><a href="/private/user-profile" id="profile">Profil</a></p>
    <p><a href="/private/devis/listing" id="liste-devis">Liste des devis</a></p>
	<p><a href="/private/devis/habitation/etape1">Devis Immobilier</a></p>
    <p><a href="/private/devis/vehicule/etape1">Devis Véhicule</a></p>
    <p><a href="/logout" id="logout">Se déconnecter</a></p>

    <p><a href="/login" id="login">Se connecter</a></p>
    <p><a href="/signin" id="signup">S'enregistrer</a></p>

    <script>
        if(${isLogin}) {
            document.getElementById("login").remove();
            document.getElementById("signup").remove();
        } else {
            document.getElementById("logout").remove();
            document.getElementById("profile").remove();
            document.getElementById("liste-devis").remove();
        }
    </script>

</body>

</html>
