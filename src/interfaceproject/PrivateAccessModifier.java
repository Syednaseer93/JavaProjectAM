package interfaceproject;

 class PrivateAccessModifier {
	private int a=10;
    private void show()
	{
		System.out.println(a);
	}
 }
   class PrivateAccessModifier1 {
	   public static void main(String[] args) {
			PrivateAccessModifier am=new PrivateAccessModifier();
			am.show();
			  
   }
	

	

}
