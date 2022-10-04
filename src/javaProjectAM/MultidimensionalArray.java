package javaProjectAM;

public class MultidimensionalArray {
	public static void main(String args[])
	{
		int a[][]={{100,200},{300,400},{500,600}};
		System.out.println("Number of rows are :"+a.length);
		System.out.println("Number of columns are :"+a[0].length);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}

	}

}
