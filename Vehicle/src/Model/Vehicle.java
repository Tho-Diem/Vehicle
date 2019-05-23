package Model;

abstract public class Vehicle {
	private int id;
	private static int counterId = 1;
	private String colour;
	private int carAge;
	private int seatNumber;

	public Vehicle(String colour, int carAge, int seatNumber) {
		this.colour = colour;
		this.carAge = carAge;
		this.seatNumber = seatNumber;
		this.id = counterId++;

	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getCarAge() {
		return carAge;
	}

	public void setCarAge(int carAge) {
		this.carAge = carAge;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getVehicleCost() {
		double cost = this.seatNumber * 150;
		return cost;
	}

	public String toString() {
		return "vehicle" + id;
	}

}
