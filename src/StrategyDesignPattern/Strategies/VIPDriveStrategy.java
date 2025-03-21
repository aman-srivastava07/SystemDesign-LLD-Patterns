package StrategyDesignPattern.Strategies;

public class VIPDriveStrategy implements DriveStrategy 
{

	@Override
	public void drive() 
	{
		System.out.println("This is coming from VIP Drive Strategy");
		
	}

}
