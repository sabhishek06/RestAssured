package utilities;

public enum Endpoints {

	addPlaceAPI("/maps/api/place/add/json");

	private String endPoints;

	Endpoints(String endpoints) {
		this.endPoints = endpoints;
	}

	public String getEndPoints() {
		return endPoints;
	}
}
