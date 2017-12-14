import java.util.Scanner;

public class DoWhileLoopJosh2 {
	public static void main (String[] args)
	{
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		do
		{
			System.out.println("Enter an integer: ");
			if (scan.hasNextInt())
			{
				num = scan.nextInt();		
			}
			else
			{
				scan.next();
				continue;
			}
		}while(num <= 10);
		
		System.out.println("Integer greater than 10 detected!");
		scan.close();
		
	}


}
