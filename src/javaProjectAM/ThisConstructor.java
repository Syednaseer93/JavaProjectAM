package javaProjectAM;  

public class ThisConstructor {

		 int a; int b;
		 ThisConstructor(int a, int b)
			{
				this.a=a;
				this.b=a;
				System.out.println(a+b);
			}
		
		
		

		public static void main(String[] args) {
      			
			ThisConstructor tc=new ThisConstructor(10,20);
		
		
		
	}

}
