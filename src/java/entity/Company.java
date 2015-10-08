/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Jeanette
 */
@Entity
public class Company extends InfoEntitys implements Serializable
{
    @Id
    private Integer id;
    private String companyName;
    private String description;
    private int cvr;
    private int numEmployees;
    private double marketValue;

    public Company()
    {
        super();
    }

    public Company(String companyName, String description, int cvr, int numEmployees, double marketValue, String email, Address address)
    {
        super(email, address);
        this.companyName = companyName;
        this.description = description;
        this.cvr = cvr;
        this.numEmployees = numEmployees;
        this.marketValue = marketValue;
    }
    
    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getCvr()
    {
        return cvr;
    }

    public void setCvr(int cvr)
    {
        this.cvr = cvr;
    }

    public int getNumEmployees()
    {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees)
    {
        this.numEmployees = numEmployees;
    }

    public double getMarketValue()
    {
        return marketValue;
    }

    public void setMarketValue(double marketValue)
    {
        this.marketValue = marketValue;
    }

}


