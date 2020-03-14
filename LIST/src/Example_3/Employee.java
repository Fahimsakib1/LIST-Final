package Example_3;

public class Employee 

{
        private int id;
		private String name;
		private double salary;
		
		
		
		public Employee() 
		{
			super();
		}



		public Employee(int id, String name , double salary)
		{
			super();
			this.id = id;
			this.name = name;
			this.salary=salary;
			
		}



		@Override
		public String toString() 
		{
			
		    //System.out.println(" Information Of Employee : ");
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
		
}