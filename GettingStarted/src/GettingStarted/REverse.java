package GettingStarted;

public class REverse {
	static void reverse(int n) {
		int rev=0;
		while(n>0) {
		int a=n%10;
		rev=rev*10+a;
		n=n/10;
		}
		System.out.println(rev);
		
		
	}
	public static void main(String[] args) {
		reverse(456);
	}
}
