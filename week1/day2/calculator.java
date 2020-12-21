package week1.day2;

public class calculator {
	
	public int addCalc() {
		int num1 = 5;
		int num2 = 10;
		int num3 = 15;
		int total;
		
		total = num1+num2+num3;
		System.out.println(total);
	}
	
	private void subCalc() {
		int num1 = 5;
		int num2 = 10;
		int num3 = 25;
		int total;
		total = num3-num2-num1;
		System.out.println(total);
	}
	
	private void mulCalc() {
		double num1 = 5;
		double num2 = 10;
		double num3 = 25;
		double total;
		total = num3*num2*num1;
		System.out.println(total);
	}

	private void divCalc() {
		float num1 = 15;
		float num2 = 10;
		float total;
		total = num1/num2;
		System.out.println(total);
	}
	
	
	public static void main(String[] args) {
		
		calculator ac = new calculator();
		
		ac.addCalc();
		ac.subCalc();
		ac.mulCalc();
		ac.divCalc();
		
	}

}
