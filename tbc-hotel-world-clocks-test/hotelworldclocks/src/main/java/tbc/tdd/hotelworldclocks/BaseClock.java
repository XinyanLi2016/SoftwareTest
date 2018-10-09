package tbc.tdd.hotelworldclocks;
/**
 * @author Kenking
 */
public abstract class BaseClock {

	protected int utcOffset;
    /**
     * return time
     * @return int 
     */
    public abstract int getTime();
}
