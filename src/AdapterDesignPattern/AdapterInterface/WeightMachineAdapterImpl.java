package AdapterDesignPattern.AdapterInterface;

import AdapterDesignPattern.AdapteeInterface.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter 
{
	//It has-a object of Adaptee Interface.
	//Apply constructor-injection
	
	WeightMachine weightMachine;
	
	public WeightMachineAdapterImpl(WeightMachine weightMachine)
	{
		this.weightMachine = weightMachine;
	}
	
	@Override
	public double getWeightInKgs() 
	{
		double weight = weightMachine.getWeightInPounds();
		double weightInKg = weight * 0.45;
		return weightInKg;		
	}

}
