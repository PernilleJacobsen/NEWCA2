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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Jeanette
 */
@Entity
public class Address implements Serializable
{   
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String street;
    private String additionalInfo;
    
    @ManyToOne(cascade={CascadeType.ALL})
    private CityInfo cityInfo;
    
    @OneToMany(mappedBy = "address", cascade={CascadeType.ALL})
    private List<InfoEntitys> infoList = new ArrayList();

    public Address()
    {
    }
    
    public Address(String street, String additionalInfo, CityInfo cityInfo)
    {
        this.street = street;
        this.additionalInfo = additionalInfo;
        this.cityInfo = cityInfo;
    }
    
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getAdditionalInfo()
    {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo)
    {
        this.additionalInfo = additionalInfo;
    }

    public CityInfo getCityInfo()
    {
        return cityInfo;
    }

    public void setCityInfo(CityInfo cityInfo)
    {
        this.cityInfo = cityInfo;
    }

    public List<InfoEntitys> getInfoList()
    {
        return infoList;
    }

    public void setInfoList(List<InfoEntitys> infoList)
    {
        this.infoList = infoList;
    }
    
    
    
}
