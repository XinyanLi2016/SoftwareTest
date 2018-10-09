package tbc.tdd.hotelworldclocks;

/**
 * @author Kenking
 */
public class PhoneClock extends BaseClock {
    private HotelWorldClockSystem hotelWorldClockSystem;
    private int time;

    public PhoneClock(int utcOffset) {
            super.utcOffset = utcOffset;
    }

    public void setTime(int time) {
        this.time = time;
        if (this.hotelWorldClockSystem == null) {
			return;
		}
        for (CityClock cityClock : this.hotelWorldClockSystem.getClocks()) {
            cityClock.setUtcZeroTime(time - super.utcOffset);
        }
    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }

    @Override
    public int getTime() {
        return this.time;
    }
}
