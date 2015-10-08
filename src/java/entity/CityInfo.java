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
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Jeanette
 */
@Entity
public class CityInfo implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    private String zip;
    private String city;
    
    @OneToMany(mappedBy = "cityInfo", cascade={CascadeType.ALL})
    List<Address> AddList = new ArrayList();

    public CityInfo()
    {
    }

    public CityInfo(String zip, String city)
    {
        this.zip = zip;
        this.city = city;
    }
    
    public String getZip()
    {
        return zip;
    }

    public void setZip(String zip)
    {
        this.zip = zip;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }   

    public List<Address> getAddList()
    {
        return AddList;
    }

    public void setAddList(List<Address> AddList)
    {
        this.AddList = AddList;
    }
    
    public void addAddress(Address address)
    {
        AddList.add(address);
    }
    
    
}
