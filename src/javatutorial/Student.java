package javatutorial;

import java.util.Scanner;

public class Student {
	
            String name=" ";
            int marks=0;
            
	public Student(String s, int m) {
	
	name=s;
	marks=m;
		 
	 }
	 public void show_details() {
		 System.out.println("Name of student is"+name );
		 System.out.println("Marks of student is "+marks);
	 }
	
		 
}
