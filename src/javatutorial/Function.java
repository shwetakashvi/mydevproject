package javatutorial;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function obj =new Function();
		
       int x=10;
       int y=20;
      int get_result= obj.add(x,y);
     System.out.println(get_result);
       
	}
     public int add(int num1, int num2) {
    	 int result=num1+num2;
    	 return result;
     }
     
}
