package javaProjectAM;

class A
{
	void m1()
	{
		System.out.println("m1");
	}
}
class B extends A
{
	void m1()
	{  super.m1();
		System.out.println("m2");
	}
}

public class This {
	
	public static void main(String[] args) {
		B b=new B();
		b.m1();
	}

}
