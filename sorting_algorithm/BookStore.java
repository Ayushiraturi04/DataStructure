// merge sort

import java.util.*;

public class BookStore {
    // Merge Sort function: Recursively sorts the array by dividing it into two
    // halves
    public static void mergeSort(int[] price, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Calculate middle index

            // Recursively sort the left and right halves
            mergeSort(price, left, mid);
            mergeSort(price, mid + 1, right);

            // Merge the sorted halves
            merge(price, left, mid, right);
        }
    }

    // Merge function: Combines two sorted halves into a single sorted array
    private static void merge(int[] price, int left, int mid, int right) {
        int n1 = mid - left + 1; // Size of left subarray
        int n2 = right - mid; // Size of right subarray

        // Temporary arrays to store left and right halves
        int[] leftprice = new int[n1];
        int[] rightprice = new int[n2];

        // Copy elements from original array to temporary arrays
        System.arraycopy(price, left, leftprice, 0, n1);
        System.arraycopy(price, mid + 1, rightprice, 0, n2);

        // Merge the two sorted arrays
        int i = 0, j = 0, k = left; // Pointers for left, right, and merged array
        while (i < n1 && j < n2) {
            if (leftprice[i] <= rightprice[j]) {
                price[k++] = leftprice[i++]; // Copy smaller element to the merged array
            } else {
                price[k++] = rightprice[j++];
            }
        }

        // Copy remaining elements of left array (if any)
        while (i < n1) {
            price[k++] = leftprice[i++];
        }

        // Copy remaining elements of right array (if any)
        while (j < n2) {
            price[k++] = rightprice[j++];
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking user input for the number of books
        System.out.print("Enter number of books: ");
        int n = s.nextInt();

        int[] price = new int[n]; // Array to store book prices

        // Taking user input for book prices
        System.out.print("Enter book prices: ");
        for (int i = 0; i < n; i++) {
            price[i] = s.nextInt();
        }

        // Sorting book prices using Merge Sort
        mergeSort(price, 0, price.length - 1);
        // Displaying the sorted book prices
        System.out.println("After merge sort prices: " + Arrays.toString(price));
    }
}
