package restAssured;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.jayway.restassured.RestAssured.basePath;
import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.defaultParser;
import static com.jayway.restassured.RestAssured.when;
import com.jayway.restassured.parsing.Parser;
import static org.hamcrest.Matchers.equalTo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author martamiszczyk
 */
public class RestAssured
{
    
    public RestAssured()
    {
    }
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        baseURI = "http://localhost:8080";
        defaultParser = Parser.JSON;
        basePath = "/NYCA2/api/person/complete";
    }
    
    @Test
    public void testGetPersonByID()
    { 
        when()
            .get("/1")
        .then().
            statusCode(200).
            body("firstName", equalTo("Korben"));
 
    }
    
   
    
}