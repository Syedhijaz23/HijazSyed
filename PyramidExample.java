
public class PyramidExample {
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.println(" * ");
				}
	         System.out.println();
		}
	}
}
 public class PyramidExampleReverse {
	 public static void main(String[] args) {
		 int term=6;
		 for(int i=1;i<=term;i++)
		 {
			 for(int j=term;j>=i;j--)
			 {
				 System.out.println(" * ");
			 }
			 System.out.println();
		 }
	 }
 }
  Floyd triangle
   import java.util.Scanner;
import java.util.scanner;
        class FloydTriangle
        {
        	public static void main(String[] args) 
        	{
        		int rows, number = 1, counter, j;
        		Scanner input = new scanner(System.in);
        		System.out.println("Enter the number of rows for floyd's triangle");
        		
        		rows = input.nextInt();
        		System.out.println("Floys's triangle");
        		System.out.println("***********");
        		for( counter = i; counter <= rows; counter++)
        		{
        			for( j = 1; j<=1; j++)
        			{
        				System.out.println(number+" ");
        				
        				number++;
        				
        				System.out.println();
        			}
        		}
        	}
        }