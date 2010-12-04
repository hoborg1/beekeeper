package org.hob.beekeeper.system;

/**
 * Represents user authorization data.
 */
public class UserAuthData
{
  Long userId;
  private String passMD5;
  
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
