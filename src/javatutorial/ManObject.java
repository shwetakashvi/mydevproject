package javatutorial;

import java.util.Scanner;
public class ManObject{
	public static void main(String[] args) {

	
		// TODO Auto-generated method stub
         Scanner scan= new Scanner(System.in);
         
         System.out.println("enter name:");
         String person_name= scan.next();
         
         System.out.println("enter age:");
         int person_age= scan.nextInt();
         
         
         System.out.println("enter salary:");
         int person_salary= scan.nextInt();
         
         
		 Man m= new Man(person_name,person_age,person_salary);
		 m.show_person();
		 m.task();
		 
		 
	}  
}

