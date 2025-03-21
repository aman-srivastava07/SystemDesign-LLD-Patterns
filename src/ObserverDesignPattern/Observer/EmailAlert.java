package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailAlert implements NotificationAlertObserver 
{
	//Observer concrete class has-a object of observable class.
	private String emailId;
	StockObservable stockObservable;
	
	public EmailAlert(String emailId, StockObservable stockObservable)
	{
		this.emailId = emailId;
		this.stockObservable = stockObservable;
	}
    
	//At priority
	@Override
	public void update() 
	{
		sendEmail(emailId,"Hurray! You can continue your purchase");
	}
	
	private void sendEmail(String emailId,String message)
	{
		System.out.println("mail is sent to " + emailId + " with message " + message);
	}
	

}
