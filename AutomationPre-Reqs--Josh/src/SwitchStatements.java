import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int value = scanner.nextInt();
		
		switch(value) {
		case 1:
			System.out.println("Got 1");
			break;
		case 66:
			System.out.println("Got 66");
			break;
		
		default:
			System.out.println("Got something else");
		}

	}

}
