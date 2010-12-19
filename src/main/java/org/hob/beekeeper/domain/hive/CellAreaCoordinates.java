package org.hob.beekeeper.domain.hive;

/**
 * Represents the location of a comb area.
 */
public class CellAreaCoordinates
{
  private int x, y;
  
  public int getX()
  {
	return x;
  }
  
  public int getY()
  {
	return y;
  }
  
  public CellAreaCoordinates(int x, int y)
  {
	this.x = x;
	this.y = y;
  }
}
