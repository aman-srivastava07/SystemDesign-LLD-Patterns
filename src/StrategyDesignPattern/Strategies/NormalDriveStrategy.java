package StrategyDesignPattern.Strategies;

public class NormalDriveStrategy implements DriveStrategy 
{

	@Override
	public void drive() 
	{
		System.out.println("This is coming from Normal Drive Strategy");
	}
}
