package javaProjectAM;

public class Constoverload {
	int x; int y;
	
	Constoverload(int a,int b){
		System.out.println(a+b);
	}
	
	Constoverload(double a,int b){
		System.out.println(a+b);
	}
	Constoverload(String s){
		System.out.println(s);
	}
	
	
	


	public static void main(String[] args) {
		
		Constoverload co=new Constoverload("sddd");
		Constoverload co1=new Constoverload(10,20);


		
	}

}
