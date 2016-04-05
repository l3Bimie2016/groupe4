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
    <h1>Nouveau devis véhicule</h1>

    <h3>Nicolas Melin</h3>

    <form method="post" action="">
        <p>
            <label for="nomDevis">Nom du devis :</label>
            <input type="text" name="nomDevis" id="nomDevis" />

            <br />
            <label for="marque">Marque :</label>
            <select name="marque" id="marque" >
                <option value="Renault">Renault</option>
                <option value="Peugeot">Peugeot</option>
                <option value="Citroën">Citroën</option>
                <option value="Opel">Opel</option>
            </select>

            <br />
            <label for="modele">Modèles :</label>
            <select name="modele" id="modele" ></select>

            <br />
            <label for="carburant">Carburant :</label>
            <select name="carburant" id="carburant" >
                <option value="diesel">Diesel</option>
                <option value="essence">Essence</option>
            </select>

            <br />
            <label for="chvxfiscaux">Cheveaux fiscaux :</label>
            <select name="chvxfiscaux" id="chvxfiscaux" >
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
            </select>

        </p>
    </form>

    <button>Etape suivante</button>

    <script>

        "use strict";

        let marque = document.getElementById("marque").value;
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
        }

    </script>


</body>
</html>

