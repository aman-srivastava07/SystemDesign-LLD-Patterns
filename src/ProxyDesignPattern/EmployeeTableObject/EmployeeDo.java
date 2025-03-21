package ProxyDesignPattern.EmployeeTableObject;

public class EmployeeDo 
{
	//01
	private String name;
	private Long id;
	private String department;
	private double salary;
	
	//02
	public EmployeeDo()
	{
		
	}
	
	public EmployeeDo(String name, Long id, String department, double salary)
	{
		this.name = name;
		this.id = id;
		this.department = department;
		this.salary = salary;
	}
	
	//03
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	//04
	@Override
	public String toString()
	{
		return "EmployeeDo class has name = " + name + ", id = " + id + ", department = " + department + ", and salary = " + salary;
	}

}
