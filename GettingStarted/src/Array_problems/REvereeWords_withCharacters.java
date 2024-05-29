package Array_problems;

import java.util.StringTokenizer;

public class REvereeWords_withCharacters {
	public static void main(String[] args) {
		String a="my name is gayatri";
		StringTokenizer s=new StringTokenizer(a," ");
		String c[]=new String[a.length()];
		while(s.hasMoreElements()) {
			String k=s.nextToken();
			for(int i=k.length()-1;i>=0;i--) {
				System.out.print(k.charAt(i));
			}
			System.out.print(" ");
			
		}
		
		
	}
}
