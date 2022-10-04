package javaProjectAM;
//just practice multiple methods to understand and learn them
// 
public class StringBufferMethods {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("NASEER");
		//4 constructors in STRING BUFFER-->StringBuffer();    StringBuffer(CharSequence seq)    StringBuffer(String str)   StringBuffer(int capacity)
	  
		sb.append("S");
		
		System.out.println(sb);
	
		System.out.println(sb.charAt(2));
		sb.append(100);
		System.out.println(sb);
		sb.append(sb, 2, 6);
System.out.println(sb);

	}
	

}
