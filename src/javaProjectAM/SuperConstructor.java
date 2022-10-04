package javaProjectAM;

public class SuperConstructor {
	SuperConstructor()
	{
		System.out.println("Parent");
	}
	public class DuperConstructor extends SuperConstructor
	{
		DuperConstructor()
		{
			System.out.println("child");
		}
		
	}



}
