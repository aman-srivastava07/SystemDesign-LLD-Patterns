package CORDesignPattern;

import CORDesignPattern.LoggerImpl.DebugLogProcessor;
import CORDesignPattern.LoggerImpl.ErrorLogProcessor;
import CORDesignPattern.LoggerImpl.InfoLogProcessor;
import CORDesignPattern.LoggerImpl.LogProcessor;

public class Main 
{
	public static void main(String args[])
	{
		//We want to implement this priority: INFO ->next-> DEBUG ->next-> ERROR
		LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
		
		logProcessor.log(LogProcessor.DEBUG, "Payload received from process api");
		logProcessor.log(LogProcessor.ERROR, "Error while retrieving the contacts");
		logProcessor.log(LogProcessor.INFO, "Successfully fetched contacts from DB");
		logProcessor.log(2, "Debug Log");
		logProcessor.log(5, "Successfully fetched contacts from DB");
	}
}
