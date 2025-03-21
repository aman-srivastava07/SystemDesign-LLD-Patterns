package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class MobileAlert implements NotificationAlertObserver 
{
	private String mobileNumber;
	StockObservable stockObservable;
	
	public MobileAlert(String mobileNumber, StockObservable stockObservable)
	{
		this.mobileNumber = mobileNumber;
		this.stockObservable = stockObservable;
	}

	@Override
	public void update() 
	{
		sendSms(mobileNumber,"Hurray! You can continue your purchase");
	}
	
	private void sendSms(String mobileNumber,String message)
	{
		System.out.println("sms is sent to " + mobileNumber + " with message " + message);
	}
}
