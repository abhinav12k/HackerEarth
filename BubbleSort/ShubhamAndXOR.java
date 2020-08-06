package HackerEarth.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class ShubhamAndXOR {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] array = new int[n];
		
		for(int i=0;i<array.length;i++) {
			array[i]=scn.nextInt();
		}
		
//		sortArray(array);
		Arrays.sort(array);
		
		int prev = array[0];
		int count=0;
		
		for (int i = 1; i < array.length; i++) {
			
			if(prev==array[i])
				count++;
			else
				prev=array[i];
		}
		
		System.out.println(count);

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
