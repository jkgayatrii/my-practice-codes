package Array_problems;

import java.util.Arrays;

public class Duplicate_elements {
	public static void main(String[] args) {
		int arr[]= {20,30,20,10,40,40,20};
		int s=arr.length;
		int[] temp = new int[s];
		dupli(arr,s,temp);
	}

	private static void dupli(int[] arr, int s,int n[]) {
		Arrays.sort(arr);
		int j=0;
		for(int i=0;i<s-1;i++) {
			if(arr[i]!=arr[i+1]) {
				n[j++]=arr[i];			}
			
			
		}
		n[j++]=arr[s-1];
		for(int i=0;i<j;i++) {
			System.out.print(n[i]+" ");
        }
		// TODO Auto-generated method stub
		
	}
}
