package CORDesignPattern.LoggerImpl;

public class DebugLogProcessor extends LogProcessor 
{
	public DebugLogProcessor(LogProcessor nextLogProcessor) 
	{
		super(nextLogProcessor);
	}
		
	public void log(int logLevel, String logMessage)
	{
		if(logLevel == LogProcessor.DEBUG)
		{
			System.out.println("logged at logLevel " + logLevel + " with message " + logMessage);
		}
		else
		{
			super.log(logLevel, logMessage);
		}
	}
}
