package ProxyDesignPattern.EmployeeTableObject;

import ProxyDesignPattern.ConcreteClasses.EmployeeDaoProxy;

public class Main {

	public static void main(String[] args) 
	{
		//Create object of proxy class
		EmployeeDao obj = new EmployeeDaoProxy();
	    //VVI to Note: parent class (here EmployeeDao) and Main class should be under same folder.
		try //because we have used throws and throw
		{
			//obj.create("USER", new EmployeeDo());
			obj.create("ADMIN", new EmployeeDo());
		} 
		catch (Exception e) 
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
