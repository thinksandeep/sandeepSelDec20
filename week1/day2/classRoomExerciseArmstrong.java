package week1.day2;

public class classRoomExerciseArmstrong {

	public static void main(String[] args) {

		/*
		int input = 153;
		
		int originalInput = input;
		
		int sum =0;
				//int calculated;
				int reminder;
				//int original;
				
				while (input > 0) {
					
					reminder = input % 10;//153 % 10 reminder as 3
					
					//sum =0 +27
					
					sum = sum + (reminder*reminder*reminder);
							
							//change the number from 153 to 15
							
							input = input/10;
					
				}
					
					if (sum == originalInput) 
					
					{
						System.out.println("armstrong");
					} 
					
					else
					
					{
						System.out.println("non armstrong");
					}			
				*/
		
		int x = 153;
		int originalValue = 153;
		int count = 0;
		
		while (x > 0) {
			
			int a = x%10;
			
			count = count + (a*a*a);
			
			x=x/10;
		}
		
		if (count == originalValue) {
		
		System.out.println( " armstrong");
				} else {
					System.out.println("not an armstrong");
				}
	}
}

