package tbc.tdd.hotelworldclocks;

import java.util.ArrayList;

/**
 * @author Kenking
 */
public class HotelWorldClockSystem {
    private ArrayList<CityClock> cityClocks = new ArrayList<CityClock>();

    public void attach(CityClock cityClock) {
        this.cityClocks.add(cityClock);
    }

    public ArrayList<CityClock> getClocks() {
        return this.cityClocks;
    }
   
}
