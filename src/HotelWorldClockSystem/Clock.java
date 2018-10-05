package HotelWorldClockSystem;

public abstract class Clock {
	protected int utcOffSet;
	protected int utcZeroTime;
	public abstract int getTime();
}
