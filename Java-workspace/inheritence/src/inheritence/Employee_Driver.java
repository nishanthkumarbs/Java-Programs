package inheritence;

public class Employee_Driver {
	
	public static void main(String[] args) {
		Developer_c e1 = new Developer_c("Disha",111,500000);
		Tester_c e2 = new Tester_c("Thamanna", 222, 400000);
		HR_c e3 = new HR_c("Katrina", 333, 600000);
		e1.displayEmployeeinfo();
		e2.displayEmployeeinfo();
		e3.displayEmployeeinfo();
	}

}
