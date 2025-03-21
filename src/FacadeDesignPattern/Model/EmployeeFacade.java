package FacadeDesignPattern.Model;

public class EmployeeFacade 
{
	//It has-a object of previous class
	//do constructor-injection
	
	EmployeeDAO employeeDao;
	
	public EmployeeFacade()
	{
		this.employeeDao = new EmployeeDAO();  //direct implementation obv
	}
	
	//Out of 100 methods, client needs below 2 methods only.
	public void insertDataInEmployeeTable()
	{
		employeeDao.insert();
	}
	
	public void deleteDataFromEmployeeTable(int empId)
	{
		employeeDao.delete(empId);
	}
}
