package javaProjectAM;

public class Static {
	 int empno;
	 String ename;
	 static int deptno=82281;
	 void bonus()
	 {
		 System.out.println(empno);
		 System.out.println(ename);
		 System.out.println(deptno);
		 System.out.println("Bonus is 1000rs");

		 
 }
	

	public static void main(String[] args) {
		Static st=new Static();
		st.empno=162527;
		st.ename="NASEER";
		st.bonus();
		
		Static st2=new Static();
		st2.empno=49342;
		st2.ename="MAHEER";
		st2.bonus();
		
		

		
		

	}

}
