package org.hob.beekeeper.service;

import javax.ejb.Stateless;
import javax.inject.Named;

import org.hob.beekeeper.PagesConst;

/**
 * Service responsible for authorizing users.
 */
@Named
@Stateless
public class Authorizator
{
  public String authorize(String name, String password)
  {
	// AuthCommand command = new AuthCommand(name, password);
	// TODO Here: request user auth data from DAO and compare hashed passwords
	return PagesConst.PAGE_ID_MAIN;
  }
}
