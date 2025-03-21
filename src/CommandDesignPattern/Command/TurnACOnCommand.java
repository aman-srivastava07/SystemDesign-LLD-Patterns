package CommandDesignPattern.Command;

import CommandDesignPattern.Receiver.AirConditioner;

public class TurnACOnCommand implements ICommand 
{
	//It has-a object of Receiver
	//apply const-injection
	
	AirConditioner airConditioner;
	
	public TurnACOnCommand(AirConditioner airConditioner)
	{
		this.airConditioner = airConditioner;
	}

	@Override
	public void execute() 
	{
		airConditioner.turnACOn();
	}
}
