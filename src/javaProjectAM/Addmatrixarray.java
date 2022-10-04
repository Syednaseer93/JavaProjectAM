package javaProjectAM;

public class Addmatrixarray {

	public static void main(String[] args) {
   int a[][]= {{2,4},{6,8}};
   int b[][]= {{1,3},{5,7}};
   
   int c[][]=new int[2][2];
   
   for(int i=0;	i<2; i++)
   {
	   for(int j=0; j<2 ; j++)
		   
	   {
		   c[i][j]=a[i][j]*b[i][j];
		   System.out.println(c[i][j]);    
                                                       // 2 4    1 3
		                                              //  6 8    5 7
	   }

   }
	}

}
