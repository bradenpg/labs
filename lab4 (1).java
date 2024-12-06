
package labs;
//Braden Green
import java.util.Scanner;
public class lab4 {

	public static void main(String[] args) {
		//scans for the user's input
				Scanner key = new Scanner(System.in);
				
				
				System.out.println("How many books did you purchase at BN booksellers this month?");
				
				int choice  = key.nextInt();
				
				String books = "";
				//to calculate the point systems
				switch(choice) {
				
				case 1:
					books = "5";
					break;
				case 2:
					books = "15";
					break;
				case 3:
					books = "30";
					break;
				case 4:
					books = "60";
					break;
					
				}
				//if the user input is 0 then this is what its going to show
				if(choice == 0) {
					
					System.out.println("You have not earned any points yet. Make a book purchase to start earning points!");
					
					System.exit(0);
					
				}
				//if user input is less than 0 than this is what it shows
				if(choice < 0) {
					
					System.out.println("Invalid value entered! Exiting the program!");
					
					System.exit(0);
					
				}
				//if user input is more that 4 than it gives maximum points allowed
				if(choice > 4) {
					System.out.println("Congratulations!!! You have earned 60 points!");
				
				System.out.println("You may redeem these points on your next book purchase!");
				// used system exit here so it doesn't show the other messages if the number is within 1 and 4
				System.exit(0);
				
				}
				
				//if the input is one of the cases than it will show this
				System.out.println("Congratulations!!! You have earned "+books+" points!");
				
				System.out.println("You may redeem these points on your next book purchase!");


	}

}
