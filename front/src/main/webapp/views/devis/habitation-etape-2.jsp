<%--
  Created by IntelliJ IDEA.
  User: Joelle
  Date: 05/04/2016
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <title>Devis Habitation - Etape 2</title>
    </head>
    <body>
        <h1>Devis d'habitation</h1>
        <h2>Etape 2</h2>

        <form>
            <label for="nbPieces">Nombre de pièces</label>
            <input type="number" name="nbPieces" id="nbPieces" required/><br/>

            <c:if test="${devis.typeHabitation == 'appartement'}">
                <label for="etage">Etage</label>
                <input type="text" name="etage" id="etage" required/><br/>
            </c:if>

            <label for="nbSallesDeBain">Nombre de salles de bain</label>
            <input type="number" name="nbSallesDeBain" id="nbSallesDeBain" required/><br/>

            <label>Présence d'un garage</label>
            <input type="radio" name="garage" value="true"> Oui
            <input type="radio" name="garage" value="false"> Non<br/>

            <input type="reset" value="Vider tous les champs" required/>
            <input type="submit" value="Continuer"/>

        </form>
    </body>
</html>