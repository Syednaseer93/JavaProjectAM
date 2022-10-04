package inheritance;

public class Practice {
	void m1(int a, int b)

	{
		System.out.println(a+b);
		System.out.println("This is parent");
	}
	
	class Practice22 extends Practice
	{
	void m1(int a, int b) {
		System.out.println(a+b);
		System.out.println("this is child");
	}
		
		
	}
	
	public static void main(String[] args) {
		
      Practice22 prac=new Practice22();
       prac.m1(10, 20);		
	}

}
