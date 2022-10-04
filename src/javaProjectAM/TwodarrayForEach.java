package javaProjectAM;

public class TwodarrayForEach {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{3,4,5}};

		int b[][]= {{3,4,5},{4,5,6}};

		System.out.println("Values of a are:");

		for( int r[]:a) // 'a' Array reads complete row ie 1,2,3 and keep it in a temporary variable r(which is single dimensional array type
		{   

			for(int i:r)// 'r' will now assign each element of that row one by one to i, and hence i will print values 1 followed by 2 and 3
			{ 
				System.out.println(i);
			}
		}
		System.out.println("Values of b are:");

		for( int r[]:b)

		{
			for(int j:r)
			{ 

				System.out.println(j);
			}
		}  
	}
}
