package javaProjectAM;

public class AddArrays3Row3Column {

	public static void main(String[] args) {
	//	int a[][]=new int [3][3];
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{9,8,7},{6,5,4},{3,2,1}};
		//System.out.println(a.length);
	
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++)
			{
				//System.out.println(a[i][j]);
			//	System.out.println(a[i][j]+b[i][j]);// PUT THIS STATEMENT IN ANY FOR LOOP

			}
		}
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++)
			{
				int res=a[i][j]+b[i][j];
				System.out.println(res);
				//System.out.println(b[i][j]);
			}
		}
	
	
		

	}

}
