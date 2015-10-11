<%-- 
    Document   : Generelt
    Created on : 11-Oct-2015, 09:40:02
    Author     : Pernille
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>


    <body>
         <div class="navbar-header">
                    <a class="navbar-brand" href="#">Bruge Person api</a>
                </div>
                <ul class="nav nav-tabs">
                    <li><a href="Generelt.jsp">Generelt</a></li>
                    <li><a href="doku.jsp">Dokumentation af Person api</a></li>
                    <li><a href="test.jsp">Test</a></li>
                </ul>
        <h2>Projekter er ikke tilgængeligt via Openshift</h2>
        <p>Vi har lagt war fil op på Openshift, men kan ikke få oprettet vores tabeller i databasen</p>
        <p>Vi har fulgt både første vejledning og den nye hjælpevejledning fra Lars men uden held</p>
   
        <h2>Git repository</h2>
        <a href="https://github.com/PernilleJacobsen/NEWCA2.git">Git klik her</a>
        <p> dette repository viser ikke det sande billede af hvem der har lavet hvad - vi har været nødt til at omskrive projektet og lægge det i nyt repository pga det oprindelige projekt blev smadret på git.</p>
        <br>
        <h2>Hvem har lavet hvad?</h2>
        <br>
        <p> Vi har lavet projektet i fællesskab - men Marta har stået for Rest Assured, Jeanette for JUnitTesten og Pernille for Exception handling</p>
        <br>
        <h2>Forslag til studypoints</h2>
        <p> Studypoint - vi mener at vi skal have lige andel i studypoint - og selvfølgelig helst 5 hver:-)
          <br>
         <h2>Arv strategi</h2> 
           <br>
           <p>Vi har valgt at implementere strategien Join</p>
           <p>Strategien er valgt fordi den giver den bedste afspejling af domænet i databasen. </p>
           <p>Vi får samtidig nemmere adgang til data og tabellerne er mere overskuelige i databasen</p>
           <p>Mht performance af queries har vi ikke konstateret nogle udfordringer - men i et mere kompliceret setup og fuldt implementert projekt kunne der være issues forbundet med strategien</p>
        <script src ="main.js">
        </script>
    </body>
</html>
