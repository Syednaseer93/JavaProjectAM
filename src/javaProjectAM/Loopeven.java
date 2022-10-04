package javaProjectAM;

public class Loopeven {
	public static void main(String args[])
	{
		/*int a=2;
		while(a<=50)
		{
			System.out.println(a);
			a=a+2;
			}*/

		int i=0;	
		for(;;)
		{
			if(i==10)
			{
				break;
			}

			System.out.println(i);
			i++;
		}
	}

}
