package HackerEarth.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class cSort_out {

	public static class pair {
		int data;
		int idx;

		public pair(int data, int idx) {
			this.data = data;
			this.idx = idx;
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int size = scn.nextInt();

		pair[] array = new pair[size];

		for (int i = 0; i < array.length; i++) {
			pair p = new pair(scn.nextInt(), i);
			array[i] = p;
		}

//		sortArray(array);
		Arrays.sort(array);
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i].idx + " ");
		}

	}

	private static void sortArray(pair[] array) {

		int n = array.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {

				if (array[j].data > array[j + 1].data) {
					// swap
					pair temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}

			}
		}

	}

}
