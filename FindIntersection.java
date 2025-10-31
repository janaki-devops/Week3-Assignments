package week3day2;

public class FindIntersection {

    public static void main(String[] args) {
        int a[] = {3, 2, 11, 4, 6, 7}; 
        int b[] = {1, 2, 8, 4, 9, 7};
      
        for (int i = 0; i < a.length; i++) {     // loop through array a
            for (int j = 0; j < b.length; j++) { // loop through array b
                if (a[i] == b[j]) {              // check if elements match
                    System.out.println("The common numbers are: " + a[i]);
                }
            }
        }
    }
}