package javaProjectAM;

interface Parent1
{
	int a=10;
	int b=20;
	void show();
}

interface Parent2 extends Parent1
{
	int x=30;
	int y=40;
	void display();
}

public class MultiInh implements Parent1,Parent2 {
	public void show()
	{
		System.out.println(a+b);
	}
	public void display()
	{
	System.out.println(x+y);	
	}
	
	
	public static void main(String[] args) {
		
		MultiInh mi=new MultiInh();
		mi.show();
		mi.display();
	}

}
/*INTERFACE IS A BLUE PRINT OF A CLASS
 * VARIABLES IN INTERFACE ARE PUBLIC, STATIC AND FINAL BY DEFAULT
 * INTERFACE HAS ABSTRACT METHODS ONLY AND ABSTRACT METHODS ARE PUBLIC BY DEFAULT
 * ABSTRACT METHOD HAS ONLY DEFINITION NO IMPLEMENTATION ITS A BLUE PRINT
 * A CLASS CAN IMPLEMENT AN INTERFACE AND AN INTERFACE CAN EXTEND AN INTERFACE
 * WITHOUT THE CLASS INTERFACE IS OF NO USE, INFACT INTERFACE TELLS CLASS WHAT TO DO
 * *OVERRIDED CHILD METHODS MUST BE PUBLIC
 * WE CAN CREATE OR DECLARE A REFERENCE VARIABLE OF AN INTERFACE BUT WE CANNOT INSTATIATE*/

