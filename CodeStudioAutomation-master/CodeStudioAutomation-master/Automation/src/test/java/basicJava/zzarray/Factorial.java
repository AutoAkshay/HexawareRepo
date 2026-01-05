package basicJava.zzarray;

public class Factorial {

	public static void main(String[] args) {
		
		int number=5;
		int i =1;
		int fact=1;
		while(i<=5){
		fact=fact*i;//1*1,2*2,6*3,24*4,1*5
		i++;
		}

		System.out.println(fact);
	}

}
