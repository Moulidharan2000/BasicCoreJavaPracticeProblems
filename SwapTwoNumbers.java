package Day5AssignmentProblems;

import java.util.Scanner;

public class SwapTwoNumbers {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Numbers");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("The Numbers Before Swap A = "+a +" B = "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("The Numbers After Swap A = "+a + " B = "+b);
		

	}

}
