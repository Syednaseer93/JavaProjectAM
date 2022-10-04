package interfaceproject;

class Sameer
{
	void m1()
	{
		System.out.println("this is Sameer Class");
	}
}
interface Naseer
{
	void m2();
}
interface Maheer
{
	void m3();
}


public class HybridInheritance extends Sameer implements Naseer,Maheer
{

	public void m2()
	{
		System.out.println("This is Naseer Class");
	}
	public void m3()
	{
		System.out.println("This is Maheer Class");

	}


	public static void main(String[] args)
	{
		HybridInheritance hi=new HybridInheritance();
		hi.m1();
		hi.m2();
		hi.m3();



	}

}
