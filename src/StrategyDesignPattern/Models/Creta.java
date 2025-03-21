package StrategyDesignPattern.Models;

import StrategyDesignPattern.Strategies.DriveStrategy;
import StrategyDesignPattern.Strategies.SpecialDriveStrategy;

public class Creta extends Vehicle 
{
	public Creta() 
	{
		super(new SpecialDriveStrategy());
	}
}
