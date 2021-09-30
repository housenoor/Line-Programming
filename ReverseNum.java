package lineprogram;
import java.util.Scanner;

	public class ReverseNum {
		public static void main(String[] args) {
			int n ,reverse;
			System.out.println("Enter any Number");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			sc.close();
			while(n>0)
			{
				reverse=n%10;
				System.out.print(reverse);
				n=n/10;
			
			}
		
		}
	}