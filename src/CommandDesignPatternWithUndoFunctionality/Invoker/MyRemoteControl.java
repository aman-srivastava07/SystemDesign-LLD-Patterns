package CommandDesignPatternWithUndoFunctionality.Invoker;

import java.util.Stack;

import CommandDesignPatternWithUndoFunctionality.Command.ICommand;

public class MyRemoteControl 
{
	
	ICommand command;
	
	Stack<ICommand> acCommandHistory = new Stack<>();
	
	public void setCommand(ICommand command)
	{
		this.command = command;
	}
	
	public void pressButton()
	{
		command.execute();
		acCommandHistory.add(command);
	}
	
	public void undoCommand()
	{
		if(!acCommandHistory.isEmpty())
		{
			ICommand lastUsedCommand = acCommandHistory.pop();
			lastUsedCommand.undo();
		}
	}
}
