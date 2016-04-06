<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="select" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="option" uri="http://www.springframework.org/tags/form" %>
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
    <title>Devis</title>
</head>
<body>
    <h1>Nouveau devis véhicule | Etape 1/4</h1>

    <h3>Nicolas Melin</h3>

    <form:form method="post" action="/devis/vehicule/etape2" modelAttribute="modelWizardVehicule">
        <p>
            <label for="nomDevis">Nom du devis :</label>
            <form:input path="nomDevis" id="nomDevis"></form:input>

            <br />
            <label for="marque">Marque :</label>
            <form:select path="marque" id="marque" >
                <form:option value="Renault">Renault</form:option>
                <form:option value="Peugeot">Peugeot</form:option>
                <form:option value="Citroën">Citroën</form:option>
                <form:option value="Opel">Opel</form:option>
            </form:select>

            <br />
            <label for="modele">Modèles :</label>
            <form:select path="modele" id="modele" ></form:select>

            <br />
            <label for="carburant">Carburant :</label>
            <form:select path="carburant" id="carburant" >
                <form:option value="diesel">Diesel</form:option>
                <form:option value="essence">Essence</form:option>
            </form:select>

            <br />
            <label for="chvxfiscaux">Cheveaux fiscaux :</label>
            <form:select path="chvxfiscaux" id="chvxfiscaux" >
                <form:option value="5">5</form:option>
                <form:option value="6">6</form:option>
                <form:option value="7">7</form:option>
            </form:select>

            <br /><br />
            <input type="submit" value="Etape suivante" />

            <br /><br />
            <a href="/"><input type="button" value="Annuler" /></a>
        </p>
    </form:form>

    <script>

        "use strict";

        let marque = document.getElementById("marque").value;
        setMarques(marque, "${modelWizardVehicule.modele}");

        document.getElementById("marque").addEventListener("change", function(){
            let marque = document.getElementById("marque").value;

            setMarques(marque, "${modelWizardVehicule.modele}");
        });



        function setMarques(marque, m) {
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
                    if(json[i] == m) {
                        opt.setAttribute('selected', true);
                    }
                    document.getElementById("modele").appendChild(opt);
                }
            })
            .catch(function(err) {
                console.error(err);
            });
        }

    </script>


</body>
</html>

