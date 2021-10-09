package javatutorial;
import java.util.Scanner;
public class StudentObject {

	public static void main(String[] args) {
		// TODO Auto-generated 
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter your name:");
		String student_name= scan.next();
		
		System.out.println("enter your marks:");
		int student_marks= scan.nextInt();
		
		    Student s = new Student(student_name, student_marks);
		    s.show_details();
		    
	}

}
