package Model;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public ArrayList<Vehicle> addVehicle(Vehicle newVehicle) {
		vehicleList.add(newVehicle);
		return vehicleList;
	}

	public void getTotalCost() {
		for (Vehicle v : getVehicleList()) {
			if (v.getClass().getCanonicalName().equals("Model.Car")) {
				System.out.println(((Car) v).getCost());
			}
			if (v.getClass().getCanonicalName().equals("Model.Boat")) {
				System.out.println(((Boat) v).getCost());
			}
			if (v.getClass().getCanonicalName().equals("Model.Plane")) {
				System.out.println(((Plane) v).getCost());
			}

			System.out.println(v.getClass().getSimpleName());
		}

	}

	public double getTotalCost2() {
		double total = 0;
		for (Vehicle v : getVehicleList()) {
			if (v instanceof Car) {
				double cost = ((Car) v).getCost();
				System.out.println(cost);
				total += cost;
			}
			if (v instanceof Boat) {
				double cost = ((Boat) v).getCost();
				System.out.println(cost);
				total += cost;
			}
			if (v instanceof Plane) {
				double cost = ((Plane) v).getCost();
				System.out.println(cost);
				total += cost;
			}
		}
		System.out.println(total);
		return total;
	}
	// public Vehicle searchVehicleId(int id) {
	// for(int v=0; v<=vehicleList.size(); v++) {
	// if(id == vehicleList.get(v).getId()) {
	// return vehicleList.get(v);
	//
	// }
	// }
	//
	//
	// }

	public Vehicle searchByVehicleId(int id) {
		return vehicleList.stream().filter(v -> id == v.getId()).findFirst().get();
	}

	public void removeVehicle(int id) {
		vehicleList.remove(searchByVehicleId(id));
	}

}