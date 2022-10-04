package javaProjectAM;

public class ThisKeyWordUses {
	void m()
	{
		System.out.println("This is M");
	}
	void n()
	{   this.m();
	System.out.println("This is N");
	}

	public static void main(String[] args) {
		ThisKeyWordUses tk=new ThisKeyWordUses();
		tk.n();
		

	}

}
