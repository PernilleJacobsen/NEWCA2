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
import javax.persistence.ManyToMany;

/**
 *
 * @author Jeanette
 */
@Entity
public class Person extends InfoEntitys implements Serializable
{
    private Integer id;
    private String firstName;
    private String lastName;
    
    @ManyToMany(cascade={CascadeType.ALL})
    private List<Hobby> hobbys = new ArrayList();

    public Person()
    {
        super();
    }

    public Person(String firstName, String lastName, String email, Address address)
    {
        super(email, address);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public List<Hobby> getHobbys()
    {
        return hobbys;
    }

    public void setHobbys(List<Hobby> hobbys)
    {
        this.hobbys = hobbys;
    }
    
     public void addHobby(Hobby hobby) 
     {
        hobbys.add(hobby);
    }
    
    
    public void removeHobby(Hobby hobby) 
    {
        if (hobbys.contains(hobby)) 
        {
            hobbys.remove(hobbys.indexOf(hobby));
        }
    }

}
