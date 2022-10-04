package interfaceproject;

public class ExceptionExample {                             //	System.out.println(a/0); ARITHMETIC EXCEPTIONS
	//TRY BLOCK WILL CAPTURE/throw EXCEPTIONS /CATCH WILL HANDLE EXCEPTION
	public static void main(String[] args) {

		System.out.println("PROGRAM STARTED....");
		System.out.println("PROGRAM PRORESS....");
		try
		{
			int a=50;
			System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Entered into catch block");

		}

		catch(NumberFormatException e)
		{
		


			System.out.println("Entered catch block again");
		}

		System.out.println("PROGRAM COMPLETED....");
		System.out.println("PROGRAM EXITED...."); 
		//String s="Nas";
		//int x=Integer.parseInt(s);
		//System.out.println(s);



	}

}
