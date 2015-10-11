<%-- 
    Document   : test
    Created on : 11-Oct-2015, 10:11:36
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
        
        <h2>Rest Assured</h2>
        <p>Vi har implementeret test der tester vores metoder til:</p>
        <p>getPersonById og createPerson</p>
        <p>Testen kan først afvikles efter vores testerklasse er afviklet og data dermed er dannet</p>
        
        <h2>Postman</h2>
        <p>Vi forudsætter at Postman er installeret og der er et kendskab til programmet</p>
        <p>Følgende funktioner kan testes via Postman:</p>
        <ul>
            <li>getPersonById metode = GET, url = http://localhost:8080/NYCA2/api/person/complete/? </li>
             <li>getAllPersons metode = GET url = http://localhost:8080/NYCA2/api/person/complete</li>
             <li>createPerson metode POST, url = http://localhost:8080/NYCA2/api/person</li>   
        </ul>
        <p>GET:</p>
        <p>Vælg metoden GET og indsæt URL - og klik på send for at hente alle</p>

        <p>Vælg metoden GET og indsæt URL + tal for den person du vil hente( vælg enten 1 eller 3) og klik på send</p>
        <p>Resultat af forespørgsel vises i body som JSON objekter</p>
        
        <p>POST:</p>
        <p>Vælg metoden POST og indsæt URL, klik på body, klik nu på raw og JSON application/json </p>
        <p>Indsæt en person beskrevet som Json streng - eksempel 
            {
  "firstName": "fornavn",
  "lastName": "efternavn",
  "email": "mailadresse"
}
         - og klik på send</p>
        <br>
         <br>
        <h2>Hvordan bruges websiderne?</h2>
        <p>Forsiden på projektet hedder Bruge Person api</p>
        <p>Her er ved kørsel af programmet indsat en liste over alle personer</p>
        <p>Det er muligt at kaldt en specifik person ved at indsætte id på personen og klikke på GetPerson</p>
    
    </body>
</html>
