package Loop;
//Program 3: Using a `do-while` loop to prompt the user for a number between 1 and 10:

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.println("You entered: " + number);
        scanner.close();
    }
}