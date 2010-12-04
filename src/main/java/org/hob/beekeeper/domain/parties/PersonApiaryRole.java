package org.hob.beekeeper.domain.parties;

/**
 * Represents a role of a {@link Person} in an {@link Apiary}.
 */
public class PersonApiaryRole
{
  private Long parentPersonId;
  private Long apiaryId;
  private PersonApiaryRoleType type;
  
  public Long getParentPersonId()
  {
    return parentPersonId;
  }
  
  public Long getApiaryId()
  {
    return apiaryId;
  }
  
  public PersonApiaryRoleType getType()
  {
    return type;
  }
  
}
