package GettingStarted;

public class Palindrome {
	/*
	 * static void pali(StringBuilder word) { System.out.println(word.reverse()); }
	 * public static void main(String[] args) { StringBuilder StringBuilder;
	 * pali(new StringBuilder("hello")); }
	 */
	static void pali(String word) {
		String rev="";
		for(int i=word.length()-1;i>=0;i--) {
			rev=rev+word.charAt(i);
			
			
		}
		System.out.println(rev);
	}public static void main(String[] args) {
		pali("gayatri");
	}
}
