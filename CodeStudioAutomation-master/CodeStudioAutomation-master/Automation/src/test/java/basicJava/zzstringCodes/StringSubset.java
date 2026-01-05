package basicJava.zzstringCodes;

import java.util.ArrayList;
import java.util.List;

public class StringSubset {
	
	public static void main(String[] args) {
        String str = "Akshay";  
        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {   
            for (int j = i + 1; j <= str.length(); j++) {  
                substrings.add(str.substring(i, j));
            } 
        }
        
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}
