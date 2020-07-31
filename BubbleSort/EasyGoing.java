package HackerEarth.BubbleSort;

import java.util.Scanner;

public class EasyGoing {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc-- != 0) {
			
			int n = scn.nextInt();
			int m = scn.nextInt();

			int[] array = new int[n];

			for (int i = 0; i < array.length; i++) {
				array[i] = scn.nextInt();
			}
			
			sortArray(array);

			int count = Math.abs(n-m);
			
			int maxSum = 0;
			
			for(int i= array.length-1;i>=0 && count!=0;i--) {
				maxSum+=array[i];
				count--;
			}
			
			int minSum=0;
			count = Math.abs(n-m);
			for(int i= 0;i<array.length && count!=0 ;i++) {
				minSum+=array[i];
				count--;
			}
			System.out.println(maxSum-minSum);
		}

	}

	private static void sortArray(int[] array) {
		
		for(int i=0;i<array.length-1;i++) {
			
			for(int j=0;j<array.length-i-1;j++) {
				
				if(array[j]>array[j+1]) {
					//swap
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}
			
		}
	}

}
