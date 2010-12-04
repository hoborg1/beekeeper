package org.hob.beekeeper.system;

import java.util.List;

import org.hob.beekeeper.domain.parties.Person;

/**
 * Represents a system user.
 */
public class User
{
  private Long id;
  private String name;
  private List<Person> personProfiles;
  private UserState state;
}
