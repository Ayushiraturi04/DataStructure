
// Heap sort

import java.util.*;

public class JobApplicant {
    // Function to perform Heap Sort
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (max element) with the last element
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Reheapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Function to heapify a subtree rooted at node 'i'
    private static void heapify(int[] salaries, int n, int i) {
        int largest = i; // Assume root is largest
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // If left child is larger than root
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // If right child is larger than the largest so far
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If largest is not root, swap and continue heapifying
        if (largest != i) {
            int temp = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(salaries, n, largest);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input: Number of job applicants
        System.out.print("Enter the number of job applicants: ");
        int n = s.nextInt();

        // Input: Salary expectations
        int[] salaries = new int[n];
        System.out.print("Enter the expected salaries: ");
        for (int i = 0; i < n; i++) {
            salaries[i] = s.nextInt();
        }

        // Sorting salaries using Heap Sort
        heapSort(salaries);

        // Output: Sorted salary expectations
        System.out.print("After heap Sort salaries: ");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }

    }
}
