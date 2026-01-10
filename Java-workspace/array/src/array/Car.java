package array;

public class Car {
	String model;
	String color;
	double price;
	
	public void displayCarInfo() {
		System.out.println("Model = "+this.model+" Color = "+this.color+" Price = "+this.price);
	}
	public Car(String model,String color,double price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}
	public static void main(String[] args) {
		Car c1 = new Car("Benz", "Black", 10000000);
		Car c2 = new Car("BMW", "Brown", 9000000);
		Car c3 = new Car("Audi", "Red", 8000000);
		
		Car[] x = {c1,c2,c3};
		for (int i = 0; i < x.length; i++) {
			x[i].displayCarInfo();

		}
	}
}