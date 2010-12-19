package org.hob.beekeeper.domain.hive;

import java.util.Stack;

public class HiveFactory
{
  public static Hive createClassic()
  {
	HiveBodyComponent component = new BodyComponentFactory().createClassic();
	Stack<HiveBodyComponent> stack = new Stack<HiveBodyComponent>();
	stack.add(component);
	return new Hive(new Stand(), new BottomBoard(), stack, new InnerCover(), new OuterCover());
  }
}
