package car;

abstract public class Engin {
	private String owner;

	public Engin(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	abstract String explain();

	abstract int avgSpeed();

	abstract int norSpeed();

}



