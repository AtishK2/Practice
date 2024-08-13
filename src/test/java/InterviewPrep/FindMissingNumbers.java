package InterviewPrep;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7};
        int n = 7; // Assuming the range is from 1 to 7

        // List to store missing numbers
        List<Integer> missingNumbers = new ArrayList<>();

        // Check for missing numbers
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j : array) {
                if (i == j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNumbers.add(i);
            }
        }

        // Print missing numbers
        System.out.println("Missing numbers: " + missingNumbers);
    }
}
