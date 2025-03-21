package AdapterDesignPattern;

import AdapterDesignPattern.AdapteeInterface.WeightMachineForBabies;
import AdapterDesignPattern.AdapterInterface.WeightMachineAdapter;
import AdapterDesignPattern.AdapterInterface.WeightMachineAdapterImpl;

public class Main {

	public static void main(String args[]) 
	{
		//Make object of Adapter class only.
		WeightMachineAdapter obj = new WeightMachineAdapterImpl(new WeightMachineForBabies());
		
		System.out.println(obj.getWeightInKgs());
	}
}

//Output should be 28 * 0.45 = 12.6
