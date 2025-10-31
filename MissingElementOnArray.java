package week3day2;

public class MissingElementOnArray {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 3, 2, 8, 6, 7};
        int n = 8; // the maximum number expected
        
        // Loop through 1 to n to find the missing number
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            
            // Check if i exists in the array
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    found = true;
                    break; // stop inner loop when found
                }
            }
            
            // If not found, this is the missing number
            if (!found) {
                System.out.println("Missing number is: " + i);
            }
        }
    }
}