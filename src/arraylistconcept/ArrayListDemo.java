package arraylistconcept;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList <String> list=new ArrayList <String>();  ArrayList <Integer> list=new ArrayList <Integer>();
		ArrayList list=new ArrayList();// for multiple data types but, in for loop we must use Object as data type which will store array elements in any variable like s

		list.add("Asra"); //add method to add elements
		list.add("Sameer");
		list.add("Naseer");
		list.add("Maheer");
		list.add('A');
		list.add(105);
		list.add(100.45);
		System.out.println(list.size());// find size of Array List
		System.out.println(list);//Print the Array list
		System.out.println("After removing Sameer");
		list.remove(2); // remove with index number. remove method
		System.out.println(list);
		System.out.println("Again add sameer");
		list.add(1,"sameer"); //add in between of Arraylist with help of index number
		System.out.println(list);
		System.out.println("Size of final array list");
		System.out.println(list.size()); 

		System.out.println("Array list using FOR loop");
		/*      for(Object s:list) //for(String s:list) --> for string values
        {
        	System.out.println(s);
        }*/	
		System.out.println(list.get(1));
		list.set(3,"Welcome");
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.contains("SAMEER"));
		/*for(int i=0;i<list.size();i++)// normal retreival from for loop
		{
			System.out.println(list.get(i));
		}*/
		Iterator it= list.iterator(); //RETREIVING VALUES USING ITERATOR,list gets stored in 'it',checks if it has next element using hasNext and prints it
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
