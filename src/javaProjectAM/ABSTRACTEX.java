package javaProjectAM;

import inheritance.Aa;

public class ABSTRACTEX {

}

abstract class AbstractClass {
	abstract  void m1();
}
 class Aa extends AbstractClass
{
	  void m1()
	 {
		 System.out.println("This is child");
	 }

	public static void main(String[] args) {
		Aa a=new Aa();
		a.m1();

	}

}

