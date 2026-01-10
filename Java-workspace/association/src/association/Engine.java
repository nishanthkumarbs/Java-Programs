package association;

public class Engine {
	int cc;
	float mileage;
	public void displayEngineInfo() {
		System.out.println("CC = "+this.cc+" Mileage = "+this.mileage);
		
	}
	public Engine(int cc,float mileage) {
		this.cc = cc;
		this.mileage = mileage;
		
	}

}
