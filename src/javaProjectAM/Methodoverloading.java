package javaProjectAM;

public class Methodoverloading {
	
	void naseer(int a,int b)
	{
		System.out.println(a+b);
		}
	void naseer(int a,int b, int c)
	{
		System.out.println(a+b+c);
	
}
	void naseer(String b)
	{
		System.out.println(b);
}
	

	public static void main(String[] args) {
		Methodoverloading mo=new Methodoverloading();
		mo.naseer(10,20);
		mo.naseer(10,20,30);
		mo.naseer("KING NASEER");
			
	

	}

}
