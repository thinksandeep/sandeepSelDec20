package week1.day1;

public class LearningConditionalStatement {
	public static void main(String[] args) {
	/*	Program :1
	 steps for else if checking for only one condition
		int age = 14;
		
		//check weather minor or major. 
		//minor if age < 18
		//major if age > 18
		//how to check. hint use if condition to compare the value
		
		if (age > 18)	{
			System.out.println("person is not minor");
		System.out.println("person is eligible to vote");
		} else {
			System.out.println("person is minor");
		}
		*/
		
	/* Program 2: 
	 * steps to verify multiple if conditions.
		 if age is minor, adult, senior or super senior
		 in effective way as multiple if conditions  are required
	
		int age = 89;
		
		if (age < 18)	{
			System.out.println("person is  minor");
		System.out.println("person is not eligible to vote");
		}
		
		if (age >=18 && age < 60) {
		System.out.println("person is  adult");
		}
		
			if (age >=60 && age < 80) {
		System.out.println("person is  senior citizen");
		}
		
		if (age >=80) {
		System.out.println("person is  super senior citizen");
		}
	
		*/
		
		/* Program 3: checking for multiple if conditions*/
		
	int age = 59;
		
		if (age < 18)	{
			System.out.println("person is  minor");
		System.out.println("person is not eligible to vote");
		} else if (age >=18 && age < 60) {
		System.out.println("person is  adult");
		}
		
		else if (age >=60 && age < 80) {
		System.out.println("person is  senior citizen");
		}
		
		else {
		System.out.println("person is  super senior citizen");
		}	
		}
	}

