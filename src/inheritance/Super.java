package inheritance;

public class Super {
	int a=10;
	void Show(){
		System.out.println("This is parent method");
	}
	Super() //CONSTRUCTOR INSIDE PARENT CLASS
	{
		System.out.println("This is Parent class constructor");
	}
}



class Duper extends Super
{
	int a=20; // VARIABLE OVERRIDDEN WITH DIFF VALUE
	void Show() { // METHOD OVERRIDDEN 
		System.out.println("This is child class");
		System.out.println(super.a);// SINCE SUPER IS USED IMMEDIATE PARENT CLASS VARIABLE WILL BE SHOWN
}
	Duper()	// CONSTRUCTOR IN CHILD CLASS
	{
		super(); //PARENT CONSTUCTOR WILL BE CALLED first. SUPER MUST BE FIRST STATEMENT WITHIN CONSTRUCTOR. AND THEN IT FOLLOWS THE Sysout statement

		System.out.println("this is child class constructor");
	}
}









