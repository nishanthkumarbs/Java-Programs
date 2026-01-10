package association;



public class driver {
	public static void main(String[] args) {
		Engine e = new Engine(4000, 8);
		Car c1 = new Car("Benz", "Black", 10000000, e);
		Car c2 = new Car("BMW", "Brown", 9000000, e);
		Car c3 = new Car("Audi", "Red", 8000000, e);
		
		Car[] ob = {c1,c2,c3};
		for (int i = 0; i < 3; i++) {
			ob[i].displayCarInfo();
			ob[i].x.displayEngineInfo();
			System.out.println("----------");
		}
	}

}
