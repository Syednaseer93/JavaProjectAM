package javaProjectAM;

abstract class AbstractExample {
    abstract void fun();
}
 
// Class 2 
class Derived extends AbstractExample {
   public  void fun()
    {
        System.out.println("Derived fun() called");
    }

 

    public static void main(String args[])
    {
 
  
    	Derived d=new Derived();
    	d.fun();
    
    }
}