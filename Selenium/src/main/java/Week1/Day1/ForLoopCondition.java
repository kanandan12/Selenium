package Week1.Day1;

// ForLoopCondition Program
class ForLoopCondition
{
	public static void main(String[] args)
	{
		for ( int nValue = 0; nValue <= 100; nValue++)
		{
			// nvalue is divisible by 5 
			if (nValue%5 == 0)
				System.out.println("For Loop Condition Values are:" + nValue);
			
		}
	}
}
