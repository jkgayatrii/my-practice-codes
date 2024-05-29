/*package Array_problems;

import java.util.Arrays;

public class Second_smallest {
	public static void main(String[] args) {
		int arr[]= {10,30,50,15,30,37};
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}*/
package Array_problems;

import java.util.Arrays;

public class Second_smallest {
	static int secSmallest(int arr[], int n)
	{      // assigning first element as smallest temporarily
      int smallest = arr[0];

      // we find the smallest element here
      for (int i=0; i < n; i++){
         if(arr[i] < smallest)
            smallest = arr[i];
      }

     // temporarily assinging largest max value
     int sec_smallest = Integer.MAX_VALUE;


     // finding second smallest here
     for (int i=0; i < n; i++){
         if(arr[i] != smallest && arr[i] < sec_smallest)
           sec_smallest = arr[i];
     }
     
    return sec_smallest;

  }
  public static void main(String args[])
  {

	  int arr[]= {10,30,50,15,30,37};
	  int n = arr.length;
      System.out.print(secSmallest(arr, n)); 
      
   }
}
