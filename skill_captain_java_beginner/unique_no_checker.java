import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class unique_no_checker {
    public static void main(String[] args) {
        Set<Integer> uniqueSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOperations:");
            System.out.println("1. add(int num)");
            System.out.println("2. remove(int num)");
            System.out.println("3. contains(int num)");
            System.out.println("4. size()");
            System.out.println("5. isEmpty()");
            System.out.println("6. exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number to add: ");
                    int numToAdd = scanner.nextInt();
                    add(uniqueSet, numToAdd);
                    break;
                case 2:
                    System.out.print("Enter the number to remove: ");
                    int numToRemove = scanner.nextInt();
                    remove(uniqueSet, numToRemove);
                    break;
                case 3:
                    System.out.print("Enter the number to check: ");
                    int numToCheck = scanner.nextInt();
                    System.out.println("Contains " + numToCheck + ": " + contains(uniqueSet, numToCheck));
                    break;
                case 4:
                    System.out.println("Set size: " + size(uniqueSet));
                    break;
                case 5:
                    System.out.println("Is set empty: " + isEmpty(uniqueSet));
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void add(Set<Integer> set, int num) {
        set.add(num);
        System.out.println("add(" + num + "): Set: " + set);
    }

    private static void remove(Set<Integer> set, int num) {
        if (set.remove(num)) {
            System.out.println("remove(" + num + "): Set: " + set);
        } else {
            System.out.println("remove(" + num + "): " + num + " not found in the set. Set: " + set);
        }
    }

    private static boolean contains(Set<Integer> set, int num) {
        return set.contains(num);
    }

    private static int size(Set<Integer> set) {
        return set.size();
    }

    private static boolean isEmpty(Set<Integer> set) {
        return set.isEmpty();
    }
}
