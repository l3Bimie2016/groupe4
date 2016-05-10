<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="select" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="option" uri="http://www.springframework.org/tags/form" %>

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
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <title>Devis Habitation - Etape 2</title>
    </head>
    <body>
    <h1>Devis d'habitation | Etape 2/4</h1>

    <h3></h3>

        <form:form method="post" action="/devis/habitation/etape3" modelAttribute="modelWizardHabitation">
            <p>
                <label for="nbPieces">Nombre de pièce(s) :</label>
                <form:input path="nbPieces" type="number" id="nbPieces" min="0" step="1" value="0"></form:input>

                <br id="brEtage" />
                <label for="etage" id="etageLabel">Etage :</label>
                <form:select path="etage" class="etage" id="etage">
                    <form:option value="oui"></form:option>
                    <form:option value="non"></form:option>
                </form:select>

                <br />
                <label for="nbSalleDeBain">Nombre de salle de bain :</label>
                <form:input path="nbSalleDeBain" id="nbSalleDeBain" type="number" min="0" step="1" value="0"></form:input>

                <br />
                <label for="garage">Garage :</label>
                <form:select path="garage">
                    <form:option value="oui"></form:option>
                    <form:option value="non"></form:option>
                </form:select>

                <br /><br />
                <a href="/back/devis/habitation/etape1"><input type="button" value="Etape précédente" /></a> <input type="submit" value="Etape suivante" />

                <br /><br />
                <a href="/"><input type="button" value="Annuler" /></a>
            </p>
        </form:form>

        <script>

            if("${modelWizardHabitation.typeHabitation}" != "Appartement") {
                document.getElementById('etage').remove();
                document.getElementById('etageLabel').remove();
                document.getElementById('brEtage').remove();
            }
        </script>

    </body>
</html>