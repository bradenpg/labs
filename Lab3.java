//Braden Green
import java.util.Scanner;

public class Lab3 {
	
	public static final int PRICE = 99;

	public static void main(String[] args) {
		//to scan for the answer from user
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the total number of software packages ordered: ");
		 
		int packages =key.nextInt();
		
		double discount_rate= 0;
		//if the input from user is less than 0 it will show that message
		if(packages <= 0) {
			System.out.println("Invalid value for package count! Exiting the program!");
			System.exit(0);			
		}
		//no discount rate for 10
		if(packages < 10) {
	
		
		}
		//discount rate is 20
		if(packages >= 10 && packages < 19) {
			 discount_rate = 20;
			
		}
		//discount rate is 30
		else if(packages >= 20 && packages < 49) {
			 discount_rate = 30;
			
		}
		//discount rate is 40
		else if(packages >=50 && packages <99) {
			 discount_rate = 40;
			
		}
		//100 and higher the discount rate is 50
		else if (packages >= 100) {
			 discount_rate = 50;
			
		}
		//this is before discount
		int total_before_discount = packages * PRICE;
		// this is the amount of the discount
		double discount_amount = (discount_rate / 100) * total_before_discount;
		//this is for after discount
		double total_after_discount = total_before_discount - discount_amount;
		//shows the totals
		System.out.println("Total Bill Amount (before discount) = $"+total_before_discount);
		
		System.out.println("Amount of discount = $"+discount_amount);
		
		System.out.println("Total Bill Amount (after discount) = $"+total_after_discount);
			
		
		
		

	}




	}

