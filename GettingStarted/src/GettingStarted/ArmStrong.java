package GettingStarted;

public class ArmStrong {
	static void arm(int num) {
		int temp=num;
		int c=order(temp);
		int rev=armmstrong(temp,c);
		if(temp==rev) {
			System.out.println("Armstrong");
		}else {
			System.out.println("NOt Armstrong");
		}
	}

	private static int armmstrong(int temp, int c) {
		int rev=0,digit;
		while(temp!=0) {
			digit=temp%10;
			 rev= rev+(int)Math.pow(digit,c);
			temp=temp/10;
		}return rev;
		
			
	}

	private static int order(int num) {
		int len=0;
		while (num!=0)
        {
            len++;
            num = num/10;
        }
        return len;
	}
    public static void main(String[] args) {
    	arm(153);
}
}
