package week1.day1;

public class LearnLooping {

	public static void main(String[] args) {
		//learn about for loop// want to print 1 to 5
		
		//normal way:program 1
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		*/
		// using for loop: Program 2
		
		// 3 parts in for loop. 1. initialising, 2. condition 3. increment or decrement
		
		//for (int i = 1; i <= 5; i++ ) //print 1 to5
		//for (int i = 1; i <= 100; i++ ) //print 1 to 100
		//for (int i = 5; i >0 ; i-- ) //print 5 to 1
			/*
		{
			System.out.println(i);
		
		}
		*/
		
		// program 3 :
		
		/*
		for (int i = 1; i <= 100; i++ ) //print even numbers 	.Put the if condition inside for loop.
		{
			if (i % 2 == 0) {
			System.out.println(i);
			}
		}
		*/
		
		// program 4: 	// print odd numbers
		
		for (int i = 1; i <= 100; i++ )
			
		{
		if (i % 2 != 0) 
		
		{
		System.out.println(i);
		}
		
		}
		}
		

	}

