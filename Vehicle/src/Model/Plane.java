package Model;

public class Plane extends Vehicle {
	private int wingNumber;
	private int wingSpan;

	public Plane(String colour, int carAge, int seatNumber, int wingNumber, int wingSpan) {
		super(colour, carAge, seatNumber);
		this.wingNumber = wingNumber;
		this.wingSpan = wingSpan;
	}

	public int getWingNumber() {
		return wingNumber;
	}

	public void setWingNumber(int wingNumber) {
		this.wingNumber = wingNumber;
	}

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}

	public double getCost() {
		double cost = this.wingNumber * 50 + this.getVehicleCost();
		return cost;
	}
}
