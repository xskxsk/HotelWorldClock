package HotelWorldClockSystem;

public class CityClock extends Clock{

	public CityClock(int utcOffSet) {
		super.utcOffSet = utcOffSet;
	}

	public void setutcZeroTime(int utcZeroTime) {
		super.utcZeroTime = utcZeroTime;
	}
	
	@Override
	public int getTime() {
		return (super.utcOffSet + super.utcZeroTime + 24) % 24;
	}

}
