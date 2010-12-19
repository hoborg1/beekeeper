package org.hob.beekeeper.domain.hive;

import org.junit.Assert;
import org.junit.Test;

public class CombCellAreaTest
{
  @Test
  public void getTotalArea()
  {
	CombCellArea area = new CombCellArea(0, 0);
	int areaSize = area.getTotalArea();
	Assert.assertEquals(25, areaSize);

  }
}
