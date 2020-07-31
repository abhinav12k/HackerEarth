package HackerEarth.BubbleSort;

import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int size = scn.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextInt();
		}

		System.out.println(sortArray(array));

	}

	private static int sortArray(int[] array) {

		int count = 0;
		int n = array.length;
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			count++;
			for (int i = 0; i < n - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapped = true;
				}
			}
		}
		return count;
	}

}
