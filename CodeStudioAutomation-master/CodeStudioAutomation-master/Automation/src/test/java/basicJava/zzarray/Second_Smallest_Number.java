package basicJava.zzarray;

import java.io.IOException;


public class Second_Smallest_Number {

	public static void main(String[] args) throws IOException {
        int a[] = {5, 1, 1, 3, 411, 23, 32, 12, 2,411,2,1};
        int temp, size;
        size = a.length;

        // Sorting the array in ascending order
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // Finding the second largest value
        int largest = a[0];
        int secondLargest = Integer.MAX_VALUE;
        for (int i = 1; i < size; i++) {
            if (a[i] > largest) {
                secondLargest = a[i];
                break;
            }
        }

        System.out.println("The second largest value is: " + secondLargest);
        
	}
}
