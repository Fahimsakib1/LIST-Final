package Example_4_Add_And_Remove;

import java.util.ArrayList;

public class List 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> ob = new ArrayList<>();
		
		System.out.println("Before Adding Elements, Size Of The Array List Is : " + ob.size()); // List er moddhe kino element  add kora hy  nai
		
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(3, 40); // index 3 te value 40
		
		System.out.println("List Of Elements After Adding : " + ob);
		System.out.println("After Adding Elements Size Of Array List Is : " + ob.size());
		System.out.println();
		
		
		System.out.println("*********** Now We Will Remove The Index 1 Value Which Is 20 From The List **********" );
		System.out.println();
		ob.remove(1); // Index 1 Remove Kora Holo
		System.out.println("List Of Elements After Removing : " + ob);
		System.out.println("After Removing Elements Size Of Array List Is : " + ob.size());
		
		
		/**System.out.println("*********** Now We Will Remove The Index 3 Value Which Is 40 From The List **********" );
		System.out.println();
		ob.remove(3); // Index 3 Remove Kora Holo                      // remove kora jay na 
		System.out.println("Elements Of Lists After Removing : " + ob);
		System.out.println("After Removing Elements Size Of Array List Is : " + ob.size());**/
		
		
		
		
		
		

	}

}
