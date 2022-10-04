package inheritance;

public abstract class Practice1 {
	  int a=10; int b=20;      // DEMO TO USE CONSTRUCTOR IN ABSTARCT CLASS. YES WE CAN USE
	abstract void m1(int a, int b);
	void m2()
	{
		System.out.println("m2");
	}
	
	Practice1()
	{
		System.out.println("constructor");
	}
	static class Practice2 extends Practice1
	{
		void m1(int a, int b)
		{
			this.a=a;
			this.b=b;
			System.out.println(a+b);
		}
	
	}
	
	public static void main(String[] args) {
		
		Practice2 p=new Practice2();
		p.m1(10,10);
		p.m2();
		
		
		
	}

}
