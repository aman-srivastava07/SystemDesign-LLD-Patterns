package CommandDesignPattern.Invoker;

import CommandDesignPattern.Command.ICommand;

public class MyRemoteControl 
{
	//It has-a object of Command
	//apply const-injection (but in a little different way, use setter)
	
	ICommand command;
	
//	public MyRemoteControl()   //default constructor exists by-default also, if we won't create it explicitly.
//	{
//		
//	}
	
	public void setCommand(ICommand command)
	{
		this.command = command;
	}
	
	public void pressButton()
	{
		command.execute();
	}
}
