package testData;

import java.util.ArrayList;
import java.util.List;

import repository.AddPlace;
import repository.Location;

public class AddPlaceData {
	
	public  AddPlace addPlacePayload() {
		AddPlace addPlace = new AddPlace();
		addPlace.setAccuracy(12);
		addPlace.setAddress("Sushila Downtown");
		addPlace.setLanguage("Bhojpuri");
		addPlace.setName("Chotu");
		addPlace.setPhoneNumber("+(91)9876543210");
		addPlace.setWebsite("https://www.facebook.com");
		
		List<String> al = new ArrayList<String>();
		al.add("Honey");
		al.add("Bunny");
		al.add("Ricky");
		
		addPlace.setType(al);
		
		Location location = new Location();
		location.setLatitude(24.45677654);
		location.setLongitude(23.7654332);
		
		addPlace.setLocation(location);
		
		return addPlace;
	}

}
