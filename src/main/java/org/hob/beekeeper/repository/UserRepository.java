package org.hob.beekeeper.repository;

import javax.ejb.Local;

import org.hob.beekeeper.system.User;

@Local
public interface UserRepository
{
  User getForName(String name);
  User getForId(Long id);
}
