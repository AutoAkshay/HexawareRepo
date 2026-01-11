package basicJava.zzstringCodes;

public class CamelEachWord {
	public static void main(String[] args) {

		String string = "My Name Is Akshay";

		String[] str = string.split(" ");

		for (String eachString : str) {
			System.out.print(
					eachString.toLowerCase().charAt(0) + eachString.toUpperCase().substring(1, eachString.length()));

			System.out.print(" ");
		}

	}

}
