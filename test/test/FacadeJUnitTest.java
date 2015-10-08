/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Company;
import entity.Person;
import facade.Facade;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeanette
 */
public class FacadeJUnitTest
{
    private int personID;
    private long id;
    private Person p;
    private int cvr;
    private Company c;
    private String hobby;
    private long count;
    private String phoneNumber;
    
    public FacadeJUnitTest()
    {

    }
    
    @Test
    public void getPersonByIdTest()
    {
        personID = 1;
        p = Facade.getPersonByID(personID);
        
        assertEquals(1,(long) p.getId());
        assertEquals("Korben", p.getFirstName());
        assertEquals("Dallas", p.getLastName());
    }
    
    @Test
    public void getCompanyByCVRTest()
    {
        cvr = 75897548;
        c = Facade.getCompanyByCVR(cvr);
        
        assertEquals(75897548, c.getCvr());
        assertEquals("Fields", c.getCompanyName());
    }
    
    @Test
    public void CountPersonWithHobbyTest()
    {
        hobby = "Programmering";
        
        count = Facade.countPeopleWithHobby(hobby);
        
        assertEquals(2, count);
    }
    
        @Test
    public void getCompanyByID()
    {
        id = 7;
        
        c = Facade.getCompanyByID((int)id);
        
        assertEquals(7, (long) c.getId());
    }
    
}
