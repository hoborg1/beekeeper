package org.hob.beekeeper.domain.hive;

import java.util.Iterator;
import java.util.LinkedList;

public class HiveBodyComponent
{
  private LinkedList<Frame> frames = new LinkedList<Frame>();
  public static final int MAX_CAPACITY = 10;
  
  public Iterator<Frame> getFrames()
  {
	return frames.iterator();
  }
  
  public boolean isFull()
  {
	return frames.size() == MAX_CAPACITY;
  }
  
  public Frame removeFrame(int index)
  {
	return frames.remove(index);
  }
  
  /**
   * Inserts a new frame to the end of this component.
   * @param frame frame to be added.
   * @throws ArrayIndexOutOfBoundsException if the component is full.
   */
  public void add(Frame frame)
  {
	insertFrame(framesCount(), frame);
  }
  
  public int framesCount()
  {
	return frames.size();
  }
  
  /**
   * Adds a new frame at the specified index.
   * @param leftFrameIndex index, where the frame should be placed (starting from 0).
   * @throws ArrayIndexOutOfBoundsException if the component is full or index is incorrect. 
   */
  public void insertFrame(int frameIndex, Frame frame)
  {
	if (isFull())
	{
	  throw new ArrayIndexOutOfBoundsException("Cannot add any more frames to body component!");
	}
	frames.add(frameIndex, frame);
  }
}
