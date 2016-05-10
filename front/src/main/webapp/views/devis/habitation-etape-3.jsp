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
        <title>Devis Habitation - Etape 3</title>
    </head>
    <body>
    <h1>Devis d'habitation | Etape 3/4</h1>

        <form:form method="post" action="/private/devis/habitation/etape4" modelAttribute="modelWizardHabitation">
            <p>
                <label for="surfaceTerrain">Surface du terrain :</label>
                <form:input path="surfaceTerrain" type="number" id="surfaceTerrain" min="0" step="1" value="0"></form:input>

                <br />
                <label for="surfaceTerasse">Surface de la terrasse :</label>
                <form:input path="surfaceTerasse" type="number" id="surfaceTerasse" min="0" step="1" value="0"></form:input>

                <br />
                <label for="typeChauffage">Type de chauffage :</label>
                <form:select path="typeChauffage">
                    <form:option value="type1"></form:option>
                    <form:option value="type2"></form:option>
                    <form:option value="type3"></form:option>
                </form:select>

                <br /><br />
                <a href="/devis/habitation/etape2"><input type="button" value="Etape précédente" /></a> <input type="submit" value="Etape suivante" />

                <br /><br />
                <a href="/"><input type="button" value="Annuler" /></a>
            </p>
        </form:form>

        <script>
        </script>

    </body>
</html>