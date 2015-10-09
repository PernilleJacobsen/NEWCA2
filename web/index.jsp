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

    <script>
        $(document).ready(function () {
            $.ajax({
                url: "api/person/complete",
                dataType: "json"
            }).done(function (persons) {
                $("#table").text("");
                for (var i = 0; i < persons.length; i++) {
                    $("#table").append("<tr>");
                    $("#table").append("<td>" + persons[i].firstname + " " + persons[i].lastname + "</td>");
                    $("#table").append("<td>" + persons[i].email + "</td>");
                    $("#table").append("<td>" + persons[i].address.street + " " + persons[i].address.additionalinfo + " " + persons[i].address.cityinfo.city + " " + persons[i].address.cityinfo.zipcode + "</td>");
                    var text = "<td> ";
                    for (var x = 0; x < persons[i].phones.length; x++) {
                        text += persons[i].phones[x].number + " " + persons[i].phones[x].description + " ";
                    }
                    text += " </td>";
                    $("#table").append(text);
                    var text2 = "<td>";
                    for (var j = 0; j < persons[i].hobbies.length; j++) {
                        text2 += persons[i].hobbies[j].name + " " + persons[i].hobbies[j].description + " ";
                    }
                    text2 += " </td>";
                    $("#table").append(text2);
                    $("#table").append("</tr>");
                }
            }).fail(function (jqXHR, textStatus) {
                jsonValue = jQuery.parseJSON(jqXHR.responseText);
                alert("Request failed: " + jsonValue.message);
            });
        });
    </script>

    <body>
        <div id="authors"> Marta Miszczyk, Jeanette Boring-Møller, Pernille Jacobsen </div>

<div id="class">A</div>

<div id= "group"> Group number </div>


        <table style="width:100%" border="1" >
            <thead>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Phone</th>
            <th>Hobby</th>
        </thead>
        <tbody id="table">

        </tbody>
    </table>
</body>

</html>
