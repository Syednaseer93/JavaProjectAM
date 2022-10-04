package javaProjectAM;

public class Constructoroverload {



	public Constructoroverload(int a, int b)
	{

		System.out.println(a+b);
	}

	public Constructoroverload(int a, int b, int c)
	{

		System.out.println(a+b+c);
	}



	public Constructoroverload(String a)
	{
		System.out.println(a);
	}



	public static void main(String[] args) {
		Constructoroverload co=new Constructoroverload(10,20,30);// only one consturctor can be invoked at a time
		Constructoroverload co1=new Constructoroverload(10,20);
		Constructoroverload co2=new Constructoroverload("Naseer");




	}

}
