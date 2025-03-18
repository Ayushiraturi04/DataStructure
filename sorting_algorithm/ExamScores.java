// Selection sort

import java.util.*;

public class ExamScores {
    // Function to perform Selection Sort
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first element is the minimum

            // Find the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first element of the unsorted portion
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int n = s.nextInt();

        // Input: Exam scores
        int[] scores = new int[n];
        System.out.print("Enter the exam scores: ");
        for (int i = 0; i < n; i++) {
            scores[i] = s.nextInt();
        }

        // Sorting scores using Selection Sort
        selectionSort(scores);

        // Output: Sorted exam scores
        System.out.print("Aftter selction Sort exam scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }

    }
}
