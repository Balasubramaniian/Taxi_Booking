package TaxiBooking;

import java.util.ArrayList;
import java.util.List;

public class Booking {
	
	public static List<Taxi> createTaxis(int n){
		
		List<Taxi> taxies=new ArrayList<>();
		for(int i=0;i<n;i++) {
			Taxi taxi=new Taxi();
			taxies.add(taxi);
		}
		return taxies;
	}
	
	public static void main(String[] args) {
		List<Taxi> taxis=createTaxis(4);
	}
	

}
