package org.hob.beekeeper.domain.parties;

import java.util.List;

/**
 * Represents a person who participate in running apiaries.
 */
public class Person
{
  private Long id;
  private List<PersonApiaryRole> apiaryRoles;
  private PersonCredentials credentials;
  
  public Long getId()
  {
    return id;
  }
  public List<PersonApiaryRole> getApiaryRoles()
  {
    return apiaryRoles;
  }
  public PersonCredentials getCredentials()
  {
    return credentials;
  }
}
