package interFace;

public class ClassEx01 implements InterfaceEx01 {
	private int one = 1;
	
	public ClassEx01(int one) {
		this.one = one;
	}

	@Override
	public int one() {
		return one;
	}
	public String hellow() {
		return "good";
	}
}
