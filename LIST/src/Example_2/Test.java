package Example_2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) 
	
	{
		 ArrayList<Student> ob = new ArrayList<>();
		 
		 Student S1 = new Student (100 , " Fahim ");
		 Student S2 = new Student (200 , " Faysal ");
		 Student S3 = new Student (300 , "  Sakib ");
		 
		 ob.add(S1);
		 ob.add(S2);
		 ob.add(S3);
		 
		 
		  for ( int i = 0 ; i< ob.size(); i++)
	        	
	        	
	        {
	        	
	        	System.out.println(ob.get(i)); // for loop use kore sob gulo print
	        }
		  
		  System.out.println("********************************" );
		 
		 
		 for ( Student i : ob)
		 {
			 
			 System.out.println(i); // for each loop
		 }
		 
		 System.out.println("********************************" );
		 
		 System.out.println(ob.get(0)); // For individual print. Print Korbe 100, Fahim
		 System.out.println(ob.get(1)); // For individual print. Print Korbe 200, Faysal
		 System.out.println(ob.get(2)); // For individual print. Print Korbe 300, Sakib
		 

	}

}
