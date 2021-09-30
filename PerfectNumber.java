package lineprogram;
import java.util.Scanner;
	public class PerfectNumber {
		public static void main(String[] args) {
			int num, sum = 0;
			int i = 1;
			System.out.println("Welcome to the perfect number checking program ");
			//Ask user to enter the number
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			num = sc.nextInt();
			//While loop to checking perfect number
			for(i = 1; i <  num;i++) {
				if (num % i == 0) {
					//calculates the sum of factors
					sum = sum + i;
				}
			}
			if (sum == num) {
				//print if sum and n are equal
				System.out.println(num + " is a perfect number.");
			} else
				//print if sum and n are not equal
				System.out.println(num + " is not a perfect number.");
		}
	}


		