package javaProjectAM;

public class Thiskeywordmethod {
	    int a; int b;
		void display( int a, int b)
		{
			this.a=a;
			this.b=b;
			System.out.println(a+b);
		}
	
	
	

	public static void main(String[] args) {
		Thiskeywordmethod tk=new Thiskeywordmethod();
		tk.display(30,20);
		

	}

}
