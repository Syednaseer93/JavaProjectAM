package javaProjectAM;

public class Constructor1 {
	int sid;
	char grade;
    String course;
     Constructor1(int id,char g,String C )
     {
    	 sid=id;                                    //Assign values by using constructors
    	 grade=g;
    	 course=C;
     }
     void display()
     {
    		System.out.println(sid+ "   "+grade+"   "+course);
     }

}
