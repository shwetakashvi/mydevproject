package javatutorial;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 5;
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		
		for(int i=0;i<5;i++){
			a[i]=i;
		}	
		for(int i=0;i<5;i++){
				b[i]=num;
				++num;
		}
		for ( int i=0; i<5;i++){
	         c[i]=a[i]+b[i];
		}
		
		System.out.println("values in array a:");
		for(int i=0;i<5;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println("values f array in b:");
		for(int i=0;i<5;i++) {
			System.out.print(b[i]+" ");
	    }
		//for ( int i=0; i<5;i++){
        // c[i]=a[i]+b[i];
		//}
		System.out.println();
		System.out.println("values in array c:");
		for ( int i=0; i<5;i++){
			System.out.print(c[i]+" ");
		}
	}
}
