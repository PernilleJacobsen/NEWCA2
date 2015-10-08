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
                        var text2 = "<td>";
                        for (var j = 0; j < persons[i].hobbys.length; j++) {
                            text2 += persons[i].hobbys[j].hobbyName + " " + persons[i].hobbys[j].description + " ";
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
        <h1>Hello World!</h1>

        <table style="width:100%" border="1" >
            <thead>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Hobby</th>
        </thead>
        <tbody id="table">

        </tbody>
    </table>
</body>

</html>
