/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import entity.Hobby;
import entity.Person;
import entity.Phone;
import facade.Facade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import scripts.PersistData;

/**
 *
 * @author Jeanette
 */
public class Tester
{

    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA_2PU");
        EntityManager em = emf.createEntityManager();
//        PersistData.testData(em);
        
        Person p = new Person();
    
        p.setFirstName("Marta");
        p.setLastName("Miszczyk");
        
        
//        System.out.println(Facade.createPerson(p));
    }
}
