package HackerEarth.BubbleSort;

import java.util.Scanner;

public class SavePatients {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int size = scn.nextInt();

		int[] vaccines = new int[size];
		int[] patients = new int[size];

		for(int i=0;i<vaccines.length;i++) {
			vaccines[i]=scn.nextInt();
		}

		for(int i=0;i<vaccines.length;i++) {
			patients[i]=scn.nextInt();
		}
		
		sortArray(vaccines);
		sortArray(patients);
		
		WillPatientBeSaved(vaccines,patients);
		
	}

	private static void WillPatientBeSaved(int[] vaccines, int[] patients) {
		
		for(int i=0;i<vaccines.length;i++) {
			if(vaccines[i]<patients[i]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	private static void sortArray(int[] array) {

		int n = array.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {

				if (array[j] > array[j + 1]) {
					// swap
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}

			}
		}

	}

}
