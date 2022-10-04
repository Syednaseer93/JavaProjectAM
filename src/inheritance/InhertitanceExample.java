package inheritance;

class A
{
	void sum(int a, int b)
	{
		System.out.println("the sum is "+(a+b));
	}	
}
class B extends A
{
	String c;
	void c()
	{
		System.out.println(c);
	}
}
class C extends B
{
	
	void d(int x, int y, int z)
	{
		System.out.println("the Multiplication is"+(x*y*z));
	}	
}
 public class InhertitanceExample {
	public static void main(String[] args) {
		C cobj=new C();
		cobj.sum(10,40);
		cobj.c="hgdnd";
		cobj.c();
		cobj.d(10, 10, 10);
	
	}
}
