package ProxyDesignPattern.ConcreteClasses;

import ProxyDesignPattern.EmployeeTableObject.EmployeeDao;
import ProxyDesignPattern.EmployeeTableObject.EmployeeDo;

public class EmployeeDaoProxy implements EmployeeDao 
{
	//Rule1: It has-a object of EmployeeDao concrete class.
	//Rule2: Inside implementation of method, first we have to implement access-restriction or
	//caching or pre/post processing or centralized logging and then we have to call the function using
	//concrete class's object
	
	EmployeeDao employeeDao;
	
	public EmployeeDaoProxy()
	{
		//direct assignment
		employeeDao = new EmployeeDaoImpl();
	}
	
	@Override
	public void create(String client, EmployeeDo obj) throws Exception 
	{
		//how to compare two string in java ?
		//s1 == s2 (No, as it compares both value and address)
		//s1.equals(s2) Yes, as it compares only value.
		
		if(client.equals("ADMIN"))
		{
			employeeDao.create(client, obj);
		}
		else
		{
			throw new Exception("Access Denied!!");
		}
	}

	@Override
	public void delete(String client, int employeeId) throws Exception 
	{
		if(client.equals("ADMIN"))
		{
			employeeDao.delete(client, employeeId);
		}
		else
		{
			throw new Exception("Access Denied!!");
		}
		
	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception 
	{
		if(client.equals("ADMIN") || client.equals("USER"))
		{
			return employeeDao.get(client, employeeId);
		}
		else
		{
			throw new Exception("Access Denied!!");
		}
	}

}
