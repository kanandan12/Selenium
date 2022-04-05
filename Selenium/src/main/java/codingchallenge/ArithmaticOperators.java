package codingchallenge;

public class ArithmaticOperators {

	static int nValue1 = 0;
    static int nValue2 = 0;
    static int nSumValue = 0;
            
    public static void main (String[] args) {
    	
    	// TODO Auto-generated method stub
        System.out.println("Addition Method");
        nValue1 = 20;
        nValue2 = 30;
        AddCondition(nValue1, nValue2);
        
        System.out.println("Subtraction Method");
        nValue1 = 50;
        nValue2 = 30;
        SubCondition(nValue1, nValue2);
        
        System.out.println("Multiplication Method");
        nValue1 = 20;
        nValue2 = 20;
        MultiplyCondition(nValue1, nValue2);
        
        System.out.println("Division Method");
        nValue1 = 10;
        nValue2 = 2;
        DivisionCondition(nValue1, nValue2);
        
        System.out.println("Modula Division Method");
        nValue1 = 22;
        nValue2 = 3;
        ModuloDivisionCondition(nValue1, nValue2);
        
        System.out.println("\n" + "\n");
        System.out.println("Reverse Number Method");
        int nInputValue = 1234;
        ReverseNumber(nInputValue);
        
        System.out.println("\n" + "\n");
        System.out.println("Palindrome Method");
        nInputValue = 123456;
        Palindrome(nInputValue);
    }
    
    // Additional Method
    public static void AddCondition(int nValue1, int nValue2)
    {
        nSumValue = nValue1 + nValue2;
        System.out.println("Additional Value is: " +nSumValue);
    }
    
     // Suntraction Method
    public static void SubCondition(int nValue1, int nValue2)
    {
        nSumValue = nValue1 - nValue2;
        System.out.println("Subtraction Value is: " +nSumValue);
    }
    
    // Multiply Method
    public static void MultiplyCondition(int nValue1, int nValue2)
    {
        nSumValue = nValue1 * nValue2;
        System.out.println("Multiplication Value is: " +nSumValue);
    }
    
    // Division Method
    public static void DivisionCondition(int nValue1, int nValue2)
    {
        nSumValue = nValue1 / nValue2;
        System.out.println("Division Value: " +nSumValue);
    }
    
     // Modulo Division Method
    public static void ModuloDivisionCondition(int nValue1, int nValue2)
    {
        nSumValue = nValue1 % nValue2;
        System.out.println("Division Remainder Value: " +nSumValue);
    }
    
    // Reverse Numer Method
    public static void ReverseNumber(int nInputValue)
    {
    	int nGetValue = 0;
		int nRemainderValue = 0;
		int nReverseValue = 0;

		nGetValue = nInputValue;

		while(nGetValue != 0)
		{
			nRemainderValue = nGetValue % 10;
			nReverseValue = (nReverseValue * 10) + nRemainderValue;
			nGetValue = nGetValue / 10;
    	}
		System.out.println("The Reverse value of " +nInputValue +" Number is:" +nReverseValue);
	}
	
	// Palindrome Value Method
	public static void Palindrome(int nInputValue)
	{
		int nGetValue = 0;
		int nRemainderValue = 0;
		int nReverseValue = 0;

		nGetValue = nInputValue;

		while(nGetValue != 0)
		{
			nRemainderValue = nGetValue % 10;
			nReverseValue = (nReverseValue * 10) + nRemainderValue;
			nGetValue = nGetValue / 10;
		}
		
		if(nInputValue == nReverseValue)
    		System.out.println(nInputValue + " number is Palidrome");
		else
		    System.out.println(nInputValue + " number is not Palidrome");
	}

}
