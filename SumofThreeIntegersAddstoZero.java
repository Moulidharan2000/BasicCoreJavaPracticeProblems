package Day5AssignmentProblems;

import java.util.Scanner;

public class SumofThreeIntegersAddstoZero {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = s.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter the Integers : ");
		
		for(int i=0; i<num; i++) {
			arr[i] = s.nextInt();
		}
		
		int distinctcount = 0;
		
		for(int i=0; i<num-2; i++)
		for(int j=i+1; j<num-1; j++)
		for(int k=j+1; k<num; k++)
			
		if((arr[i] + arr[j] + arr[k]) == 0) {
			distinctcount++;
			System.out.println("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");
		}
		System.out.println("Total Distinct Triplets : "+distinctcount);
	}

}
