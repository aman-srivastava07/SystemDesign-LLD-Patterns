package CommandDesignPattern;

import CommandDesignPattern.Command.TurnACOffCommand;
import CommandDesignPattern.Command.TurnACOnCommand;
import CommandDesignPattern.Invoker.MyRemoteControl;
import CommandDesignPattern.Receiver.AirConditioner;

public class Main 
{
	public static void main(String args[])
	{
		//It has-a object of Invoker
		MyRemoteControl remoteControlObject = new MyRemoteControl();
		
		remoteControlObject.setCommand(new TurnACOnCommand(new AirConditioner()));
		remoteControlObject.pressButton();
		
		remoteControlObject.setCommand(new TurnACOffCommand(new AirConditioner()));
		remoteControlObject.pressButton();
	}
}
