package javaProjectAM;

public class ThisKeyWordUses1 {
	void m()
	{
		System.out.println("This is M");
	}
	void n()
	{   this.m();
	System.out.println("This is N");
	}

	public static void main(String[] args) {
		ThisKeyWordUses1 tk=new ThisKeyWordUses1();
		tk.n();
		
		

	}

}
