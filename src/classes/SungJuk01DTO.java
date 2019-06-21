package classes;

public class SungJuk01DTO {

	private String vName;
	private int vKor;
	private int vEng;
	private int vMat;
	
	SungJuk01DTO(String vName, int vKor, int vEng, int vMat){
		this.vName = vName;
		this.vKor = vKor;
		this.vEng = vEng;
		this.vMat = vMat;
	}
	
	
	
	public void setnName(String vName) {
		this.vName = vName;
	}
	public void setVKor(int vKor) {
		this.vKor = vKor;
	}
	public void setVEng(int vEng) {
		this.vEng = vEng;
	}
	public void setVMat(int vMat) {
		this.vMat = vMat;
	}
	public String getnName() {
		return vName;
	}
	public int getVKor() {
		return vKor;
	}
	public int getVEng() {
		return vEng;
	}
	public int getVMat() {
		return vMat;
	}

}
