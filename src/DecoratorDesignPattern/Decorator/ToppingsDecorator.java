package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Models.BasePizza;

public abstract class ToppingsDecorator extends BasePizza 
{
	//It has both 'has-a' 'is-a' relation
	//And because it is a abstract class, now all its child should have to implement base class's abstract methods.
}
