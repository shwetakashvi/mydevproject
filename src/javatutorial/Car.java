package javatutorial;

public class Car extends Vehicle {

        String color ="blue";
        int tyres = 4;
        
        public Car(int c, int m, String col, int ty){
            super(c,m);
        	color = col;
        	tyres = ty;
        }
	
        public void show_car_details(){	
        	System.out.println("I am a car");
        	System.out.println("color of car is " +color);
        	
        	System.out.println("Number of tyres in car are " +tyres);
        }

}
