package CommandDesignPatternWithUndoFunctionality.Client;

import CommandDesignPatternWithUndoFunctionality.Command.ICommand;
import CommandDesignPatternWithUndoFunctionality.Command.TurnACOffCommand;
import CommandDesignPatternWithUndoFunctionality.Command.TurnACOnCommand;
import CommandDesignPatternWithUndoFunctionality.Invoker.MyRemoteControl;
import CommandDesignPatternWithUndoFunctionality.Receiver.AirConditioner;


public class Main {

	public static void main(String[] args) 
	{
		//It has-a object of Invoker
		MyRemoteControl remoteControlObject = new MyRemoteControl();
		
		remoteControlObject.setCommand(new TurnACOnCommand(new AirConditioner()));
		remoteControlObject.pressButton();
		remoteControlObject.undoCommand();
		
		remoteControlObject.setCommand(new TurnACOffCommand(new AirConditioner()));
		remoteControlObject.pressButton();
		remoteControlObject.undoCommand();
	}

}
