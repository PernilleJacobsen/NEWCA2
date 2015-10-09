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
        <title>JSP Page</title>
    </head>


    <body>
        <script src ="main.js">
        </script>
        <div id="authors"> Marta Miszczyk, Jeanette Boring-Møller, Pernille Jacobsen </div>

        <div id="class">A</div>

        <div id= "group"> Group number </div>


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
    <input id="firstname" type="text" name="Firstname" value="" size="20" />
    <input id="lastname" type="text" name="Lastname" value="" size="20" />
    <input id="email" type="text" name="Email" value="" size="20" />
    <input id="create" type="button" value="Create" name="create" />
</body>

</html>
