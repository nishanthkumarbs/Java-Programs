package inheritence;

public class Car extends Vehicle {

	public Car(int cc, double mileage) {
		super(cc, mileage);
	}
	public static void main(String[] args) {
		Car c = new Car(6749, 7.1);
		System.out.println(c.cc+"cc, "+c.mileage+"kmpl");
	}

}
