package javaProjectAM;

public class Employee {
	    int eid;
	    String ename;
	    double salary;
	 static int deptno=1000;
	   
	   void display()  
	   {
		   System.out.println(eid);
		   System.out.println(ename);
	       System.out.println(salary);
	       System.out.println(deptno);
	       System.out.println();

	   }

	public static void main(String[] args) {
		Employee emp1= new Employee();
		emp1.eid= 1001;
		emp1.ename= "Naseer";
		emp1.salary= 50000;
		emp1.display();
		
		
		Employee emp2= new Employee();
		emp2.eid= 2001;
		emp2.ename= "Maheer";
		emp2.salary= 75000;
		emp2.display();
		
		
		
		
			

	}

}
