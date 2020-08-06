package HackerEarth.BubbleSort;

import java.util.ArrayList;
import java.util.Scanner;

public class TheRiseOfWeird {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] array = new int[n];

		//even
		ArrayList<Integer> even = new ArrayList<>();
		//odd
		ArrayList<Integer> odd = new ArrayList<>();
		
		//totalArray
		ArrayList<Integer> total = new ArrayList<>();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextInt();
			if(array[i]%2==0) {
				//even
				even.add(array[i]);
			}else {
				//odd
				odd.add(array[i]);
			}
		}

		int sum = sortArray(even);
		even.add(sum);
		sum = sortArray(odd);
		odd.add(sum);
		
		total.addAll(even);
		total.addAll(odd);

		for(int i=0;i<total.size();i++) {
			System.out.print(total.get(i)+" ");
		}
		
	}

	private static int sortArray(ArrayList<Integer> array) {

		// applying insertion sort
		int sum=0;
		for (int i = 0; i < array.size(); i++) {
			int temp = array.get(i);
			sum+=temp;
			int j=i-1;
			for (; j >= 0 && temp < array.get(j); j--) {
				array.remove(j+1);
				array.add(j+1, array.get(j));
			}
			array.remove(j+1);
			array.add(j+1,temp);
		}

		return sum;
	}

}
