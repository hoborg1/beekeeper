package org.hob.beekeeper.domain.hive;

/**
 * Represents a classic hive frame.
 *
 */
public class Frame 
{
  /** Frame width in millimeters. */
  public static final int WIDTH = 483;
  /** Frame height in millimeters. */
  public static final int HEIGHT = 159;
  private HoneyComb leftComb = new HoneyComb(WIDTH, HEIGHT);
  private HoneyComb rightComb = new HoneyComb(WIDTH, HEIGHT);
  
  public HoneyComb getLeftComb()
  {
    return leftComb;
  }
  public HoneyComb getRightComb()
  {
    return rightComb;
  }
  
  
}
