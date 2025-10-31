package week3day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
		String test = "changeme";
		char[] charArray = test.toCharArray();
		
		for(int i=0; i<charArray.length; i++) {
			if (i%2!=0) { 
                System.out.print(Character.toUpperCase(charArray[i]));
            } else {
                System.out.print(charArray[i]);
            }

	}

}
}

