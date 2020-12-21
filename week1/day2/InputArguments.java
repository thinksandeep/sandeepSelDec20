package week1.day2;

public class InputArguments {
	
	private String empName(int empId) {
		
		String name;
		
		if (empId == 100) {
			
			name = "test";
		}
		else {
			
			name = "not applicable";
		}
		
		//System.out.println(name);
		return name;

	}

	public static void main(String[] args) {
		
		InputArguments obj = new InputArguments();
		
		String empName = obj.empName(100);
		System.out.println(empName);
	}

}
