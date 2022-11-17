package Day5AssignmentProblems;

import java.util.Scanner;

public class Factors {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		num = s.nextInt();
		
		for(int i=2; i<num; i++) {
			while(num%i == 0) {
				System.out.println(i);
				num = num/i;
			}
		}
		if(num>2) {
			System.out.println(num);
		}
	}

}
