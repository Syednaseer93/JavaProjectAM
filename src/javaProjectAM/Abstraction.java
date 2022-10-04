package javaProjectAM;

public abstract class Abstraction {
	abstract void add(int x,int y);

	static class Child1 extends Abstraction // MAKING SUB CLASS STATIC IS A MUST
	{
		void add(int x,int y)
		{			System.out.println("addition is: "+(x+y));

		}
	}

	static class Child2 extends Abstraction
	{
		void add(int x, int y)	{

			System.out.println("Substraction is: "+(x-y));
		}

		public static void main(String[] args) {
			Child2 c2=new Child2();
			c2.add(20, 10);
			Child1 c1=new Child1();
			c1.add(10, 10);
		}

	}
}
/*  ABSTRACT CLASS CAN ACHIEVE 1 -100% ABSTRACTION, INTERFACE CAN ACHIEVE 100%, AS METHODS ARE ABSTRACT BY DEFAULT IN INTERFACE
IT IS NOT NECESSARY TO HAVE ABSTRACT METHODS IN ABSTRACT CLASS, BUT IF ANY ABSTRACT METHOD IS PRESENT IN CLASS THAT CLASS MUST BE ABSTRACT CLASS
IF YOU INHERIT NORMAL CLASS FROM A ABSTRACT CLASS , THAT CLASS MUST BE STATIC AND ALL METHODS(the same as in abstract cls) MUST BE IMPLEMENTED.
YOU CANNOT CREATE AN OBJECT OF AN ABSTRACT CLASS ONLY INSTANCE CAN BE CREATED */
