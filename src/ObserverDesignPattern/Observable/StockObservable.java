package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable 
{
	public void add(NotificationAlertObserver obj);
	public void remove(NotificationAlertObserver obj);
	public void notifySubscribers();
	public void setData(int data);
	public int getData();
}
