/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Jeanette
 */
@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class InfoEntitys implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    
    @OneToMany(mappedBy = "infoEntity", cascade={CascadeType.ALL})
    private List<Phone> phoneList = new ArrayList();
    
    @ManyToOne(cascade={CascadeType.ALL})
    private Address address;

    public InfoEntitys()
    {
    }

    public InfoEntitys(String email, Address address)
    {
        this.email = email;
        this.address = address;
    }    
    
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public List<Phone> getPhoneList()
    {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList)
    {
        this.phoneList = phoneList;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public void addPhone(Phone phone)
    {
        phoneList.add(phone);
    }  
}
