//Braden Green
import java.util.Scanner;

public class Lab02 {

	public static final double A = 9.8;
	public static final double H = 0.5;
	//did this so i could be easier to half the value
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the initial velocity of the ball (in meters per second) at point A:");

		double velocity = key.nextDouble();
		
		System.out.println("How much time (in seconds) does the ball take to reach point B?");
		
		double time = key.nextDouble();
		
		double total = A * time; 
		//did this to make it easier to square and half
				
		double result = velocity + total;
		//this is the formula for the velocity
		double traveled = velocity * time + H * A * Math.pow(time, 2); 
		//this is the formula for distance
		System.out.println("Final Velocity of the ball = "+result+ " m/s");
		
		System.out.println("Distance traveled by the ball (S) = "+traveled+ " meters");
		
		
		
	}

}
