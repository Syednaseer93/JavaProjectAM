package interfaceproject;

interface Add1
{
	public void show();
	
}
interface Add2
{
	public void print();
}


public class Mul implements Add1,Add2 {
	public void show() {
		System.out.println("interface1");
		
	}
	public void print()

	{
		System.out.println("interface2");
	}

	public static void main(String[] args) {
		Mul m=new Mul();
		m.print();
		m.show();

	}

}
