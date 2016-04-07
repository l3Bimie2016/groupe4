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
    <h1>Nouveau devis véhicule | Etape 2/4</h1>

    <h3>Nicolas Melin</h3>

    <form:form method="post" action="/devis/vehicule/etape3" modelAttribute="modelWizardVehicule">
        <p>
            <label for="datePermis">Date de permis :</label>
            <form:input path="datePermis" type="date" id="datePermis"></form:input>

            <br />
            <label for="nbAccident">Nombre d'accident(s) :</label>
            <form:input type="number" path="nbAccident" id="nbAccident" value="0" min="0"></form:input>

            <br />
            <label for="bonusMalus">Bonus / malus</label>
            <form:input path="bonusMalus"  id="bonusMalus" step="0.01" value="1" min="0.50" max="50"></form:input>

            <br /><br />
            <a href="/back/devis/vehicule/etape1"><input type="button" value="Etape précédente" /></a> <input type="submit" value="Etape suivante" />

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

