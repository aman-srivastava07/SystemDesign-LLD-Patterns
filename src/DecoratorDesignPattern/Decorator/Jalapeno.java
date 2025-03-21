package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Models.BasePizza;

public class Jalapeno extends ToppingsDecorator 
{
	BasePizza basePizza;
	
	public Jalapeno(BasePizza basePizza)
	{
		this.basePizza = basePizza;
	}

	@Override
	public int cost() 
	{
		return basePizza.cost() + 50;
	}

}
