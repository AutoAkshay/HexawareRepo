package basicJava.zzstringCodes;

import org.testng.annotations.Test;

public class CharCountWithoutMap {

	@Test
	public void test() {
		
		String str = "Akshay Anil Kalam Akshay Anil Kalam";

		String str2=str.replaceAll("\\s+","");
		System.out.println(str2);
		
		int[] charCounts = new int[256]; // Assuming ASCII characters
		
		
		for (int i = 0; i < str2.length(); i++) {
			char c = str2.toLowerCase().charAt(i);
			charCounts[c]++;
		}

		for (int i = 0; i < charCounts.length; i++) {
			if (charCounts[i] > 0) {
				System.out.println((char)i+":"+charCounts[i]);
			}
		}
	}
}
