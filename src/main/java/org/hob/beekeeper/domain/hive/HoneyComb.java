package org.hob.beekeeper.domain.hive;

/**
 * Represents a waxy comb built on each size of a frame.
 * Comb is a matrix of cell areas ({@link CombCellArea}).
 */
public class HoneyComb 
{
  private int width;
  private int height;
  
  private int areasX = 0;
  private int areasY = 0;
  
  private int totalAreas = 0;
  private int totalCells = 0;
  
  public CombCellArea[][] areaMatrix = null;
  /**
   * Creates a new empty honeycomb object.
   * @param width comb width in millimeters.
   * @param height comb height in millimeters.
   */
  public HoneyComb(int width, int height)
  {
	this.width = width;
	this.height = height;
	// Calculating the number of areas in each dimension
	areasX = (int)Math.round(Double.valueOf((double)width / CombCell.AVERAGE_SIZE / (double)CombCellArea.MAX_WIDHT).doubleValue());
	areasY = (int)Math.round(Double.valueOf((double)height / CombCell.AVERAGE_SIZE / (double)CombCellArea.MAX_HEIGHT).doubleValue());
	totalAreas = areasX * areasY;
	// Initialization of area matrix
	areaMatrix = new CombCellArea[areasX][areasY];
	// Filling area matrix with new empty areas
	for (int x = 0; x < areasX - 1; x++)
	  for (int y = 0; y < areasY - 1; y++)
	  {
		CombCellArea area = new CombCellArea(x, y);
		totalCells += area.getTotalArea();
		areaMatrix[x][y] = area;
	  }
  }
  public int getWidth()
  {
    return width;
  }
  public int getHeight()
  {
    return height;
  }
  public int getAreasX()
  {
    return areasX;
  }
  public int getAreasY()
  {
    return areasY;
  }
  public int getTotalAreas()
  {
    return totalAreas;
  }
  public int getTotalCells()
  {
    return totalCells;
  }
}
