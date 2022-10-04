package javaProjectAM;

public class Student {
	int sid;
	char grade;
	String course;
	void getparam(int id,char g, String C)  // assigning values using Method
	{
		sid=id;
		grade=g;
		course=C;

	}
	void display() {
		System.out.println(sid+ "   "+grade+"   "+course);
	}

}
