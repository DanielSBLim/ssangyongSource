package javapack01;

public class Employee {

	protected String no;
	protected String name;
	protected String unitday;

	Employee() {

	}

	public int paycheck() {
		return -1;
	}
	
	Employee(String no, String name, String unitday) {
		this.no = no;
		this.name = name;
		this.unitday = unitday;
	}
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnitday() {
		return unitday;
	}

	public void setUnitday(String unitday) {
		this.unitday = unitday;
	}




}
