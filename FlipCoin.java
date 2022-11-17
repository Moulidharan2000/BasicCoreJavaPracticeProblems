package Day5AssignmentProblems;

import java.util.Scanner;

public class FlipCoin {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number of Times to filp the Coin : ");
		int num = s.nextInt();
		int h = 0;
		int t = 0;
		double heads, tails;
		for (int i=0; i<num; i++) {
			double random = Math.random();
			if(random<0.5) {
				t++;
			}
			else {
				h++;
			}
		}
		heads = h / (double)num *100;
		tails = t / (double)num * 100;
		System.out.println("Precentage of Heads : "+ heads +" %");
		System.out.println("Percentage of Tails : "+ tails +" %");

	}

}
