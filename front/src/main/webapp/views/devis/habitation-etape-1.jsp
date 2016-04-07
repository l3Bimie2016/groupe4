<%--
  Created by IntelliJ IDEA.
  User: Joelle
  Date: 05/04/2016
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <title>Devis Habitation - Etape 1</title>
    </head>
    <body>
        <h1>Devis d'habitation</h1>
        <h2>Etape 1</h2>
        <form>
            <label for="nom">Nom</label>
            <input type="text" name="nom" id="nom" value="${firstName}" readonly/><br/>

            <label for="prenom">Prénom</label>
            <input type="text" name="prenom" id="prenom" value="${lastName}" readonly/><br/>

            <label for="nomDevis">Titre du devis</label>
            <input type="text" name="nomDevis" id="nomDevis" required/><br/>

            <label for="typeHabitation">Type d'habitation</label>
            <select id="typeHabitation" name="typeHabitation">
                <c:forEach items="${habitationTypes}" var="type">
                    <option value="${type}">${type}</option>
                </c:forEach>
            </select><br/>

            <label for="surfaceHabitation">Surface</label>
            <input type="number" name="surfaceHabitation" id="surfaceHabitation" required/><br/><br/>

            <input type="reset" value="Vider tous les champs"/>
            <input type="submit" value="Continuer"/>
        </form>
    </body>
</html>
