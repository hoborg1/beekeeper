package org.hob.beekeeper.domain.hive;

import org.junit.Test;

public class HoneyCombTest
{
  @Test
  public void getTotalAreas()
  {
	HoneyComb comb = new HoneyComb(483, 159);
	System.out.println(comb.getTotalCells());
  }
}
