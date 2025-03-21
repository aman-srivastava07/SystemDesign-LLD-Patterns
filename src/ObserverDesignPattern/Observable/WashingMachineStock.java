package ObserverDesignPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

public class WashingMachineStock implements StockObservable 
{
	List<NotificationAlertObserver> objList = new ArrayList<NotificationAlertObserver>();
	int currentStock = 0;

	@Override
	public void add(NotificationAlertObserver obj) 
	{
		objList.add(obj);
	}

	@Override
	public void remove(NotificationAlertObserver obj) 
	{
		objList.remove(obj);
	}

	@Override
	public void notifySubscribers() 
	{
		for(NotificationAlertObserver notificationAlertObserver : objList)
		{
			notificationAlertObserver.update();
		}
	}

	@Override
	public void setData(int data) 
	{
		if(currentStock == 0)
		{
			notifySubscribers();
		}
		currentStock = currentStock + data;
		
	}

	@Override
	public int getData() 
	{
		return currentStock;
	}

}
