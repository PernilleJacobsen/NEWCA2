/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import javax.servlet.ServletContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 *
 * @author Pernille
 */
public class PersonNotCreatedExceptionMapper implements ExceptionMapper<PersonNotCreatedException>
{
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Context
    ServletContext context;

    @Override
    public Response toResponse(PersonNotCreatedException pnc)
    {
        JsonObject jo = new JsonObject();
        
        if(Boolean.valueOf(context.getInitParameter("debug")))
        {
          
            jo.addProperty("StackTrace", pnc.getStackTrace().toString());
        }
        jo.addProperty("code", 406);
        jo.addProperty("Message", pnc.getMessage());
        return Response.status(Response.Status.NOT_ACCEPTABLE).entity(jo.toString()).build();
    }

    
    
    
}

