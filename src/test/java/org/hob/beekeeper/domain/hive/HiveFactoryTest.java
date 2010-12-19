package org.hob.beekeeper.domain.hive;

import org.junit.Assert;
import org.junit.Test;

public class HiveFactoryTest
{
  @Test
  public void createClassic()
  throws Exception
  {
	Hive hive = HiveFactory.createClassic();
	Assert.assertNotNull(hive.getBottomBoard());
	Assert.assertNotNull(hive.getInnerCover());
	Assert.assertNotNull(hive.getOuterCover());
	Assert.assertNotNull(hive.getStand());
	Assert.assertNotNull(hive.getComponents());
	
	Assert.assertTrue(hive.getComponents().firstElement().isFull());
	
  }
}
