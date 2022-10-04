package inheritance;

class Bank
{
	double rateOfInterest(int a,int b)
	{
		return (a+b);
	}
	Bank()
	{
		System.out.println("Bank constructor");
		
	}
}

class SBI extends Bank
{
	double rateOfInterest(int a,int b)
	{
		System.out.println("Rate of interest for SBI IS: ");

		return (a+b);
	}
	
	
}
class ICICI extends Bank
{
	double rateOfInterest(int a, int b)
	{
		System.out.println("Rate of interest for ICICI IS: ");

		return (a+b);
	}
	ICICI(){
		System.out.println("Icici constructor");
	}
	
}
class AXIS extends Bank
{
	double rateOfInterest(int a, int b)
	{
		System.out.println("Rate of interest for AXIS IS: ");

		return (a-b);
	}	
	
}

public class Overridingexample {
	

	public static void main(String[] args) {
		SBI sbi=new SBI(); 
		//ICICI icici=new ICICI();IF WE USE ONLY THIS STATEMENT IN MAIN METHOD, BOTH PARENT CLASS AND CHILD CLASS CONSTRUCTORS WILL BE CALLED
		System.out.println(sbi.rateOfInterest(10,20)); //SBI is Extending	bank. rateOfInterest() from SBI will be executed not Bank because latest method is SBI, this is called overriding
		
		AXIS axis=new AXIS();
		System.out.println(axis.rateOfInterest(50,40));//if we use different parameters it becomes over loading ex: int , int and int, double, and input is 10,20 , here int int method be called
		
		ICICI icici=new ICICI();            //if definition is same, then method will be overrided into child class and when we access that method through object child class method(latest one)will be called
		System.out.println(icici.rateOfInterest(30,40)); //to call immediate parent class use super keyword
		
		
	}

}
