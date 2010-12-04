package org.hob.beekeeper.repository;

import java.util.Collection;

import org.hob.beekeeper.domain.parties.Person;

public interface PersonRepository
{
  Person getForId();
  Collection<Person> getAllForUser();
}
