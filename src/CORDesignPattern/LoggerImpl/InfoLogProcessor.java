package CORDesignPattern.LoggerImpl;

public class InfoLogProcessor extends LogProcessor 
{
	//we require two important things here.
	public InfoLogProcessor(LogProcessor nextLogProcessor) 
	{
		super(nextLogProcessor);
	}
	
	public void log(int logLevel, String logMessage)
	{
		//star: 2
		if(logLevel == LogProcessor.INFO)  //if(logLevel == 1)
		{
			System.out.println("logged at logLevel " + logLevel + " with message " + logMessage);
		}
		else
		{
			//we already given next log processor inside constructor
			super.log(logLevel, logMessage);
		}
	}

}
