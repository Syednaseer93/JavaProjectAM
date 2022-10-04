package javaProjectAM;

public class AssignmentClass {
	int sid;
	String sname;
	int sub1;
	int sub2;
	int sub3;
	
	void Getstudata(int id)
	{
		sid=id;
		
		
		System.out.println("Student id is: "+(sid));
		}
	void Getstudata(String name)
	{
		sname=name;
		System.out.println(sname);
	}

	
	void Getstumarks(int s1,int s2,int s3)
	{
		sub1=s1;
		sub2=s2;
		sub3=s3;
		}
	void Totalmarks()
	{
		System.out.println("Total marks secured are: "  +(sub1+sub2+sub3));
	}


	public static void main(String[] args) {
		AssignmentClass ass=new AssignmentClass();
		ass.Getstudata(100);
		ass.Getstudata("Naseer");
        ass.Getstumarks(91,92,92);
		ass.Totalmarks();
		
		AssignmentClass ass2=new AssignmentClass();
		ass2.Getstudata(100);
		ass2.Getstudata("Maheer");

		
		ass2.Getstumarks(50,51,52);
		ass2.Totalmarks();
		
		
		


		
		
		

	}

}
