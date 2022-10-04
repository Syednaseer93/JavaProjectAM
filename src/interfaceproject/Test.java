package interfaceproject;

interface A
{
		int a=10;  // by default variables are static and final
		void m1(); // by default methods are public and all methods are abstract methods
}
public class Test implements A
{
		public void m1()  // must specify public AM as abstract method in interface is public
		{
			System.out.println(a);
		}




	public static void main(String[] args) {
        A a=new Test();  // interface can create reference variable but cannnot instantiate we must use Class   // can also use Test t=new Test()
        
        a.m1();
        
	}

	}
