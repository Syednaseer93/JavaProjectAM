package inheritance;

public abstract class AbstractClass {
	abstract  void m1();
	int a;
}
  class Aa extends AbstractClass
 {
	 public void m1()
	 {
		 System.out.println("This is child");
	 }

	public static void main(String[] args) {
		Aa a=new Aa();
		a.m1();

	}

}
