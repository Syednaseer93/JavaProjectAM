package javaProjectAM;

public abstract class Fgasek {
	abstract void show();
	static class Child extends Fgasek
	{
		void show()
		{
			System.out.println("hello");
		}
	}
	

	public static void main(String[] args) {
		Child c=new Child();
		c.show();
		
	}

}
