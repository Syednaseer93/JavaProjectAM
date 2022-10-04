package javaProjectAM;


 class Super
{
	Super(int x, int y)
	{
		System.out.println(x+y+"parent");
	}
}
 class Duper extends Super
{
	Duper()
	
	{  
		super(10,10);
		System.out.println("child");
	}
}
public class ConstructorSuperDemo {

	public static void main(String[] args) {
   Duper dp=new Duper();
	}

}
