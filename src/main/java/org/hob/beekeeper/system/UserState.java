package org.hob.beekeeper.system;

/**
 * Possible states of user in system.
 */
public enum UserState
{
  /** User exist but is deactivated or not yet activated. */
  INACTIVE,
  /** User is active. */
  ACTIVE,
  /** User is blocked (banned). */
  BLOCKED  
}
