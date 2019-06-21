package classes;

public class SpSc {

	private String vPrivate = "Private MV 접근확인";
	String vDefault = "Private MV 접근확인";
	protected String vProtecred = "Protected MV 접근확인";
	public String vPublic = "Public MV 접근확인";
	
	private void mPrivate() {
		System.out.println("Private MM 접근확인");
	}
	void mDefault() {
		System.out.println("Private MM 접근확인");
	}
	protected void mProtecred() {
		System.out.println("Protected MM 접근확인");
	}
	public void mPublic() {
		System.out.println("Public MV 접근확인");
	}
	
	
	

}
