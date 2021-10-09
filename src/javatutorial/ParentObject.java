package javatutorial;

import java.util.Scanner;

public class ParentObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scan = new Scanner(System.in);
           
           System.out.println("enter your name:");
           String person_name= scan.next();
           
           System.out.println("enter your age:");
            int person_age= scan.nextInt();
           
           System.out.println("enter your gender:");
           String person_gender= scan.next();
           
           
           GrandChild gc =new GrandChild(person_name, person_age, person_gender);
           gc.show_name();
           gc.show_age();
           gc.show_gender();
	}

}



