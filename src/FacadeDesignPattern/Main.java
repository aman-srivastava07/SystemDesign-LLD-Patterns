package FacadeDesignPattern;

import FacadeDesignPattern.Model.EmployeeFacade;

public class Main {

	public static void main(String[] args) 
	{
		//create object of facade layer only.
		EmployeeFacade obj = new EmployeeFacade();
		obj.insertDataInEmployeeTable();
		obj.deleteDataFromEmployeeTable(1231);
	}
}
