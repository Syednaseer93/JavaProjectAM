package javaProjectAM;

public abstract class Abstraction3 {
	abstract String concat(String a,String b);
	abstract int add(int a, int b);
static class Normal extends Abstraction3
{
	String concat(String a, String b)
	{
		return a+b;
}
	int add(int a, int b)
	{
        return a+b;
	}

	
		public static void main(String[] args) {
			Normal n=new Normal();
			int res=n.add(10, 10);
		String res2=n.concat("abc", "efg");
		System.out.println(res);
		System.out.println(res2);
			
			
			
			
		

	}
}
}
