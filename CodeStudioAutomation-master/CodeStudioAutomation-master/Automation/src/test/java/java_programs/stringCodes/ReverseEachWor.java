package java_programs.stringCodes;

public class ReverseEachWor {
	
	 public static void main(String[] args) {
	        String str = "Java is   great and powerful language";

	        String[] split = str.split("\\s+");
	        
	        for (String word : split) {
	            char[] ch1=word.toCharArray();
	            for (int i=ch1.length-1;i>=0;--i) {
					System.out.print(ch1[i]);
				}
	            
	            System.out.print(" ");
	            
	        }      
	    }
	
}
