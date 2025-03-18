// Quick sort

import java.util.*;

public class Ecommerce {
    // QuickSort function: Sorts the array using divide and conquer
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // Partitioning the array

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition function: Places pivot at its correct position
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as pivot
        int i = low - 1; // Pointer for smaller elements

        // Traverse and compare each element with the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++; // Move pointer
                // Swap elements to place smaller element in correct position
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap pivot with the element at (i+1) to place it correctly
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return pivot index
    }

    // Function to display the sorted product prices
    public static void display(int[] product_price) {
        System.out.println("Sorted product prices: " + Arrays.toString(product_price));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the number of products: ");
        int n = s.nextInt();

        int[] product_price = new int[n];

        System.out.print("Enter the product prices: ");
        for (int i = 0; i < n; i++) {
            product_price[i] = s.nextInt();
        }

        // Sorting using QuickSort
        quickSort(product_price, 0, product_price.length - 1);

        // Display the sorted prices
        display(product_price);
    }
}
