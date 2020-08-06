package HackerEarth.BubbleSort;

import java.util.Scanner;

public class TheBestPlayer {

	public static class fan{
		String name;
		int quotient;
		
		public fan() {
			this.name = name;
			this.quotient = quotient;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int nof = scn.nextInt();
		int nMeet = scn.nextInt();
		
		fan[] fans = new fan[nof];
		
		for(int i=0;i<fans.length;i++) {
			fan f = new fan();
			f.name = scn.next();
			f.quotient = scn.nextInt();
			fans[i] = f;
		}
		
		sortArray(fans);
		
		for(int i=0;i<nMeet;i++) {
			System.out.println(fans[fans.length-1-i].name);
		}
		
	}

	private static void sortArray(fan[] fans) {
		
		for(int i=0;i<fans.length-1;i++) {
			for(int j=i;j<fans.length-i-1;j++) {
				
				if(fans[j].quotient>fans[j+1].quotient) {
					
					//swap
					fan temp = fans[j];
					fans[j]=fans[j+1];
					fans[j+1]=temp;
				}else if(fans[j].name.compareTo(fans[j+1].name)<0){

					//swap
					fan temp = fans[j];
					fans[j]=fans[j+1];
					fans[j+1]=temp;
				}
				
			}
		}	
	}
	
}
