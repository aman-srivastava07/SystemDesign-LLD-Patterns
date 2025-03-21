package FactoryDesignPattern.Factory;

import FactoryDesignPattern.Circle;
import FactoryDesignPattern.Rectangle;
import FactoryDesignPattern.Shape;
import FactoryDesignPattern.Square;

public class ShapeFactory 
{
	Shape getObject(String input)
	{
		switch(input)
		{
			case "CIRCLE":
				return new Circle();
			
			case "RECTANGLE":
				return new Rectangle();
			
			case "SQUARE":
				return new Square();
			
			default:
				return null;		
		}
	}

}
