package codingchallenge;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nGetInputValue = 0;
		int nGetValue = 0;
		int nModifiedValue = 0;
		int nReverseNumber = 0;

		System.out.println("Enter the Value:");
		Scanner sc = new Scanner(System.in);
		nGetInputValue = sc.nextInt();
		nGetValue = nGetInputValue;

		while(nGetValue != 0 )
		{
			nModifiedValue = nGetValue % 10;
			nReverseNumber = (nReverseNumber * 10) + nModifiedValue;
			nGetValue = nGetValue / 10;
		}

		if(nGetInputValue == nReverseNumber)
			System.out.println(nGetInputValue+" number is Palidrome");
		else
			System.out.println(nGetInputValue+" number is not Palidrome");

		sc.close();
	}

}
