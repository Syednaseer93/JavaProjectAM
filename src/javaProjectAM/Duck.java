package javaProjectAM;

public class Duck {
	String color;
	int noOfLegs=2;
	int noOfEyes=2;
	int age;
	boolean isHungry;


	public static void main(String[] args) {
		

		Duck d1=new Duck();
		d1.color="RED";
		d1.age=5;
		d1.isHungry= true;

		Duck d2=new Duck();
		d2.color="BLUE";
		d2.age=10;
		d2.isHungry= false;

		Duck d3=new Duck();
		d3.color="GREEN";
		d3.age=15;
		d3.isHungry= true; 
		

		System.out.println(d1.color);
		System.out.println(d1.noOfLegs);
		System.out.println(d1.noOfEyes);
		System.out.println(d1.age);
		System.out.println(d1.isHungry);
		System.out.println();


		System.out.println(d2.color);
		System.out.println(d2.noOfLegs);
		System.out.println(d2.noOfEyes);
		System.out.println(d2.age);
		System.out.println(d2.isHungry);
		System.out.println();


		System.out.println(d3.color);
		System.out.println(d3.noOfLegs);
		System.out.println(d3.noOfEyes);
		System.out.println(d3.age);
		System.out.println(d3.isHungry);
	}

}
