package org.hob.beekeeper.system.command;

import org.hob.beekeeper.utils.MD5;

/** 
 * User authorization command.
 */
public class AuthCommand
{
  String userName;
  String passwordMD5;
  
  public AuthCommand(String userName, String password)
  
  {
	this.userName = userName;
	this.passwordMD5 = MD5.calculateHash(password);
  }

  public String getUserName()
  {
    return userName;
  }

  public String getPasswordMD5()
  {
    return passwordMD5;
  }
}
