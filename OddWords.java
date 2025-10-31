package week3day2;

public class OddWords {

    public static void main(String[] args) {
        String test = "I am a software tester"; 
        
        // Split the words into an array
        String[] split = test.split(" ");
        
        // Traverse each word using loop
        for (int i = 0; i < split.length; i++) {
            if (i % 2 != 0) { // odd index
                // Convert the word to a character array
                char[] charArray = split[i].toCharArray();
                // Reverse the character array and print
                for (int j = charArray.length - 1; j >= 0; j--) {
                    System.out.print(charArray[j]);
                }       
            } else {
                // Print the word as it is
                System.out.print(split[i]);
            }
            // Add a space after each word
            System.out.print(" ");
        }
    }
}