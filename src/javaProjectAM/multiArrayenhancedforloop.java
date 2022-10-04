package javaProjectAM;

public class multiArrayenhancedforloop {

	public static void main(String[] args) {
		int a[][]= {{100,200},{300,400},{500,600}};             
		for(int r[]:a)           //advanced for loop
			
		{
			for(int i:r)            //r[] defines complete row. 'a' array assigns to r, r which contains full row 100,200 will be assigned to i in inner for loop, console prints
			{                           //.. 100,200 and a assigns to second row and so on
				System.out.println(i);
			}
		}

	}

}
