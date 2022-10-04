package javaProjectAM;

public class Studentclass2 {

	public static void main(String[] args) {
		Studentclass1 stu1=new Studentclass1();
		stu1.sid= 100;
		stu1.grade='A';
		stu1.course="BE";
		stu1.display();                                               //assigning values through reference variable 
		
		Studentclass1 stu2=new Studentclass1();
        stu2.sid= 200;
		stu2.grade='C';
		stu2.course="BCOM";
		stu2.display();
		
		Studentclass1 stu3=new Studentclass1();
		stu3.sid= 300;
		stu3.grade='D';
		stu3.course="BBM	";
		stu3.display();
		

		
	}

}
