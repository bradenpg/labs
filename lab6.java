//Braden Green
import java.util.Scanner;

public class lab6 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the height of the triangle: ");
	//asking for the height of the triangle
		int height = key.nextInt();
		//increasing i by 1 until it reaches the height
	    for(int i = 1; i <= height; i++) {
	    	//is the columns which would equal i and allow it to reach the increasing height
	    	for(int j = 1; j <= i; j++) {
	    		
	    		
	    		
	    		System.out.print("*");
	    	}
	    	
	    	System.out.println("");
	   
	    }
	    //decreasing the height by one
	    for(int i = 1; i <= height-1; i++) {
	    	//decreasing the height by i so we can eventually reach 1 which would then be the full triangle
	    	for(int j = 1; j <= height-i; j++) {
	    		System.out.print("*");
	    	}
	    	System.out.println("");
	    }
	    System.out.println("End of program!");
	    
	}

}
