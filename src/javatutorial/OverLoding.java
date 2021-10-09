package javatutorial;

public class OverLoding {
	public static void main(String[] args) {
	int l=10;
	int b= 20;
	float r=2.5f;
	
	int rectangle_area =area(10,20);
	float circle_area =area(r);
	System.out.println("area of rectangle is" +rectangle_area);
	System.out.println("area of circle is" +circle_area);
	}
	
	         public static int area(int n1, int n2) {
            	  int result=n1*n2;
            	  return result;
              }
             public static float area(float n) {
            	 float result = 3.14f*n*n;
            	 return result;
             }
}