package StrategyDesignPattern.Strategies;

public class SpecialDriveStrategy implements DriveStrategy 
{

	@Override
	public void drive() 
	{
		System.out.println("This is coming from Special Drive Strategy");
		
	}
	

}
