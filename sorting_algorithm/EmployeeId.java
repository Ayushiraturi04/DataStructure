
// Insertion sort

import java.util.*; // Importing Scanner class for user input

public class EmployeeId {
    // Method to perform Insertion Sort on the given array
    public static void insertionSort(int[] arr) {
        int n = arr.length; // Get the length of the array

        // Start from the second element (index 1) as the first element is already
        // "sorted"
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Store the current element to be inserted in the correct position
            int j = i - 1;

            // Move elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift elements to the right
                j--;
            }

            // Place the key at its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Create Scanner object for input

        // Taking user input for number of employees
        System.out.print("Enter number of Employees: ");
        int n = s.nextInt();

        // Taking user input for employee IDs
        System.out.print("Enter employee ID: ");
        int[] employeeId = new int[n]; // Array to store employee IDs
        for (int i = 0; i < n; i++) {
            employeeId[i] = s.nextInt(); // Storing input values in the array
        }

        // Calling the insertionSort function to sort the employee IDs
        insertionSort(employeeId);

        // Printing the sorted employee IDs
        System.out.print("After insertion sorting: ");
        System.out.print(Arrays.toString(employeeId));
    }
}
