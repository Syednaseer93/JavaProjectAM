package javaProjectAM;

public class ThisKeyUses {
}
	
/*THIS USED TO REFER CURRENT CLASS VARIABLE
 * 	  int x;
	 
	int y;
	ThisKeyUses(int a,int b)
	{
		this.x=a;
		this.y=b;
		System.out.println(x+y);
		
	}
	public static void main(String[] args)
	{
			ThisKeyUses tk =new ThisKeyUses(10,20);
	} 
}  */
	

	
	 /*THIS IS USED TO REFER CURRENT CLASS CONSTRUCTOR
	  * ThisKeyUses()
	{
		System.out.println("no argument constructor");
	}
	ThisKeyUses(int x)
	{
		this();
		System.out.println("argument constructor");

	}

	public static void main(String[] args)
	{
		ThisKeyUses tk=new ThisKeyUses(10);

	}*/









/*THIS IS USED TO REFER CURRENT CLASS METHOD
 * 	void m()   
	{
		System.out.println("This is M");
	}
	void n()
	{   this.m();
	System.out.println("This is N");
	}

	public static void main(String[] args) {
		ThisKeyUses tk=new ThisKeyUses();
	//	tk.n(); both statements will be printed as in method n() we have used this keyword for m to refer current class method

	} */


