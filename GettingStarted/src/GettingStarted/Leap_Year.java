package GettingStarted;

public class Leap_Year {
	public static void main(String[] args) {
	int a=3;
	if(a%400==0 || (a%4==0 && a%100!=0)) {
		System.out.println("leapyear");
	}
	else {
		System.out.println("not");
	}
		
	}
		
}
