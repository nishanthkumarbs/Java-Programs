package association;

public class Car {
	String model;
	String color;
	double price;
	Engine x;
	
	public void displayCarInfo() {
		System.out.println("Model = "+this.model+" Color = "+this.color+" Price = "+this.price);
	}
	public Car(String model,String color,double price,Engine x) {
		this.model = model;
		this.color = color;
		this.price = price;
		this.x = x;
	}


}
