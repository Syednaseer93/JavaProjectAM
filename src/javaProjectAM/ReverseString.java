package javaProjectAM;

public class ReverseString {

	public static void main(String[] args) {
		
		String s= "NASEER";
		String result="";
		for(int i=s.length()-1;i>=0;i--)
		{
			result=result+s.charAt(i);//''+5   which means '5' value of 5 is R and then decrements

		}
		System.out.println(result);
	}



}
