package whileloop;

import java.util.Scanner;

public class Tringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();// input from user
       for(int i=1;i<=n;i++) {// number of lines
    	    
    	   for(int j=i;j<=n-1;j++)// number of spaces
    		   System.out.print(" ");
    	   
    	   for(int k=1;k<=i;k++)  // for star
    		   System.out.print("*");
    	   
    		   System.out.println();
       }
 
	}

}
