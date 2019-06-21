package javapack01;

public class Regular extends Employee{
	protected int pay;

	
	@Override
	public int paycheck() {
		return pay;
	}
	
//	Regular(String no, String name, String unitday, int pay) {
//		super.no = no;
//		super.name = name;
//		super.unitday = unitday;
//		this.pay = pay;
//	}
	
	public Regular() {
		// TODO Auto-generated constructor stub
	}
	
	Regular(String no, String name, String unitday, int pay){
		super(no, name, unitday);
		this.pay = pay;
	}
	
	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	


}
