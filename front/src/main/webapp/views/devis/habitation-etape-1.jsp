<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="select" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="option" uri="http://www.springframework.org/tags/form" %>

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
        <h1>Devis d'habitation | Etape 1/4</h1>

        <h3>Nicolas Melin</h3>

        <form:form method="post" action="/devis/habitation/etape2" modelAttribute="modelWizardHabitation">
            <p>
                <label for="nomDevis">Nom du devis :</label>
                <form:input path="nomDevis" id="nomDevis"></form:input>

                <br />
                <label for="typeHabitation">Type d'habitation :</label>
                <form:select path="typeHabitation" id="typeHabitation" >
                    <form:option value="Maison"></form:option>
                    <form:option value="Appartement"></form:option>
                </form:select>

                <br />
                <label for="surface">Surface :</label>
                <form:input path="surface" id="surface" type="number" min="0" value="0"></form:input>

                <br /><br />
                <input type="submit" value="Etape suivante" />

                <br /><br />
                <a href="/"><input type="button" value="Annuler" /></a>
            </p>
        </form:form>

    </body>
</html>
