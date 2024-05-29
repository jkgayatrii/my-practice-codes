package GettingStarted;

public class Sum_Given_Range {
	public static void sum(int a,int b) {
		int sum=0;
		for (int i=a;i<=b-1;i++) {
			sum=sum+i;
		}
		System.out.println("sum:"+sum);
	}public static void main(String[] args) {
		Sum_Given_Range.sum(10, 20);
	}
}
