/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import entity.Hobby;
import entity.Person;
import entity.Phone;
import facade.Facade;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author Pernille
 */
@Path("person/")
public class RestPerson
{

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestPerson
     */
    Gson gson;

    public RestPerson()
    {
        gson = new GsonBuilder().setPrettyPrinting().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create();
    } 
    @GET
    @Path("complete/{id}")
    @Produces("application/json")
    public String getPersonById(@PathParam("id") int id)
    {
        JsonObject phoneNr = new JsonObject();
        JsonObject person = new JsonObject();
        JsonObject hobby = new JsonObject();
        JsonArray hobbies = new JsonArray();
        JsonArray phones = new JsonArray();

        Person persons = Facade.getPersonByID(id);
        List<Hobby> hobbiess;
        List<Phone> phoneNumbers;

        person.addProperty("Id", persons.getId());
        person.addProperty("firstName", persons.getFirstName());
        person.addProperty("lastName", persons.getLastName());
        person.addProperty("email", persons.getEmail());
        person.addProperty("street", persons.getAddress().getStreet());
        person.addProperty("city", persons.getAddress().getCityInfo().getCity());
        person.addProperty("zipCode", persons.getAddress().getCityInfo().getZip());
        person.addProperty("additionalInfo", persons.getAddress().getAdditionalInfo());
      
        hobbiess = persons.getHobbys();
            while (!hobbiess.isEmpty())
            {
                Hobby h = hobbiess.get(0);
                hobby.addProperty("hobbyName", h.getHobbyName());
                hobby.addProperty("description", h.getDescription());
                
                hobbiess.remove(h);
                hobbies.add(hobby);
            }
            person.add("hobbies", hobbies);
        
        phoneNumbers = persons.getPhoneList();
        while(!phoneNumbers.isEmpty())
        {
            Phone p = phoneNumbers.get(0);
            phoneNr.addProperty("phoneNumber", p.getPhoneNumber());
            
            phoneNumbers.remove(p);
            phones.add(phoneNr);
        }
        person.add("phone", phones);
        String s = gson.toJson(person);
        return s;

    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public String createAPerson(String person)
    {
        Person p = gson.fromJson(person, Person.class);
        Facade.createPerson(p);
        return gson.toJson(p);
    }



}
