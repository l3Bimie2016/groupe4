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
        <title>Devis Habitation - Etape 4</title>
    </head>
    <body>
    <h1>Devis d'habitation | Etape 4/4</h1>

    <h1>Résumé du devis :</h1>

    <p style="font-size: 25px"><span style="font-weight: bold">Nom du devis :</span> ${modelWizardHabitation.nomDevis}</p>
    <p style="font-size: 25px"><span style="font-weight: bold">Type d'habitation : </span>${modelWizardHabitation.typeHabitation} <span id="etage"></span>, ${modelWizardHabitation.surface} m², ${modelWizardHabitation.nbPieces} pièce(s)</p>
    <p style="font-size: 25px"><span style="font-weight: bold"> ${modelWizardHabitation.nbSalleDeBain} salle(s) de bain</p>
    <p style="font-size: 25px"><span style="font-weight: bold">Garage : </span> ${modelWizardHabitation.garage}</p>

    <p style="font-size: 25px"><span style="font-weight: bold">Surface du terrain : </span> ${modelWizardHabitation.surfaceTerrain} m²</p>
    <p style="font-size: 25px"><span style="font-weight: bold">Surface de la terrasse : </span> ${modelWizardHabitation.surfaceTerrain} m²</p>
    <p style="font-size: 25px"><span style="font-weight: bold">Type de chauffage : </span> ${modelWizardHabitation.typeChauffage}</p>

        <form:form method="post" action="/devis/habitation/success" modelAttribute="modelWizardHabitation">
            <p>

                <br /><br />
                <a href="/private/devis/habitation/etape3"><input type="button" value="Etape précédente" /></a> <input type="submit" value="Etape suivante" />

                <br /><br />
                <a href="/"><input type="button" value="Annuler" /></a>
            </p>
        </form:form>

        <script>
            if(${modelWizardHabitation.typeHabitation == "Appartement"}) {
                let txt = '';
                if(${modelWizardHabitation.etage == "oui"}) {
                    txt = 'avec étage'
                } else {
                    txt = 'sans étage'
                }
                document.getElementById("etage").innerHTML = txt;
            }
        </script>

    </body>
</html>