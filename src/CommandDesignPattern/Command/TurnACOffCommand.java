package CommandDesignPattern.Command;

import CommandDesignPattern.Receiver.AirConditioner;

public class TurnACOffCommand implements ICommand 
{
	//It has-a object of Receiver
	//apply const-injection
		
	AirConditioner airConditioner;
		
	public TurnACOffCommand(AirConditioner airConditioner)
	{
		this.airConditioner = airConditioner;
	}

	@Override
	public void execute() 
	{
		airConditioner.turnACOff();
	}
}
