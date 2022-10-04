package javaProjectAM;

public class SuperConst {
	SuperConst()
	{ 
		System.out.println("parent");
	}
	
	public class DuperConst extends SuperConst
	{
		DuperConst()
		{
			
			System.out.println("child");
		}
	}
	

	public static void main(String[] args) {
		DuperConst d=new DuperConst
	}

}
