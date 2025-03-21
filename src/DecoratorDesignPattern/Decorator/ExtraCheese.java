package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Models.BasePizza;

public class ExtraCheese extends ToppingsDecorator 
{
	//has-a
	BasePizza basePizza;
	
	public ExtraCheese(BasePizza basePizza)
	{
		this.basePizza = basePizza;
	}

	@Override //is-a
	public int cost() 
	{
		return basePizza.cost()+15;
	}
	

}
