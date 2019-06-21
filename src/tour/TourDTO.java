package tour;

public class TourDTO {
	
	private String tourCode, city, airplane;
	private int tourtype, maxPersion;

	TourDTO(String getTourCode, String getCity, String getAirplane, int getTourtype, int getMaxPersion) {
		this.tourCode = getTourCode;
		this.city = getCity;
		this.airplane = getAirplane;
		this.tourtype = getTourtype;
		this.maxPersion = getMaxPersion;
	}

	public String getTourCode() {
		return tourCode;
	}

	public void setTourCode(String tourCode) {
		this.tourCode = tourCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAirplane() {
		return airplane;
	}

	public void setAirplane(String airplane) {
		this.airplane = airplane;
	}

	public int getTourtype() {
		return tourtype;
	}

	public void setTourtype(int tourtype) {
		this.tourtype = tourtype;
	}

	public int getMaxPersion() {
		return maxPersion;
	}

	public void setMaxPersion(int maxPersion) {
		this.maxPersion = maxPersion;
	}

}
