import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int value = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(value != 5) {
			System.out.println("Enter the number 5: ");
			value = scanner.nextInt();
		}
		
		System.out.println("Got it!");

	}

}
