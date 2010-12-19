package org.hob.beekeeper.domain.time;

/**
 * Beekeeper timed object (not to be mistaken with EJB TimedObject interface).
 */
public interface BkpTimedObject
{
  void tick();
}
