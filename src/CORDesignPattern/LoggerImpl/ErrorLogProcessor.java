package CORDesignPattern.LoggerImpl;

public class ErrorLogProcessor extends LogProcessor 
{
	public ErrorLogProcessor(LogProcessor nextLogProcessor) 
	{
		super(nextLogProcessor);
	}
	
	public void log(int logLevel, String logMessage)
	{
		if(logLevel == LogProcessor.ERROR)
		{
			System.out.println("logged at logLevel " + logLevel + " with message " + logMessage);
		}
		else
		{
			super.log(logLevel, logMessage);
		}
	}
}
