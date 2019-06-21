package classes;

public class StudentDTO {
	String num;
	String name;
	
	StudentDTO(String num, String name){
		super();
		this.name = name;
		this.num = num;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
