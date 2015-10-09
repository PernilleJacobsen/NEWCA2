/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import deploy.DeploymentConfiguration;
import entity.Hobby;
import entity.Person;
import entity.Phone;
import facade.Facade;
import java.util.List;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DeploymentConfiguration.PU_NAME);
        EntityManager em = emf.createEntityManager();
        PersistData.testData(em);

    }
}
