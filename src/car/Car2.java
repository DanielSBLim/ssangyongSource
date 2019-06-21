package car;

public class Car2 extends Engin {
	
	public Car2(String owner) {
		super(owner);
	}

	@Override
	public String explain() {
		return "car2";
	}

	public int avgSpeed() {
		return 120;

	}

	public int norSpeed() {
		return 220;

	}
}

