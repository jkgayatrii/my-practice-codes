package GettingStarted;

public class fibonacci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=10;
		int i=0;
		int sum=0;
		while(i<10) {
			sum=a+b;
			System.out.println(a);
			
			a=b;
			b=sum;
			i++;
			
		}
	}
}
