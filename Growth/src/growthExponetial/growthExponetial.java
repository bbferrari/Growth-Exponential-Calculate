package growthExponetial;

import java.util.Scanner;

public class growthExponetial {

	public static void main(String[] args) {
		
		// y = a(1 + r)^x
		// a = initial value
		// r = growth rate
		// x = time interval
		
		System.out.println("Enter initial value (a): ");
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		System.out.println("Enter Growth rate (r): ");
		double r = scan.nextDouble();
		
		System.out.println("Enter time interval in days (x): ");
		int x = scan.nextInt();
		
		System.out.println(calculateGrowth(a,r,x)); 
		
	}
	
	public static int calculateGrowth(int a, double r, int x) {
		return (int) (a * Math.pow((1 + r), x));
	}

	
	

}
