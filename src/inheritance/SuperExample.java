package inheritance;

public class SuperExample 
{
		String s="Naseer";
		void display()

{
			System.out.println("This is immediate parent method");
			}
}

class SuperExample2 extends SuperExample
{
	    String s="Maheer";
	    int a=10;
	    void print()
	    {
	    	System.out.println(s);
	    }
	    void display()
	    {
			System.out.println("this is child method");
			

			
		
			

	    }

	
	
	

}
