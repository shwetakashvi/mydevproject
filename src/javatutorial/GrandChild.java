package javatutorial;

public class GrandChild extends Child{
        String gender="";
        public GrandChild(String n, int a, String g) {
        	super (n,a);
        	gender = g;
        }
     
        
        public void show_gender() {
        	System.out.print("gender is:" +gender);
        }
}
