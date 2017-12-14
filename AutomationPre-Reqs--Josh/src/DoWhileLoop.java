import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int value = 0;
		
		do
		{
			System.out.println("Enter an integer: ");
			
			value = scanner.nextInt();
			
		}
		while(value <= 10);
			
		System.out.println("Integer greater than 10 detected");

	}

}
