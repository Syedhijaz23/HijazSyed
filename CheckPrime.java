import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {
		 
		int temp;
		boolean is prime = True;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number: ");
		
		int num=scan.nextInt();
		scan.close();
		for(int i=2; i<=num/2; i++)
		{
			temp=num%1;
			if(temp==0)
			{
				isPrime=False;
				break;
			}
		}
          if(isPrime)
        	  System.out.println(num + " is a Prime Number");
          else
        	  System.out.println(num + " is not a Prime Number");
	}

}
