package codingchallenge;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		int toFindFactorial = scan.nextInt();
		if(toFindFactorial==0)
		{
			System.out.println("The factorial of "+ toFindFactorial + " is 1");
		}
		else if(toFindFactorial>0)
		{
			int factorialNumber = 1;
			for (int i=1;i<=toFindFactorial;i++)
			{
				factorialNumber = factorialNumber*i;
			}
			System.out.println("The factorial of "+ toFindFactorial + " is " +factorialNumber);
		}
		
		else
		{
				System.out.println("Enter positive numbers only");
		}
		scan.close();
		
	}

}
