import java.util.Scanner;
public class FindAreaOfSquare {

	public static void main(String[] args) {
		 System.out.println('Enter size of Square;');
		 
		 Scanner scanner=new scanner(System.in);
		  double side = scanner.nextDouble();
		  
		  double area = side*side;
		  System.out.println("Area of square is:"+area);

	}

}
