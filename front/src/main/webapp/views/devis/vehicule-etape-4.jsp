<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nicol
  Date: 04/04/2016
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Devis Véhicule - Etape 4</title>
</head>
<body>
    <h1>Devis véhicule | Etape 4/4</h1>

    <h3></h3>

    <h1>Résumé du devis :</h1>

    <p style="font-size: 25px"><span style="font-weight: bold">Nom du devis :</span> ${modelWizardVehicule.nomDevis}</p>
    <p style="font-size: 25px"><span style="font-weight: bold">Véhivule : </span>${modelWizardVehicule.marque} ${modelWizardVehicule.modele}, ${modelWizardVehicule.chvxfiscaux} cheveaux fiscaux</p>
    <p style="font-size: 25px"><span style="font-weight: bold">Type de carburant :</span> ${modelWizardVehicule.carburant}</p>

    <p style="font-size: 25px"><span style="font-weight: bold">Date de permis :</span> ${modelWizardVehicule.datePermis}</p>
    <p style="font-size: 25px"><span style="font-weight: bold">Nombre d'accident(s) :</span> ${modelWizardVehicule.nbAccident}</p>
    <p style="font-size: 25px"><span style="font-weight: bold">Bonus / Malus :</span> ${modelWizardVehicule.bonusMalus}</p>

    <p style="font-size: 25px"><span style="font-weight: bold">Conducteur princpal :</span> ${modelWizardVehicule.conducteurPrincipal}</p>
    <p style="font-size: 25px"><span style="font-weight: bold">Conducteur secondaire :</span> ${modelWizardVehicule.conducteurSecondaire}</p>
    <p style="font-size: 25px"><span style="font-weight: bold">Dort dans un garage :</span> ${modelWizardVehicule.dortDansGarage}</p>
    <p style="font-size: 25px"><span style="font-weight: bold">Adresse :</span> ${modelWizardVehicule.adresse}</p>

    <form:form method="post" action="/devis/vehicule/success" modelAttribute="modelWizardVehicule">
        <p>
            <br />
            <label for="type">Type :</label>
            <form:select path="type">
                <form:option value="1">Tous risques</form:option>
                <form:option value="2">Tier</form:option>
            </form:select>

            <br /><br />
            <a href="/devis/vehicule/etape3"><input type="button" value="Etape précédente" /></a> <input type="submit" value="Terminer" />

            <br /><br />
            <a href="/"><input type="button" value="Annuler" /></a>
        </p>
    </form:form>

    <script>

        "use strict";

        /*let marque = document.getElementById("marque").value;
        setMarques(marque);

        document.getElementById("marque").addEventListener("change", function(){
            let marque = document.getElementById("marque").value;
            setMarques(marque);
        });



        function setMarques(marque) {
            fetch('http://localhost:8080/api/modeles?marque='+marque)
            .then(function(response) {   //res => res.json()
                return response.json();
            })
            .then(function (json) {
                document.getElementById("modele").innerHTML = '';
                for(var i in json) {
                    var opt = document.createElement("option");
                    var textOpt = document.createTextNode(json[i]);
                    opt.value = json[i];
                    opt.innerHTML = json[i];
                    document.getElementById("modele").appendChild(opt);
                }
            })
            .catch(function(err) {
                console.error(err);
            });
        }*/

    </script>


</body>
</html>

