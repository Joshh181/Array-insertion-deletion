# Array-insertion-deletion
insert and delete array

import java.util.Scanner;
- Lets the program read input from the user.

import java.util.Random;
- Lets the program generate random numbers.

public class Array {
- Starts a public class named `Array`.

    public static void main(String[] args) {
    - The main method — where the program starts running.

        Scanner sc = new Scanner(System.in);
        - Creates a `Scanner` object named `sc` to read user input.

        Random rand = new Random();
        - Creates a `Random` object named `rand` to make random numbers.

        final int MAX_SIZE = 100;
        - A constant that sets the maximum size of the array to 100.

        int[] x = new int[MAX_SIZE];
        - Creates an integer array `x` that can hold up to 100 numbers.

        int n = 0;
        - A variable to store how many numbers the user wants in the array.

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        - Asks the user how many numbers they want to store.

        n = sc.nextInt();
        - Reads the user’s input and saves it in `n`.

        // Generate random single-digit elements (1-9)
        for (int i = 0; i < n; i++) {
            x[i] = rand.nextInt(9) + 1;
        }
        - Fills the array with random numbers between 1 and 9.

        // Display the array vertically with array name
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
        - Shows the numbers in the array one by one.

        // Input location for insertion (1-based index)
        System.out.print("Enter the location to insert the element (1-based): ");
        - Asks the user where they want to insert a new number.

        int insertPos = sc.nextInt() - 1;
        - Reads the position, subtracts 1 to make it 0-based (since arrays start at 0).

        // Input value to insert
        System.out.print("Enter the value to insert: ");
        - Asks the user what number they want to insert.

        int insertVal = sc.nextInt();
        - Reads and stores the value to be inserted.

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
        - If there’s space, moves elements to the right and adds the new number.  
          Otherwise, it prints an error message.

        // Display after insertion vertically
        System.out.println("after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
        - Shows the updated array after inserting the new value.

        // Input location for deletion (1-based index)
        System.out.print("Enter the location of the element to delete (1-based): ");
        - Asks the user which number they want to delete.

        int deletePos = sc.nextInt() - 1;
        - Reads the position to delete and converts it to 0-based.

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
        - If the position is valid, moves elements left to remove the chosen number.  
          Otherwise, prints an error message.

        // Display after deletion vertically
        System.out.println("after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
        - Shows the final array after deleting the element.

        sc.close();
        - Closes the `Scanner` to free up resources.

    }
    - Ends the main method.

}
- Ends the class.
