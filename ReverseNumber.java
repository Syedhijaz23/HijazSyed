package assignment3;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		 int num=0;
		 int reversenumber=0;
		 System.out.println("input your number and press enter: ");
		 
		 Scanner in=new scanner(System.in);
		 
		 num = in.nextInt();
		 while(num ! = 0)
		 {
			 
			 reversenum = reversenum = 10;
			 reversenum = reversenum + num%10;
			 num = num/10;
			 
		 }
		 System.out.println("Reverse of input number is:"+reversenum);

	}

}
