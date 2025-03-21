package FacadeDesignPattern.Model;

public class EmployeeDAO 
{
	public void insert()
	{
		System.out.println("Data has been successfully inserted in Employee Table");
	}
	
	public void update(int employeeId)
	{
		System.out.println("Employee with employeeId " + employeeId + " is successfully updated");
	}
	
	public void fetch(int employeeId)
	{
		System.out.println("Employee with employeeId " + employeeId + " is successfully retrieved");
	}
	
	public void delete(int employeeId)
	{
		System.out.println("Employee with employeeId " + employeeId + " is successfully deleted");
	}

}
