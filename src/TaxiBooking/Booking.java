package TaxiBooking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		Scanner sc=new Scanner(System.in);
		boolean ans=true;
		int id=1;
		while(ans) {
			System.out.println("1-booking 2-display 3-exit");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				int custid=id;
				System.out.println("Enter the Pickup Point");
				char pickuppoint=sc.next().toUpperCase().charAt(0);
				System.out.println("Enter the Drop Point");
				char droppoint=sc.next().toUpperCase().charAt(0);
				System.out.println("Enter the Pickup time");
				int pickuptime=sc.nextInt();
				
				if(pickuppoint<'A' || droppoint>='F' && pickuppoint>='F' || droppoint<'A') {
					System.out.println("Valid pickup points A to F only");
				}
//				List<Taxi> freeTaxi=getFreeTaxies(taxis,pickuppoint,pickuptime);
			}
			
		}
	}
	

}
