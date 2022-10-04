package javaProjectAM;


public abstract class Abstract {
	public abstract void show();
	
}
 class Normal extends Abstract
{
	public void show()
	{
		System.out.println("successful");
	}
	public static void main(String[] args) {
		Normal no=new Normal();
		no.show();

	}

}
