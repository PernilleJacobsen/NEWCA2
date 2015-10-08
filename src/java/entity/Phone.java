/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



/**
 *
 * @author Pernille
 */
@Entity
public class Phone implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String PhoneNumber;
    private String description;
    @ManyToOne(cascade={CascadeType.ALL})
    private InfoEntitys infoEntity;

    public Phone()
    {
    }

    public Phone(String PhoneNumber, String description)
    {
        this.PhoneNumber = PhoneNumber;
        this.description = description;
    }

    public String getPhoneNumber()
    {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber)
    {
        this.PhoneNumber = PhoneNumber;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public InfoEntitys getInfoEntity()
    {
        return infoEntity;
    }

    public void setInfoEntity(InfoEntitys infoEntity)
    {
        this.infoEntity = infoEntity;
    }
    
    
}
