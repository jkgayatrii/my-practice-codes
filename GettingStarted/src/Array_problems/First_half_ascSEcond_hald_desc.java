package Array_problems;

import java.util.Arrays;

public class First_half_ascSEcond_hald_desc {
	static void ascDes(int arr[]) {
		
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i]<arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
			
		}for(int i=arr.length/2;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
			
		}
	}public static void main(String[] args) {
		int arr[]= {67,83,96,36,456,39,94,36};
		ascDes(arr);
		System.out.println(Arrays.toString(arr));
	}

}
