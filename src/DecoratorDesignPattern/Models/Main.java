package DecoratorDesignPattern.Models;

import DecoratorDesignPattern.Decorator.ExtraCheese;
import DecoratorDesignPattern.Decorator.Jalapeno;
import DecoratorDesignPattern.Decorator.Paneer;

public class Main 
{
	public static void main(String args[])
	{
		//I want farmhouse pizza with extra cheese and paneer toppings
		BasePizza pizza = new Paneer(new ExtraCheese(new FarmhousePizza()));
		System.out.println(pizza.cost());  //output: 585
		
		//I want VeggieDelightPizza with extra cheese, paneer, jalapeno, extra cheese toppings
		BasePizza veggiePizza = new ExtraCheese(new Jalapeno(new Paneer(new ExtraCheese(new VeggieDelightPizza()))));
		System.out.println(veggiePizza.cost()); //output: 300 + 15 + 70 + 50 + 15 = 450
	}

}
