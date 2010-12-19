package org.hob.beekeeper.system;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hob.beekeeper.domain.parties.Person;

/**
 * Represents a system user.
 */
@Entity
public class User implements Serializable
{
  private static final long serialVersionUID = -5179743796382683212L;
  
  public static final String ORM_COLUMN_NAME = "name"; 
  
  @Id
  Long id;
  
  @Column(name="name")
  String name;
  
  @Column
  List<Person> profiles;
  
  User(){};
  
  public Iterator<Person> getProfiles()
  {
	return profiles.iterator();
  }
  
  public Long getId()
  {
    return id;
  }
  public String getName()
  {
    return name;
  }
  public List<Person> getPersonProfiles()
  {
    return personProfiles;
  }
  public UserState getState()
  {
    return state;
  }
  private List<Person> personProfiles;
  private UserState state;
}
