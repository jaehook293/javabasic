package polymorphism.parameter;

public class DriverExam {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle vehicle = new Vehicle();
		
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(vehicle);

	}

}
