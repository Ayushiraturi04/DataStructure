// Counting sort

import java.util.*;

public class StudentAge {
    // Function to perform Counting Sort
    public static void countingSort(int[] ages) {
        int minAge = 10, maxAge = 18; // Given range of student ages
        int range = maxAge - minAge + 1;

        // Step 1: Create and initialize count array
        int[] count = new int[range];
        Arrays.fill(count, 0);

        // Step 2: Store the frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 3: Compute cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Place elements in the correct position
        int[] sortedAges = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            sortedAges[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }

        // Copy sorted ages back to original array
        System.arraycopy(sortedAges, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int n = s.nextInt();

        // Input: Student ages
        int[] ages = new int[n];
        System.out.print("Enter the ages of students (10-18): ");
        for (int i = 0; i < n; i++) {
            ages[i] = s.nextInt();
        }

        // Sorting ages using Counting Sort
        countingSort(ages);

        // Output: Sorted student ages
        System.out.print("After counting Sort: ");
        for (int age : ages) {
            System.out.print(age + " ");
        }

    }
}
