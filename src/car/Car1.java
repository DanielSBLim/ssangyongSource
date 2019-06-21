package car;

public class Car1 extends Engin {
	
	Car1(String owner){
		super(owner);
	}

	@Override
	public String explain() {
		return "car1";
	}

	public int avgSpeed() {
		return 80;

	}

	public int norSpeed() {
		return 180;

	}
}
