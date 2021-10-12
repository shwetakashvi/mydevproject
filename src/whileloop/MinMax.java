package whileloop;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    
        int n= sc.nextInt();
        int max= n;
        int min= n;
        
        if(n>=0) {
        while (true) {
        	n=sc.nextInt();
        	
        	if (n<0)
        		break;
        	
             max = n > max ? n : max;
             min = n < min ? n : min;
        }
             
             System.out.println("min="  + min + ", max=" + max   );
        		
        }       	
        else
        	
        	System.out.println(n + "is invalid");
        }
	}




