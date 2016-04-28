package com.ahalogy.components;

class Fibonacci {
	
	void generateSequence(int numInSequence)
	{
		int firstElement = 0, secondElement = 1, nextElement = 0;
		  
		System.out.printf("First %d terms of Fibonacci series are :-\n", new Object[] {Integer.valueOf(numInSequence)});
		 
		for (int i = 1; i <= numInSequence + 2; i++) {
			nextElement = firstElement + secondElement;
			
			firstElement = secondElement;
			secondElement = nextElement;
		
			if (i <= numInSequence)
				System.out.println(nextElement);
		}
		
		System.out.println("Series sum by calculation = " + (nextElement - 2)); // reduced by an additional 1 to take F0 = 0 into account
	}
	
	int generateSum()
	{
		return 0;
	}
	
}
