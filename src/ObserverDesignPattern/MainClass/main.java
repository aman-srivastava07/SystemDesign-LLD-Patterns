package ObserverDesignPattern.MainClass;

import ObserverDesignPattern.Observable.IphoneStock;
import ObserverDesignPattern.Observable.StockObservable;
import ObserverDesignPattern.Observable.WashingMachineStock;
import ObserverDesignPattern.Observer.EmailAlert;
import ObserverDesignPattern.Observer.MobileAlert;
import ObserverDesignPattern.Observer.NotificationAlertObserver;

public class main
{
	public static void main(String args[])
	{
		//Create object of Observable
		StockObservable iphoneObservable = new IphoneStock();
		StockObservable washingMachineObservable = new WashingMachineStock();
		
		//Create object of Observer
		NotificationAlertObserver observer1 = new EmailAlert("karan@gmail.com", iphoneObservable);
		NotificationAlertObserver observer2 = new EmailAlert("tanya@gmail.com", iphoneObservable);
		NotificationAlertObserver observer3 = new MobileAlert("7976414181", washingMachineObservable);
		NotificationAlertObserver observer4 = new EmailAlert("aman@gmail.com", washingMachineObservable);
		
		iphoneObservable.add(observer1);
		iphoneObservable.add(observer2);
		washingMachineObservable.add(observer3);
		washingMachineObservable.add(observer4);
		
		iphoneObservable.setData(21);
		washingMachineObservable.setData(7);
		
	}

}
