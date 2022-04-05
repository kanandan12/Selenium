package codingchallenge;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nGetInputValue = 0;
		int nGetValue = 0;
		int nModifiedValue = 0;
		int nReverseNumberValue = 0;

		System.out.println("Enter the Value: ");
		Scanner sc = new Scanner(System.in);
		nGetInputValue = sc.nextInt();
		nGetValue = nGetInputValue;

		while(nGetValue != 0)
		{
			nModifiedValue = nGetValue % 10;
			nReverseNumberValue = (nReverseNumberValue * 10) + nModifiedValue;
			nGetValue = nGetValue / 10;
		}

		System.out.println("The Get Input Vaue is: " +nGetInputValue +" Reverse value is: " +nReverseNumberValue);
		sc.close();
	}
	
}
