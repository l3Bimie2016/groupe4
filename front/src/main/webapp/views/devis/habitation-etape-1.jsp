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

        <form:form method="post" action="/private/devis/habitation/etape2" modelAttribute="modelWizardHabitation">
            <p>
                <label for="nomDevis">Nom du devis :</label>
                <form:input path="nomDevis" id="nomDevis"></form:input>

                <br />
                <label for="typeHabitation">Type d'habitation :</label>
                <form:select path="typeHabitation" id="typeHabitation" ></form:select>

                <br />
                <label for="surface">Surface :</label>
                <form:input path="surface" id="surface" type="number" min="0" value="0"></form:input>

                <br /><br />
                <input type="submit" value="Etape suivante" />

                <br /><br />
                <a href="/"><input type="button" value="Annuler" /></a>
            </p>
        </form:form>

        <script>
            "use strict";

            var databaseIP = '10.3.5.19';

            console.log("${modelWizardHabitation.nomDevis}")

            setTypeHabitation("${modelWizardHabitation.typeHabitation}");

            function setTypeHabitation(m) {
                fetch('http://'+ databaseIP +':8090/api/homeType')
                        .then(function (response) {   //res => res.json()
                            return response.json();
                        })
                        .then(function (json) {
                            for (var i in json) {
                                /*if(i == 0 && "${modelWizardHabitation.typeHabitation}" == '') {
                                    setModeles(json[i].vehicleBrand, "");
                                }*/
                                let opt = document.createElement("option");
                                const textOpt = document.createTextNode(json[i].homeTypeName);
                                opt.value = json[i].homeTypeName;
                                opt.innerHTML = json[i].homeTypeName;
                                if (json[i].homeTypeName == m) {
                                    opt.setAttribute('selected', true);
                                }
                                document.getElementById("typeHabitation").appendChild(opt);
                            }
                        })
                        .catch(function (err) {
                            console.error(err);
                        });
            }

        </script>

    </body>
</html>
