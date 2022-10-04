package javaProjectAM;

public class Arraydeclare {
	public static void main(String args[])
	{
		Object a[]= {100,200,"Naseer",400,500};   //declare an array
		/*for(int i=0;i<a.length;i++)
			System.out.println(a[i]);  */
		for(Object i:a) 
		{
			System.out.println(i); // advanced for loop
		}
	}

}
