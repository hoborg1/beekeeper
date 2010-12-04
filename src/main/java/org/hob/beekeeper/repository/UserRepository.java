package org.hob.beekeeper.repository;

import org.hob.beekeeper.system.User;

public interface UserRepository
{
  User getForName();
  User getForId();
}
