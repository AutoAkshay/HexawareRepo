package java_programs.array;

import java.util.Iterator;

public class Practice {

	public static void main(String[] args) {
		String name="Akshay Anil Kalam";
		
		String [] arr=name.split(" ");
		 for (String split:arr) {
			 
			 char[] ch=split.toCharArray();
			 
			 for (int i = split.length()-1; i >=0; --i) {
				System.out.print(ch[i]);
			}
			System.out.print(" ");
		}

	}

}
