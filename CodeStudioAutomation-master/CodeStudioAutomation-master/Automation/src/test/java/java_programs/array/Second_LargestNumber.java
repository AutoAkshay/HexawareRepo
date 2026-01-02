
package java_programs.array;

public class Second_LargestNumber {

	public static void main(String[] args) {

		Integer[] number = { 2, 5, 7, 12, 15, 19, 23, 28, 31, 47, 39, 41, 44, 44, 44, 21, 47 };

		for (int i = 0; i < number.length - 1; i++) {
			for (int j = 0; j < number.length - 1; j++) {
				if (number[j] < number[j + 1]) {
					int temp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = temp;
				}
			}
		}

		// Find and print the first unique number
		for (int i = 0; i < number.length - 1; i++) {

			if (number[i] != number[i + 1]) {
				System.out.println(number[i + 1]);
				break;
			}
		}
	}
}
