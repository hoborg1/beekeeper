package org.hob.beekeeper.service;

import org.hob.beekeeper.system.command.AuthCommand;

/**
 * Service responsible for authorizing users.
 */
public class Authorizator
{
  public void authorize(AuthCommand authCommand)
  {
	// Here: request user auth data from DAO and compare hashed passwords
  }
}
