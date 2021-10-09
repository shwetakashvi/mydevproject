package javatutorial;

import java.util.Scanner;

public class VehicleObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Cost of vehicle");
		int cost = scan.nextInt();
		
		System.out.println("Enter mileage of vehicle");
		int mileage = scan.nextInt();
		
		System.out.println("Enter Color of vehicle");
	    String color = scan.next();
		
		System.out.println("Enter number of tyres  of vehicle");
		int tyres = scan.nextInt();
		
		
		Car c = new Car(cost,mileage,color, tyres);
         c.show_vehicle_details();
         c.show_car_details();
         
	}

}
