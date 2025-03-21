package StrategyDesignPattern.Models;

import StrategyDesignPattern.Strategies.DriveStrategy;
import StrategyDesignPattern.Strategies.VIPDriveStrategy;

public class Mercedes extends Vehicle 
{
	//now, we are not overriding drive() method. Instead we are passing the strategy object inside super() which we want to call.
	public Mercedes() 
	{
		super(new VIPDriveStrategy());
	}
}
