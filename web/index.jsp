<%-- 
    Document   : index
    Created on : 07-Oct-2015, 23:06:03
    Author     : Pernille
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
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
                    <li><a href=".jsp">Generelt</a></li>
                    <li><a href="doku.jsp">Dokumentation af Person api</a></li>
                    <li><a href=".jsp">Test</a></li>
                </ul>
        <script src ="main.js">
        </script>
        <div id="authors"> Marta Miszczyk, Jeanette Boring-Møller, Pernille Jacobsen </div>

        <div id="class">DAT A</div>

        <div id= "group"> Group: MJP </div>


        <table style="width:100%" border="1" >
            <thead>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Phone</th>
            <th>Hobby</th>
        </thead>
        <tbody id="table">

        </tbody>
    </table>

    <input id="input" type="text" name="PersonId" value="" size="5" />

    <input type="button" id="pid" value="GetPerson" name="GetPerson" />

    <table style="width:100%" border="1" >
        <thead>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Phone</th>
        <th>Hobby</th>
    </thead>
    <tbody id="table2">
    </tbody>
</table>
</body>

</html>
