package Logic;

import Model.Boat;
import Model.Car;
import Model.Garage;
import Model.Plane;

public class Runner {

	public static void main(String[] args) {
		Car car1 = new Car("Blue", 10, 5, true, 4);
		Car car2 = new Car("Green", 2, 2, false, 4);
		Boat boat1 = new Boat("Red", 50, 2, 2, 0);
		Plane plane1 = new Plane("White", 5, 4, 3, 500);
		Garage g = new Garage();

		g.getVehicleList().add(car1);
		g.getVehicleList().add(boat1);
		g.getVehicleList().add(plane1);

		g.addVehicle(car2);
		g.addVehicle(boat1);
		g.getTotalCost();

		System.out.println(g.getVehicleList());

		// g.getTotalCost2();
		g.removeVehicle(1);
		System.out.println(g.getVehicleList());
		System.out.println(g.searchByVehicleId(4));

	}

}
