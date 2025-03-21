package CommandDesignPattern.Receiver;

public class AirConditioner 
{
	//Implement a simple class
	
	public boolean isOn = false;
	public int temperature;
	
	//public AirConditioner() {}; //default constructor exists by-default also, if we won't create it explicitly.
	
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
