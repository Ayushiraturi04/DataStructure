
// Bubble sort

import java.util.*; // Importing the Scanner class for user input

public class StudentsMarks {
    // Method to perform Bubble Sort on the given array
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Get the length of the array
        boolean swapped;

        // Outer loop to go through the entire array
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Initialize swapped as false

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // If current element is greater than the next one
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Mark that a swap occurred
                }
            }

            // Optimization: If no swaps occurred, the array is already sorted
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Create a Scanner object for input

        // Taking user input for number of students
        System.out.print("Enter number of Students: ");
        int n = s.nextInt();

        // Taking user input for marks of students
        System.out.print("Enter marks of Students: ");
        int[] marks = new int[n]; // Array to store marks
        for (int i = 0; i < n; i++) {
            marks[i] = s.nextInt(); // Storing input values in the array
        }

        // Calling the bubbleSort function to sort the marks
        bubbleSort(marks);

        // Printing the sorted marks
        System.out.print("After bubble sorting: ");
        System.out.print(Arrays.toString(marks));
    }
}
