package StrategyDesignPattern.Models;

import StrategyDesignPattern.Strategies.NormalDriveStrategy;

public class Punch extends Vehicle 
{
	public Punch()
	{
		super(new NormalDriveStrategy());
	}
}
