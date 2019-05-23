package Model;

public class Car extends Vehicle {
	private boolean frontWheelDrive;
	private int doorNumber;

	public Car(String colour, int carAge, int seatNumber, boolean steeringType, int doorNumber) {
		super(colour, carAge, seatNumber);
		this.frontWheelDrive = steeringType;
		this.doorNumber = doorNumber;
	}

	public boolean isSteeringType() {
		return frontWheelDrive;
	}

	public void setSteeringType(boolean steeringType) {
		this.frontWheelDrive = steeringType;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public double getCost() {
		double cost = this.doorNumber * 100 + this.getVehicleCost();
		return cost;
	}

}
