package HackerEarth.BubbleSort;

import java.util.Scanner;

public class PizzaConfusion {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int size = scn.nextInt();

		String[] restro = new String[size];
		int[] scores = new int[size];
		
		int max  = Integer.MIN_VALUE;
		int idx = -1;
		
		for(int i=0;i<size;i++) {
			restro[i]=scn.next();
			scores[i]=scn.nextInt();
			if(scores[i]>max) {
				max = scores[i];
				idx=i;
			}else if(scores[i]==max) {
				//sort lexicographically
				int curr = i;
				int prev = idx;
				if (restro[prev].compareTo(restro[curr]) > 0) {
					idx=curr;
                }
			}
		}

		System.out.println(restro[idx]);
	}
}
