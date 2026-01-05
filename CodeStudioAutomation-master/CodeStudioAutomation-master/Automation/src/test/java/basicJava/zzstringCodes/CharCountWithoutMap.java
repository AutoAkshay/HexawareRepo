package basicJava.zzstringCodes;

import org.testng.annotations.Test;

public class CharCountWithoutMap {

	@Test
	public void test() {
		
		String str = "Akshay Anil Kalam Akshay Anil Kalam";
		
		int[] charCounts = new int[256]; // Assuming ASCII characters
		
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.toLowerCase().charAt(i);
			charCounts[c]++;
		}

		for (int i = 0; i < charCounts.length; i++) {
			if (charCounts[i] > 0) {
				System.out.println((char)i+":"+charCounts[i]);
			}
		}
	}
}
