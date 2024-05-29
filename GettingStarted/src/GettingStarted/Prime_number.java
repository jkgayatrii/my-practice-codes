package GettingStarted;

public class Prime_number {
	static void prime(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c+=1;
			}
		}if(c==2) {
			System.out.println("prime");
		}else {
			System.out.println("Not");
		}
	}public static void main(String[] args) {
		prime(9);
	}
}
