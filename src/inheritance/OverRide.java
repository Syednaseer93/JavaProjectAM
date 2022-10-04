package inheritance;

class Hello
{
	public void m1()
	{
		System.out.println("m1");
	
	}
}
class Hello2 extends Hello
{
public void m1()
	{	
		System.out.println("m2");
	
	}
}

public class OverRide {


public static void main(String[] args) {
	Hello2 h2=new Hello2();
	h2.m1();
  
	
	


	}

}
