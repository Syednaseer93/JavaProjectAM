package interfaceproject;


interface A
{
	int a=10;
	int b=20;
	void add();
}

interface B
{
	int z=100;
	int y=200;
	void mul();
}


public class MultipleInheritanceAssign implements A,B {
	
	public void add()
	{
		System.out.println(a+b);
	}

	
	public void mul()
	{
		System.out.println(z*y);
	}

	public static void main(String[] args) {
		
		MultipleInheritanceAssign mi=new MultipleInheritanceAssign();
		mi.add();
		mi.mul();

	}

}
