package org.hob.beekeeper.domain.hive;

import java.util.Stack;

import javax.enterprise.inject.Model;

@Model
public class HiveFactory
{
  public Hive createClassic()
  {
	HiveBodyComponent component = new HiveBodyComponent();
	Stack<HiveBodyComponent> stack = new Stack<HiveBodyComponent>();
	
	//return new Hive(new Stand(),
	return null;
  }
}
