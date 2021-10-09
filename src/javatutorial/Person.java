package javatutorial;

public class Person {
   
	   String name="";
	   int age=0;
       
	   public Person(String n, int a) {
	   name = n;
	   age = a;
	   
	   }
	   
	   
	   public void show_person() {
		   System.out.println("Name of person is:" +name);
		   System.out.println("Age of person is:" +age);
	   }
}
