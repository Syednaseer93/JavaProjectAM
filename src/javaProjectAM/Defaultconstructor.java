package javaProjectAM;

public class Defaultconstructor {
	int a;
	int b;
	
	Defaultconstructor()
	{
		a=10;
		b=20;
	}
	 void display()
	 {
		 System.out.println(a+b);
	 }
	

	public static void main(String[] args) {
		Defaultconstructor con=new Defaultconstructor();
		con.display();
		

	}

}
