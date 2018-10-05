package HotelWorldClockSystem;

import java.util.ArrayList;

public class HotelWorldClockSystem {
	private ArrayList<CityClock> cityClocks = new ArrayList<CityClock>();
	
	public void addCityClocks(CityClock cityClock) {
		cityClocks.add(cityClock);
	}
	
	public ArrayList<CityClock> getCityClocks() {
		return cityClocks;
	}
	
}
