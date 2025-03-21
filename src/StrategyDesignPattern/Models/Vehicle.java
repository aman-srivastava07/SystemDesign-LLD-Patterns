package StrategyDesignPattern.Models;

import StrategyDesignPattern.Strategies.DriveStrategy;

public class Vehicle 
{
	DriveStrategy driveStrategyObj;
	
	public Vehicle(DriveStrategy driveStrategyObj)
	{
		this.driveStrategyObj = driveStrategyObj;
	}
	
	//initially, we have this method only inside class.
	public void drive()
	{
		driveStrategyObj.drive();
	}

}
