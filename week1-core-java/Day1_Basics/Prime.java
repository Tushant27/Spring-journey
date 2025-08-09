package goal;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime {
//	 public  boolean isPrime(int n) {
//	        if (n <= 1) return false;
//
//	        for (int i = 2; i < n; i++) {
//	            if (n % i == 0)
//	                return false;
//	        }
//
//	        return true;
//	 }
//	 

	public static void main(String[] args) {
//		        int[] numbers = {10, 3, 5, 8, 13, 17, 20, 23, 30};
//                Prime p = new Prime();
//		        for (int num : numbers) {
//		            if (p.isPrime(num)) {
//		                System.out.println(num + " is a prime number.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
	

		
		for (int i = 2; i < n; i++)
		{
			       if (n % i == 0)
			       {
			                System.out.println(n+ "  not a prime");
			               System.exit(0);
			       }
		
	    }
		System.out.println(n+ " is prime");  
	       
}
}

	
