package org.hob.beekeeper.system;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Represents user authorization data.
 */
@Entity
public class UserAuthData
{
  @Id
  Long userId;
  
  @Column
  String passMD5;
  
  public boolean equalsMD5(String md5)
  {
	if (passMD5 == null && md5 == null)
	{
	  return true;
	}
	if (passMD5 == null)
	{
	  return false;
	}
	return (passMD5.equals(md5));
  }
}
