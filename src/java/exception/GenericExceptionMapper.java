/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import com.google.gson.JsonObject;
import javax.servlet.ServletContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Pernille
 */
@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> 
{
    @Context
    ServletContext context;
    @Override
    public Response toResponse(Throwable e)
    {
        JsonObject jo = new JsonObject();
        
        if (Boolean.valueOf(context.getInitParameter("debug"))) {
            
            String err = "";
            
            StackTraceElement[] stack = e.getStackTrace();
            
            for (StackTraceElement elm : stack) {
                err += elm.toString();
            }
            
            jo.addProperty("stackTrace", err);
        }
        
        jo.addProperty("code", 500);
        jo.addProperty("message", "Internal server Error, we are very sorry for the inconvenience");
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(jo.toString()).build();
        //.type(MediaType.APPLICATION_JSON)kunne sættes ind før build
    }
    
    
}
