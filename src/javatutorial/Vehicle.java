package javatutorial;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}int cost= 0;
	int mileage = 0;
	
	public Vehicle(int c, int m) {
	cost =c;
	mileage = m;
	}
	
	public void show_vehicle_details() {
	
    System.out.println("I am a vehicle");
    System.out.println("Cost of a vehicle is:" +cost);
    System.out.println("Mileage of vehicle is:"+mileage);
    
}
}