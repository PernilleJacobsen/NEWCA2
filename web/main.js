$(document).ready(function () {
    $.ajax({
        url: "api/person/complete",
        type: "GET",
        dataType: "json"
    }).done(function (persons) {
        $("#table").text("");
        for (var i = 0; i < persons.length; i++) {
            $("#table").append("<tr>");
            $("#table").append("<td>" + persons[i].id +"</td>");
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
$(document).ready(function () {
    $("#pid").click(function ()
    {
        $.ajax({
            url: "api/person/complete/" + $("#input").val(),
            type: "GET",
            dataType: "json"
        }).done(function (person)
        {
            $("#table2").text("");

            $("#table2").append("<tr>");
            $("#table2").append("<td>" + person.id +"</td>");
            $("#table2").append("<td>" + person.firstname + " " + person.lastname + "</td>");
            $("#table2").append("<td>" + person.email + "</td>");
            $("#table2").append("<td>" + person.address.street + " " + person.address.additionalinfo + " " + person.address.cityinfo.city + " " + person.address.cityinfo.zipcode + "</td>");
            var text = "<td> ";
            for (var x = 0; x < person.phones.length; x++) {
                text += person.phones[x].number + " " + person.phones[x].description + " ";
                text += " </td>";
                $("#table2").append(text);
                var text2 = "<td>";
                for (var j = 0; j < person.hobbies.length; j++) {
                    text2 += person.hobbies[j].name + " " + person.hobbies[j].description + " ";
                }
                text2 += " </td>";
                $("#table2").append(text2);
                $("#table2").append("</tr>");
            }
        }).fail(function (jqXHR, textStatus) {
            jsonValue = jQuery.parseJSON(jqXHR.responseText);
            alert("Request failed: " + jsonValue.message);
        });
    });
});

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


