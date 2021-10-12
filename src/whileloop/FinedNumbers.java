package whileloop;

import java.util.Scanner;

public class FinedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 while(n < 1 || n > 10) {
				System.out.print(n +" is not between 1 and 10. Try again");
				n = sc.nextInt();
					}
				System.out.println(n + " is between 1 and 10");
	
	}

}
