import java.util.Scanner;

/*1. Create a new class named “Application” that asks the user 
 * to enter an integer. If the integer is less than 10, print 
 * the message "This number is too small" on the console. If 
 * the integer is greater than or equal to 10, print "This number
 *  is big enough". 
*/

public class Application2 {
	public static void main (String[] args) {

	//public static void enterNum ()
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.println("Enter an integer: ");
		if (scan.hasNextInt())
		{
			num = scan.nextInt();
			if (num < 10)
			{
				System.out.println("This number is too small");
			}
			else
			{
				System.out.println("This number is big enough");
			}
		}
		else
		{
			System.out.println("Not a valid integer.");
			if (scan.hasNext())
				scan.next();
		}
		scan.close();
		
	}

}
