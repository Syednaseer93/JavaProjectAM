package inheritance;

interface Syed
{
	void m1();
}
 class InterfacePractice implements Syed {
	public void m1()
	{
		System.out.println("m1");
	}

	public static void main(String[] args) {


		InterfacePractice i=new InterfacePractice();
		i.m1();
	}

}
