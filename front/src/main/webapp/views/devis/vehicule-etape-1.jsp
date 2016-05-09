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
    <title>Devis Véhicule - Etape 1</title>
    <spring:url value="/ressources/js/config.js" var="d" />
</head>
<body>
    <h1>Devis véhicule | Etape 1/4</h1>

    <h3>Nicolas Melin</h3>

    <form:form method="post" action="/devis/vehicule/etape2" modelAttribute="modelWizardVehicule">
        <p>
            <label for="nomDevis">Nom du devis :</label>
            <form:input path="nomDevis" id="nomDevis"></form:input>

            <br />
            <label for="marque">Marque :</label>
            <form:select path="marque" id="marque" ></form:select>

            <br />
            <label for="modele">Modèles :</label>
            <form:select path="modele" id="modele" ></form:select>

            <br />
            <label for="carburant">Carburant :</label>
            <form:select path="carburant" id="carburant" ></form:select>

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

        var databaseIP = '10.3.5.19';

        setMarques("${modelWizardVehicule.marque}");
        if("${modelWizardVehicule.modele}" != '') {
            setModeles("${modelWizardVehicule.modele}");
        }
        if("${modelWizardVehicule.carburant}" != '') {
            setCarburants("${modelWizardVehicule.carburant}");
        }

        document.getElementById("marque").addEventListener("change", function(){
            let marque = document.getElementById("marque").value;

            document.getElementById("modele").innerHTML = '';

            setModeles(marque, "");
        });

        document.getElementById("modele").addEventListener("change", function(){
            let modele = document.getElementById("modele").value;

            document.getElementById("carburant").innerHTML = '';

            setCarburants(modele, "");
        });



        function setMarques(m) {
            fetch('http://'+ databaseIP +':8090/api/marques')
            .then(function (response) {   //res => res.json()
                return response.json();
            })
            .then(function (json) {
                for (var i in json) {
                    console.log(m);
                    if(i == 0 && "${modelWizardVehicule.modele}" != '') {
                        setModeles(json[i].vehicleBrand, "");
                    }
                    let opt = document.createElement("option");
                    const textOpt = document.createTextNode(json[i].vehicleBrand);
                    opt.value = json[i].vehicleBrand;
                    opt.innerHTML = json[i].vehicleBrand;
                    if (json[i].vehicleBrand == m) {
                        opt.setAttribute('selected', true);
                    }
                    document.getElementById("marque").appendChild(opt);
                }
            })
            .catch(function (err) {
                console.error(err);
            });
        }

        function setModeles(marque, m) {
            fetch('http://'+ databaseIP +':8090/api/modeles?marque=' + marque)
            .then(function (response) {   //res => res.json()
                return response.json();
            })
            .then(function (json) {
                for (var i in json) {
                    if(i == 0 && "${modelWizardVehicule.carburant}" != '') {
                        document.getElementById("carburant").innerHTML = '';
                        setCarburants(json[i].vehicleModelName, "");
                    }
                    let opt = document.createElement("option");
                    const textOpt = document.createTextNode(json[i].vehicleModelName);
                    opt.value = json[i].vehicleModelName;
                    opt.innerHTML = json[i].vehicleModelName;
                    if (json[i].vehicleModelName == m) {
                        opt.setAttribute('selected', true);
                    }
                    document.getElementById("modele").appendChild(opt);
                }
            })
            .catch(function (err) {
                console.error(err);
            });
        }

        function setCarburants(modele, m) {
            fetch('http://'+ databaseIP +':8090/api/fuel?modele=' + modele)
            .then(function (response) {   //res => res.json()
                return response.json();
            })
            .then(function (json) {
                for (var i in json) {
                    let opt = document.createElement("option");
                    const textOpt = document.createTextNode(json[i].vehicleFuelName);
                    opt.value = json[i].vehicleFuelName;
                    opt.innerHTML = json[i].vehicleFuelName;
                    if (json[i].vehicleFuelName == m) {
                        opt.setAttribute('selected', true);
                    }
                    document.getElementById("carburant").appendChild(opt);
                }
            })
            .catch(function (err) {
                console.error(err);
            });
        }

    </script>


</body>
</html>

