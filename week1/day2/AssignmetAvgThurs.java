package week1.day2;

public class AssignmetAvgThurs {

	public static void main(String[] args) {
	
		//int [] numbers 	 = new int [] {20, 30, 40, 16, 10, 100};
		
		int[] num = {1,2,3,4,56};
		int sum =  0;
		
		for (int i = 0; i < num.length; i++) {
			
			sum = sum+num[i];
		}
		
		double avg = (float)sum/(num.length);
		
		System.out.println(avg);
		
		


	}

}
