package javaProjectAM;

abstract class Vehicle {
	
abstract void start();
}

class Car extends Vehicle
{
	void start()
	{
		System.out.println("car starts with key");
	}
	

	public static void main(String[] args) {

	}

}
