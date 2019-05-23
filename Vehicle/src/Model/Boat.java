package Model;

public class Boat extends Vehicle {
	private int sailNumber;
	private int oarNumber;

	public Boat(String colour, int carAge, int seatNumber, int sailNumber, int oarNumber) {
		super(colour, carAge, seatNumber);
		this.sailNumber = sailNumber;
		this.oarNumber = oarNumber;
	}

	public int getSailNumber() {
		return sailNumber;
	}

	public void setSailNumber(int sailNumber) {
		this.sailNumber = sailNumber;
	}

	public int getOarNumber() {
		return oarNumber;
	}

	public void setOarNumber(int oarNumber) {
		this.oarNumber = oarNumber;
	}

	public double getCost() {
		double cost = this.oarNumber * 20 + this.getVehicleCost();
		return cost;
	}
}
