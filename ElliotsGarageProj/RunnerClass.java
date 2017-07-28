
public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage g = new Garage();
		Car c = new Car("123EFC", "Peugeot", 2, false);
		Car c1 = new Car("123EFD", "Peugeot", 3, false);
		Car c2 = new Car("123EFE", "Peugeot", 4, false);
		Boat b1 = new Boat("321EDE", "White", 2, 10);
		Tank t1 = new Tank("123", "Russian", 0, 970.5);
		g.addVehicle(c);
		g.addVehicle(c1);
		g.addVehicle(c2);
		g.addVehicle(b1);
		g.addVehicle(t1);
		g.outputGarage();
		g.billVehicles();
		g.emptyGarage();
		g.outputGarage();
	}

}
