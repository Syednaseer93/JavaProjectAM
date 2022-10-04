package javaProjectAM;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionThrows {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.out.println("started");
		
		FileReader fr=null;  
		fr=new FileReader("C:\\SeleniumPracice\\Test123.txt");//FILENOT FOUND EXCEPTION
		BufferedReader bfr=new BufferedReader(fr);
		System.out.println(bfr.readLine());//IO EXCEPTION 
		bfr.close();
		Thread.sleep(5000);  //INTERRUPTED EXCEPTION


	}

}
