package practice;

public class Car {
	private double fuelCost;
	private double fuelAmount;
	
	public Car(double fuelCost, double fuelAmount) {
        // 燃費（Km/L）
		this.fuelCost = fuelCost;
        // 燃料の残量（L）
		this.fuelAmount = fuelAmount;
	}
	
	public void move(int distance) {
		System.out.println(distance + " km 走ります");
		fuelAmount = fuelAmount - (distance / fuelCost) ;
	}
	
	public double getFuelAmount() {
		return fuelAmount;
	}

}
