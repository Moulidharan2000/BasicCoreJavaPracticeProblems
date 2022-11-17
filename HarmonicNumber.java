package Day5AssignmentProblems;

import java.util.Scanner;

public class HarmonicNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double num=0, result=0, i;
		int n;
		System.out.print("Enter the Harmonic Number : ");
		n = s.nextInt();
		
		for(i=1; i<=n; i++) {
			num = num + (1/i);
			result = num;
		}
		System.out.println("The Value of Harmonic Number "+n+" is "+result);

	}

}
