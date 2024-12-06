//Braden Green
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many dollars would you like to spend on chocolate from the vending machine?");
		//the user is entering the number of dollars that they have
		int dollars = key.nextInt();
		//the number of chocolates equals the number of dollars
		int chocolates = dollars;
		//the number of coupons equals the original number of chocolates
		int coupons = chocolates;
		//loop to read the users input if it is 6 or more
		while(coupons >= 6) {
			//subtract because thats the number for additional bar
			coupons = coupons - 6;
			//add one because of the coupons
			chocolates = chocolates + 1;
			//gain from the chocolate that you get
			coupons = coupons + 1;
			//runs over and over until your coupons are less than 6
			
			
		}
		//if user input is negative it will exit the program
		if(coupons < 0) {
			System.out.println("Invalid value for amount! Exiting the program!");
			System.exit(0);
		}
		

		//tells you number of chocolate and coupons you have
		System.out.println("You can buy "+chocolates+" chocolate bars and will have "+coupons+" coupons left!");
			


}
}
