package TaxiBooking;

import java.util.*;

public class Taxi {
	static int taxicount=0;
	int id;
	boolean Booked;
	char CurrentSpot;
	int freetime;
	int earning;
	List<String> trips;
	public Taxi() {
		Booked=false;
		CurrentSpot='A';
		freetime=6;
		earning=0;
		trips=new ArrayList<>();
		taxicount+=1;
		id=taxicount;
	}
	public void setDetails(boolean Booked,char currentspot,int freetime,int earning,String tripdetils)
	{
		this.Booked=Booked;
		this.CurrentSpot=currentspot;
		this.freetime=freetime;
		this.earning=earning;
		this.trips.add(tripdetils);
		
	}
	public void taxidetails() {
		System.out.println("Taxi-"+this.id+"Total Earning- "+this.earning+"CurrentSpot-"+this.CurrentSpot+"Free time-"+this.freetime);
   }
}
