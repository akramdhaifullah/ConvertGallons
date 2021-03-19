package gallonsToLiters;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numgallons;
		
		System.out.println("Convert Gallons to Liters");
		Scanner scan = new Scanner(System.in);
		System.out.println("Gallons : ");
		
		numgallons = scan.nextInt();
		double converttoliters = numgallons * 3.785;
		
		System.out.println(numgallons+" gallons = "+converttoliters+" liters.");
		
		
	}

}
