package basicJava.zzstringCodes;

public class Word {

	public static void main(String[] args) {
		int a[] = {12, 35, 1, 10, 34};
		int temp, size;
		size = a.length;
		
		for (int i = 0; i <= a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println(a[1]);
	}

}
