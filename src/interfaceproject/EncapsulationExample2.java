package interfaceproject;

public class EncapsulationExample2 {
	private int a; private int b;private int c; private int d;
	public void setAdd(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	public int getAdd()
	{
		return a+b;
	}
	public int Multiply(int a,int b,int c,int d)
	{
	
		return a+b+c+d;
	}

	public static void main(String[] args) {

		EncapsulationExample2 e=new EncapsulationExample2();
		e.setAdd(15, 20);
	int res=e.getAdd();
		
	
		System.out.println(res);
	int res2=	e.Multiply(5, 5, 5,5);
	System.out.println(res2);
	}

}
