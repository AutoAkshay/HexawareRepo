package hexaware_practice;

public class Second_LargestNumber {
	
	public static void main(String[] args) {
		
		Integer[] a= {1,2,3,1,4,5,6,7,9,10,10};
		
		int temp=0;
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}			
			}
		}
		
		System.out.println("Second largest number ::"+temp);
	}
	
}