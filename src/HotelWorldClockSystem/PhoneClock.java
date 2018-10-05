package HotelWorldClockSystem;

public class PhoneClock extends Clock{

	private HotelWorldClockSystem hotelWorldClockSystem;
	
	public PhoneClock(int utcOffSet) {
		super.utcOffSet = utcOffSet;
	}
	
	public void setHotelWorldClockSystem (HotelWorldClockSystem hotelWorldClockSystem) {
		this.hotelWorldClockSystem = hotelWorldClockSystem;
	}
	
	public void setTime(int time) {
		super.utcZeroTime = time - super.utcOffSet;
		if(hotelWorldClockSystem == null) {
			return;
		}
		for (CityClock cityClock : hotelWorldClockSystem.getCityClocks()) {
			cityClock.setutcZeroTime(super.utcZeroTime);
		}
	}
	
	@Override
	public int getTime() {
		// TODO Auto-generated method stub
		return (super.utcOffSet + super.utcZeroTime + 24) % 24;
	}

}
