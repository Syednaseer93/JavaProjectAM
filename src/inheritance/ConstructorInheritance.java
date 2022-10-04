package inheritance;

public class ConstructorInheritance {
	void sum(int a, int b )
	{
		System.out.println(a+b);
	}
	ConstructorInheritance()
	{
		System.out.println("parent constructor");
	}
	static class ConstructorInheritance2 extends ConstructorInheritance
	{
		void sum(int a, int b )
		{
			System.out.println(a-b);
		}
		ConstructorInheritance2()
		{ 
			System.out.println("child constr");
		}
		
	}
	

	public static void main(String[] args) {
		ConstructorInheritance2 c=new ConstructorInheritance2();
		c.sum(10, 10);

	}

}
