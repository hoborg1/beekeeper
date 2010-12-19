package org.hob.beekeeper.domain.hive;

/**
 * Represents a rectangular area of cells.
 * WARNING: Because an area cannot contain ideal A x B rectangle
 * (which is caused by specific cell shape), an area is in fact
 * a rectangle with different row sizes.
 */
public class CombCellArea 
{
  
  /** Maximum height of area (in cells). */
  public static final int MAX_HEIGHT = 5;
  
  /** Maximum width of area (in cells). */
  public static final int MAX_WIDHT = 5;
  
  public CellAreaCoordinates coordinates;
  
  /** Creates a new area with coordinates of x and y. */
  public CombCellArea(int x, int y)
  {
	this.coordinates = new CellAreaCoordinates(x, y);
	this.totalArea = computeTotalArea();
	createEmptyCells();
  }
  
  private void createEmptyCells()
  {
	
  }
  private int computeTotalArea()
  {
	return MAX_HEIGHT * MAX_WIDHT;
  }
  
  private int totalArea;
  
  /**
   * Returns total area (in cells).
   */
  public int getTotalArea()
  {
	return totalArea;
  }
}
