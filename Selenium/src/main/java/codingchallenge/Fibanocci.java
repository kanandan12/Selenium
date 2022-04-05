package codingchallenge;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1=0, num2=0,temp=1;
		System.out.println("Enter the input : ");
		int numOfSeries = scan.nextInt();
		if(numOfSeries>0)
		{
		    for(int i = 1; i <= numOfSeries; i++)
	        {
	            num1 = num2;
	            num2 = temp;
	            temp = num1 + num2;
	            System.out.print(num1+" ");
	        }
		    
		}
		else
		{
			System.out.println("Enter valid number");
		}
		scan.close();


	}

}
