import java.util.Scanner;
import java.util.scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int number, sum=0;
		Scanner sc=new scanner(System.in);
		
		System.out.println("n please Enter any integer Value below 10: ");
		number = sc.nextInt();
		
		while(number <= 10) {
			sum = sum + number;
			number++;
			
		}
		System.out.format(" Sum of the numbers from the While loop is: %d",sum);
		}

	}


