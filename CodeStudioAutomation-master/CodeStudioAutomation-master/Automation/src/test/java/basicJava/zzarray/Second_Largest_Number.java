package basicJava.zzarray;

public class Second_Largest_Number {
	
	public static void main(String[] args) {
		
		Integer[] number = { 50, 51, 50, 53, 49 ,49,53, 51,48,48,48};

		int temp = 0;
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length; j++) {
				if (number[i] < number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}

		for (int i = 0; i < number.length; i++) {

			try {
				if (number[i] != number[i + 1]) {
					System.out.println(number[i + 1]);
					break;
				}
			}

			catch (Exception e) {
				System.out.println("No second largest value");
			}
		}
	
	}
}
