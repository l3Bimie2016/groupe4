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
    <title>Devis Véhicule - Etape 3</title>
</head>
<body>
    <h1>Devis véhicule | Etape 3/4</h1>

    <h3></h3>

    <form:form method="post" action="/devis/vehicule/etape4" modelAttribute="modelWizardVehicule">
        <p>
            <label for="conducteurPrincipal">Conducteur principal :</label>
            <form:input path="conducteurPrincipal" id="conducteurPrincipal"></form:input>

            <br />
            <label for="conducteurSecondaire">Conducteur secondaire :</label>
            <form:input path="conducteurSecondaire" id="conducteurSecondaire"></form:input>

            <br />
            <label for="dortDansGarage">Dort dans un garage :</label>
            <form:select path="dortDansGarage">
                <form:option value="oui"></form:option>
                <form:option value="non"></form:option>
            </form:select>

            <br />
            <label for="adresse">Adresse :</label>
            <form:input path="adresse"></form:input>

            <br /><br />
            <a href="/devis/vehicule/etape2"><input type="button" value="Etape précédente" /></a> <input type="submit" value="Etape suivante" />

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

