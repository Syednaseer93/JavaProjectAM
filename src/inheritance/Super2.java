package inheritance;

public class Super2 {

	public static void main(String[] args) {
       Duper du=new Duper();  // IF THERE IS CONSTRUCTOR, BOTH CONSTRUCTOR WILL BE INVOKED, TO AVOID THAT USE super(); IN CHILD CLASS CONSTRUCTOR AS A FIRST STATEMENT BEFORE Sysout
       
       du.Show(); //when will call Show, Latest OVERRIDDEN VARIABLE AND METHOD WILL BE CALLED(IF SUPER IS NOT USED). IF SUPER IS USED WITHIN THAT CHILD CLASS METHOD, 
                                                        //.. IMMEDIATE PARENT CLASS METHOD AND VARIABLE WILL BE CALLED
                                                       //SUPER KEYWORD CANNOT BE USED IN MAIN METHOD(ONLY LATEST CHILD CLASSES IT CAN BE USED TO INVOKE IMMEDIATE PARENTC CLASS M AND V
       //System.out.println(du.a);
	}

}
