package org.hob.beekeeper.apiary;

import java.util.Collection;
import java.util.Iterator;

import org.hob.beekeeper.domain.hive.Hive;

/**
 * Represents an apiary.
 */
public class Apiary
{
  private Collection<Hive> hives;
  
  public Iterator<Hive> getHives()
  {
	return hives.iterator();
  }
  
}
