package interfaceproject;

public class ExceptionHandleDemo {


	public static void main(String[] args) {
		System.out.println("PROGRAM STARTED");
	
		try
		{	int a=50;
			a=50/2;	
			System.out.println(a);
		}
		catch(Exception e)
		{   
			System.out.println("Entered into Catch block");
		}
   System.out.println("Program completed");

	}

}
