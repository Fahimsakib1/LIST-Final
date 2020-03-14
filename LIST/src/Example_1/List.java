package Example_1;

import java.util.ArrayList;

public class List 
{

	public static void main(String[] args) 
	{
            ArrayList<String> ob = new ArrayList<>();
	        
	        ob.add( " First Name : Fahim ");
	        ob.add( " Second Name : Rony ");
	        ob.add( " Third Name : Kutta ");
	        
	        System.out.println(ob.get(0)); // individual print er jonno command
	        System.out.println(ob.get(1)); // individual print er jonno command
	        System.out.println(ob.get(2)); // individual print er jonno command
	        
	        System.out.println(" ---------------------------  ");
	        
	        
	        System.out.println(" Size Of The List Is : " + ob.size());
	        System.out.println(" ---------------------------  ");
	        
	        
	        for ( int i = 0 ; i< ob.size(); i++)
	        	
	        	
	        {
	        	
	        	System.out.println(ob.get(i)); // for loop use kore sob gulo print
	        }
	        
	        
	        System.out.println(" ---------------------------  ");
	        
	        for (String i : ob)
	        {
	        	
	        	System.out.println(i); // for each loop use kore sob gulo print
	        }
	        
	        
	   }

}
