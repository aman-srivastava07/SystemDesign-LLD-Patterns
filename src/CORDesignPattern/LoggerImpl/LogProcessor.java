package CORDesignPattern.LoggerImpl;

public abstract class LogProcessor 
{
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	//we require three important things here.
	LogProcessor nextLogProcessor;
	
	public LogProcessor(LogProcessor nextLogProcessor)
	{
		this.nextLogProcessor = nextLogProcessor;
	}
	
	public void log(int logLevel, String logMessage)
	{
		//star: 1
		if(nextLogProcessor != null)
		{
			nextLogProcessor.log(logLevel, logMessage);
		}
		else
		{
			System.out.println("You enterted an invalid logLevel");
		}
	}

}
