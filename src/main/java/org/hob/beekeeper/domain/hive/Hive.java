package org.hob.beekeeper.domain.hive;

import java.util.Stack;

/**
 * Represents a beehive.
 * 
 */
public class Hive 
{
	private Stand stand;
	
	private BottomBoard bottomBoard;
	
	/** Body components that are stacked on each other. */
	private Stack<HiveBodyComponent> components;
	
	private InnerCover innerCover;
	
	private OuterCover outerCover;
	
	Hive(Stand stand, BottomBoard bottomBoard, Stack<HiveBodyComponent> components, InnerCover innerCover, OuterCover outerCover)
	{
	  this.stand = stand;
	  this.bottomBoard = bottomBoard;
	  this.components = components;
	  this.innerCover = innerCover;
	  this.outerCover = outerCover;
	}

	public Stand getStand()
	{
	  return stand;
	}

	public BottomBoard getBottomBoard()
	{
	  return bottomBoard;
	}

	public Stack<HiveBodyComponent> getComponents()
	{
	  return components;
	}

	public InnerCover getInnerCover()
	{
	  return innerCover;
	}

	public OuterCover getOuterCover()
	{
	  return outerCover;
	}
}

