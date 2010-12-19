package org.hob.beekeeper.domain.hive;

public class BodyComponentFactory
{
  public HiveBodyComponent createClassic()
  {
	HiveBodyComponent component = new HiveBodyComponent();
	
	for (int i=0; i< HiveBodyComponent.MAX_CAPACITY; i++)
	{
	  Frame frame = new Frame();
	  component.add(frame);
	}
	return component;
  }
}
