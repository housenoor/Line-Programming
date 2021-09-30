package lineprogram;
import java.util.Scanner;
	public class FibonacciNum {
		public static void main(String[] args) {
			int num1 = 0, num2 = 1, fibonacci, i, num3;
			System.out.println("Welcome to the fibonacci series program");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number to print fibonacci series : ");
			fibonacci = sc.nextInt();
			sc.close();
			System.out.print(num1 + " " + num2); //printing 0 and 1
			//for loop  to evaluating fibonacci series
			//loop starts from 2 because 0 and 1 are already printed
			for (i = 2; i < fibonacci; i++) {
				num3 = num2 + num1;
				System.out.print("  " + num3);
				num1 = num2;
				num2 = num3;
			}
		}
	}
