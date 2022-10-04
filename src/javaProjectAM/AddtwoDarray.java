package javaProjectAM;

public class AddtwoDarray {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{3,4,5}};
		int b[][]= {{3,4,5},{4,5,6}};
		int i=0;
		int j=0;

		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				//System.out.println(a[i][j]); //
			}
		}

		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b[0].length;j++)
			{
				//System.out.println(b[i][j]);
				System.out.println(a[i][j]+b[i][j]);
			}
		}
		




	}

}
