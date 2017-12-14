package JavaPreReqs;

import java.util.Scanner;

public class PreventCrashing {
	
	public static void main(String[] args) {

        int value = 0;
        Scanner scanner = new Scanner(System.in);

        while(value != 5) {
            System.out.println("Enter the number 5: ");

            if(scanner.hasNextInt()) {
                value = scanner.nextInt();
            }
            else {
                scanner.nextLine();
            }

        }

        System.out.println("Got it!");
        scanner.close();

    }

}
