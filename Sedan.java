
public class Sedan extends Car {

	enum Drivetrain_2WD{
		FWD, RWD;
	}
	
	public Drivetrain_2WD type;
	
	public Sedan() {
		this.topSpeed = 0;
		this.MPG = 0;
		this.acceleration = 0;
		type = Drivetrain_2WD.FWD;
	}
	
	public Sedan(int topSpeed, int MPG, int acceleration, Drivetrain_2WD type) {
		super(topSpeed, MPG, acceleration);
		this.type = type;
	}
	@Override
	public void printInformation() {
		super.printInformation();
		if (type != null)
			System.out.println(type == Drivetrain_2WD.FWD ? "Front wheel drive" : "Rear wheel drive");
	}

}
