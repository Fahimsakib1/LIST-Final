package Example_3;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) 
	{
		ArrayList<Employee> ob = new ArrayList<>();
		
		Employee E1 = new Employee (100, " Fahim " , 2000000.00);
		Employee E2 = new Employee (200, " Faysal " , 50000.00);
		Employee E3 = new Employee (300, " Rony " , 20000.00);
		
		ob.add(E1);
		ob.add(E2);
		ob.add(E3);
		
		
		
		
		for ( Employee i : ob)
		{
			
			System.out.println(i); // for-each loop
		}
					
		
}

}
