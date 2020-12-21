package week1.day1;

public class AssignmentPrimeNum {

	public static void main(String[] args) {
		
		
		// prime number. divisible by 1  and its number only
		
		int input = 130;
		int count =0;
		
	//	boolean b = false;
		
		for (int i=1;i<=13;i++) {
			if 	(input % i == 0)
			
			{
				count = count + 1;
				}
		}		
		
		if (count == 2) {
			System.out.println("prime");
		}
		else {
			System.out.println("non prime");
		}

	}

}
