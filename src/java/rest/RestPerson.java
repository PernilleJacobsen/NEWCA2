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
import exception.PersonNotCreatedException;
import exception.PersonNotFoundException;
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
    public String getPersonById(@PathParam("id") int id) throws PersonNotFoundException
    {
        try
        {
            JsonObject jo = new JsonObject();
            Person p = Facade.getPersonByID(id);
            jo.addProperty("id", p.getId());
            jo.addProperty("firstname", p.getFirstName());
            jo.addProperty("lastname", p.getLastName());
            jo.addProperty("email", p.getEmail());

            if (p.getAddress() != null)
            {
                JsonObject address = new JsonObject();
                address.addProperty("id", p.getAddress().getId());
                address.addProperty("street", p.getAddress().getStreet());
                address.addProperty("additionalinfo", p.getAddress().getAdditionalInfo());

                JsonObject city = new JsonObject();
                city.addProperty("zipcode", p.getAddress().getCityInfo().getZip());
                city.addProperty("city", p.getAddress().getCityInfo().getCity());
                address.add("cityinfo", city);
                jo.add("address", address);
            }
            JsonArray phones = new JsonArray();
            for (Phone ph : p.getPhoneList())
            {
                JsonObject phone = new JsonObject();
                phone.addProperty("number", ph.getPhoneNumber());
                phone.addProperty("description", ph.getDescription());
                phones.add(phone);
            }
            jo.add("phones", phones);

            JsonArray hobbies = new JsonArray();
            for (Hobby h : p.getHobbys())
            {
                JsonObject hobby = new JsonObject();
                hobby.addProperty("name", h.getHobbyName());
                hobby.addProperty("description", h.getDescription());
                hobbies.add(hobby);
            }
            jo.add("hobbies", hobbies);
            String s = gson.toJson(jo);
            return s;
        } catch (Exception e)
        {
            throw new PersonNotFoundException("There is no person with the requested id");
        }
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public String createAPerson(String person) throws PersonNotCreatedException
    {
        try
        {

            Person p = gson.fromJson(person, Person.class);
            Facade.createPerson(p);
            return gson.toJson(p);

        } catch (Exception e)
        {
            e.printStackTrace();
            throw new PersonNotCreatedException("It was impossible to create the person");
        }
    }

    @GET
    @Path("complete")
    @Produces("application/json")
    public String getAllPersons()
    {
        List<Person> personList = Facade.getAllPerson();
        JsonArray ja = new JsonArray();
        for (Person p : personList)
        {
            JsonObject jo = createJsonObjectfromPerson(p);
            ja.add(jo);
        }
        String s = gson.toJson(ja);
        return s;
    }

    public JsonObject createJsonObjectfromPerson(Person p)
    {
        JsonObject jo = new JsonObject();
        jo.addProperty("id", p.getId());
        jo.addProperty("firstname", p.getFirstName());
        jo.addProperty("lastname", p.getLastName());
        jo.addProperty("email", p.getEmail());

        if (p.getAddress() != null)
        {
            JsonObject address = new JsonObject();
            address.addProperty("id", p.getAddress().getId());
            address.addProperty("street", p.getAddress().getStreet());
            address.addProperty("additionalinfo", p.getAddress().getAdditionalInfo());

            JsonObject city = new JsonObject();
            city.addProperty("zipcode", p.getAddress().getCityInfo().getZip());
            city.addProperty("city", p.getAddress().getCityInfo().getCity());
            address.add("cityinfo", city);
            jo.add("address", address);
        }
        JsonArray phones = new JsonArray();
        for (Phone ph : p.getPhoneList())
        {
            JsonObject phone = new JsonObject();
            phone.addProperty("number", ph.getPhoneNumber());
            phone.addProperty("description", ph.getDescription());
            phones.add(phone);
        }
        jo.add("phones", phones);

        JsonArray hobbies = new JsonArray();
        for (Hobby h : p.getHobbys())
        {
            JsonObject hobby = new JsonObject();
            hobby.addProperty("name", h.getHobbyName());
            hobby.addProperty("description", h.getDescription());
            hobbies.add(hobby);
        }
        jo.add("hobbies", hobbies);
        return jo;
    }

}
