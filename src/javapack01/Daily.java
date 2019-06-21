package javapack01;

public class Daily extends Employee {
	
	protected int workday;
	
	protected int dailypay;
	protected Daily(String no, String name, String unitday, int workday, int dailypay) {
		super.no = no;
		super.name = name;
		super.unitday = unitday;
		this.workday = workday;
		this.dailypay = dailypay;
	}
	public Daily() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int paycheck() {
		return workday * dailypay;
	}
	
	
}
