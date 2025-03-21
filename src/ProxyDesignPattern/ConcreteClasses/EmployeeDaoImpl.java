package ProxyDesignPattern.ConcreteClasses;

import ProxyDesignPattern.EmployeeTableObject.EmployeeDao;
import ProxyDesignPattern.EmployeeTableObject.EmployeeDo;

public class EmployeeDaoImpl implements EmployeeDao 
{
	@Override
	public void create(String client, EmployeeDo obj) throws Exception 
	{
		System.out.println("A new row is successfully added!!");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception 
	{
		System.out.println("Employee with id " + employeeId + " is successfully deleted!!");
	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception 
	{
		System.out.println("Employee with employeeId " + employeeId + " is successfully fetched!!");
		return new EmployeeDo();
	}

}
