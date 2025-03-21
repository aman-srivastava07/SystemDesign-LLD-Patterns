package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Models.BasePizza;

public class Paneer extends ToppingsDecorator 
{
	BasePizza basePizza;
	
	public Paneer(BasePizza basePizza)
	{
		this.basePizza = basePizza;
	}

	@Override
	public int cost() 
	{
		return basePizza.cost() + 70;
	}

}
