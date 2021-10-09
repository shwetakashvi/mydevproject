package javatutorial;

public class Man extends Person implements Father {

	  int salary = 0;
	  
	public Man(String n, int a, int s) {
		super(n,a);
		salary = s;
		
	}
	
	public void task() {
		System.out.println("Earn money");
		System.out.println("Salary of person:"+salary);
	}
}
