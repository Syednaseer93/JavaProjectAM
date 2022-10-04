package javaProjectAM;

public class LargestNumberArray {

	public static void main(String[] args) {
    
   int a[]= {100,200,300,400,500};
   System.out.println(a.length);
   int max=a[0];
   for(int i=1;i<a.length;i++)
   {
	   if(a[i]>max)
	   {
		   max=a[i];
	   }
   }
    
    }

}
