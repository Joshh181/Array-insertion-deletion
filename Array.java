import java.util.Scanner;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        final int MAX_SIZE = 100;
        int[] x = new int[MAX_SIZE];
        int n = 0;

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();

        // Generate random single-digit elements (1-9)
        for (int i = 0; i < n; i++) {
            x[i] = rand.nextInt(9) + 1;
        }

        // Display the array vertically with array name
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

        // Input location for insertion (1-based index)
        System.out.print("Enter the location to insert the element (1-based): ");
        int insertPos = sc.nextInt() - 1; // Convert to 0-based

        // Input value to insert (ensure single digit, but allow user input; assume 1-9)
        System.out.print("Enter the value to insert: ");
        int insertVal = sc.nextInt();

        // Insert: Shift elements to the right
        if (n < MAX_SIZE) {
            for (int i = n; i > insertPos; i--) {
                x[i] = x[i - 1];
            }
            x[insertPos] = insertVal;
            n++;
        } else {
            System.out.println("Array is full. Cannot insert.");
            sc.close();
            return;
        }

        // Display after insertion vertically
        System.out.println("after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

        // Input location for deletion (1-based index)
        System.out.print("Enter the location of the element to delete (1-based): ");
        int deletePos = sc.nextInt() - 1; // Convert to 0-based

        // Delete: Shift elements to the left
        if (deletePos >= 0 && deletePos < n) {
            for (int i = deletePos; i < n - 1; i++) {
                x[i] = x[i + 1];
            }
            n--;
        } else {
            System.out.println("Invalid location. Cannot delete.");
            sc.close();
            return;
        }

        // Display after deletion vertically
        System.out.println("after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

        sc.close();
    }
}