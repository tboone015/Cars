
public class Driver {

	public static void main(String[] args) {
		// Declare array of cars
		Car [] cars = new Car[3];
		
		cars[0] = new Car();
		cars[1] = new Sedan(120, 60, 5, Sedan.Drivetrain_2WD.RWD);
		cars[2] = new SUV(100, 50, 4, true);
		
		// Output results
		for (Car c: cars) {
			c.printInformation();
		}

	}
}
