package interfaceproject;

/* ENCAPSULATION BINDS THE DATA AND METHODS TOGETHER,it is a protective shield that prevents 
 * the data from being accessed by the code outside this shield.
 * 
 *    variables or data of a class is hidden from any other class and can be accessed only
 *     through any member function of its own class in which it is declared.
 *     ENCAPSULATION--WRAPPING UP OF DATA(VARIABLES) AND CODE ACTING ON THAT DATA(METHODS) TOGETHER IN A SINGLE UNIT*/

public class EncapsulationDemo {
	private int empRollNo;//use of PRIVATE FOR VARIABLES OR FIELDS AND USE PUBLIC FOR METHODS
	private String empName;

	public void setRollnumber(int r)// USING SETTER METHOD TO SET A VALUE, THEN LATER AFTER CREATING AN OBJECT WE CAN CALL THIS METHOD AN	D GIVE A VALUE
	{
		empRollNo=r;
	}
	public int getRollnumber()// USING GETTER METHOD TO READ OR GET VALUE, FOCUS ON RETURN TYPE, AFTER CREATING AN OBJECT WE CAN CALL GETTER METHOD IN PRINT STATEMENT
	{
		return empRollNo;
	}
	public void setEmpname(String name)
	{
		empName=name;

	}
	public String getEmpname()   
	{
		return empName;
	}
	public static void main(String[] args) {
		EncapsulationDemo ed=new EncapsulationDemo();
		ed.setEmpname("Hellojava");
		System.out.println(ed.getEmpname());
		ed.setRollnumber(1234);
		System.out.println(ed.getRollnumber());
		System.out.println();


		EncapsulationDemo ed2=new EncapsulationDemo();
		ed2.setEmpname("Syed");
		System.out.println(ed2.getEmpname());
		ed2.setRollnumber(4321);
		System.out.println(ed2.getRollnumber());
	}
}
