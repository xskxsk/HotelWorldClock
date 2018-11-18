package HotelWorldClockSystem;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class HotelWorldClockSystemTest {
	private HotelWorldClockSystem hotelWorldClockSystem;
	private PhoneClock phoneClock;
	
	@Before
	public void initialize() {
		System.out.println("Before!");
		hotelWorldClockSystem = new HotelWorldClockSystem();
		phoneClock = new PhoneClock(8);
	}
	
	@org.junit.After
	public void After() {
		System.out.println("After!");
	}
	
	@Test
	public void the_time_of_phoneClock_should_be_set_correctly() {
		phoneClock.setTime(3);
		assertEquals(3, phoneClock.getTime());
	}
	
	@Test
	public void the_time_of_London_should_be_1_after_the_time_of_phoneClock_is_set_to_9() {
		 // Arrange
		CityClock LondonClock = new CityClock(0);
		hotelWorldClockSystem.addCityClocks(LondonClock);
		
		//Act
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setTime(9);
		
		//Assert
		assertEquals(1, LondonClock.getTime());
	}
	
	@Test
	public void the_time_of_Moscow_should_be_5_after_the_time_of_phoneClock_is_set_to_9() {
		 // Arrange
		CityClock MoscowClock = new CityClock(4);
		hotelWorldClockSystem.addCityClocks(MoscowClock);
		
		//Act
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setTime(9);
		
		//Assert
		assertEquals(5, MoscowClock.getTime());
	}
	
	@Test
	public void the_time_of_Sydney_should_be_11_after_the_time_of_phoneClock_is_set_to_9() {
		 // Arrange
		CityClock SydneyClock = new CityClock(10);
		hotelWorldClockSystem.addCityClocks(SydneyClock);
		
		//Act
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setTime(9);
		
		//Assert
		assertEquals(11, SydneyClock.getTime());
	}
	
	@Test
	public void the_time_of_NewYork_should_be_20_after_the_time_of_phoneClock_is_set_to_9() {
		 // Arrange
		CityClock NewYorkClock = new CityClock(-5);
		hotelWorldClockSystem.addCityClocks(NewYorkClock);
		
		//Act
		phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
		phoneClock.setTime(9);
		
		//Assert
		assertEquals(20, NewYorkClock.getTime());
	}

}
