package week3day2;

public class DuplicateWords {

	 public static void main(String[] args) {

	        String text = "We learn Java basics as part of java sessions in java week1";

	        // Split the text into words
	        String[] words = text.split(" ");

	        int count = 0;

	        // Compare each word with every other word
	        for (int i = 0; i < words.length; i++) {
	            for (int j = i + 1; j < words.length; j++) {
	                if (words[i].equalsIgnoreCase(words[j])) {
	                    words[j] = "";  // Replace duplicate with empty string
	                    count++;
	                }
	            }
	        }

	        // Print the modified array
	        System.out.println("Output after removing duplicates:");

	        for (int i = 0; i < words.length; i++) {
	            if (!words[i].equals("")) {
	                System.out.print(words[i] + " ");
	            }
	        }
    
    
	     
    }
} 