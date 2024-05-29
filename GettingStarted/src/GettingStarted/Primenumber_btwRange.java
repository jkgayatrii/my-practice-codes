package GettingStarted;

public class Primenumber_btwRange {
	static void prime(int n,int m) {
		for(int i=n;i<=m;i++) {
			int c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c+=1;
				}
				
					
				}if(c==2) {
					System.out.println(i);
			}
		}
		
	}public static void main(String[] args) {
		prime(10,40);
	}
}
