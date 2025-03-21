package CommandDesignPatternWithUndoFunctionality.Receiver;

public class AirConditioner 
{	
	public boolean isOn = false;
	public int temperature;
	
	public AirConditioner() {};
	
	public void turnACOn()
	{
		isOn = true;
		System.out.println("AC gets turned on!!");
	}
	
	public void turnACOff()
	{
		isOn = false;
		System.out.println("AC gets turned off!!");
	}
	
	public void setACTemperature(int temp)
	{
		this.temperature = temp;
		System.out.println("AC tempearture set to " + temperature);
	}
}
