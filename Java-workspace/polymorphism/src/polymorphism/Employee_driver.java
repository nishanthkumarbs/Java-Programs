package polymorphism; 

public class Employee_driver {
	
	public static void main(String[] args) {
		Employee e1 = new Developer("Nishanth", 140204, 500000);
		Employee e2 = new Tester("Shreyas", 520896, 300000);
		Employee e3 = new Hr("Disha", 741085, 200000);
		
		Employee[] ob = {e1,e2,e3};
		for(int i = 0; i < 3; i++) {
			ob[i].displayEmployeeInfo();
			ob[i].work();
			System.out.println("--------------------------");
		}
		
	}
}
