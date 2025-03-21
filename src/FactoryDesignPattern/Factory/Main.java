package FactoryDesignPattern.Factory;

import FactoryDesignPattern.Shape;

public class Main 
{
	public static void main(String args[])
	{
		//Create object of ShapeFactory only
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape obj = shapeFactory.getObject("CIRCLE");
		//Shape obj = shapeFactory.getObject("RECTANGLE");
		//Shape obj = shapeFactory.getObject("SQUARE");
		//Shape obj = shapeFactory.getObject("CIRCE");
		obj.draw();
	}

}
