package com.company;
import java.time.LocalTime;
public class Main {

    public static void main(String[] args) {

    	Museum m = new Museum();
    	m.setOpeningTime(LocalTime.of(9,30));
    	m.setClosingTime(LocalTime.of(18,30));
		m.setTicketPrice(4.50);

		Hotel h = new Hotel();
		h.setRanking(9.2);

		Restaurant r = new Restaurant();
		r.addToMenu("pizza");
		r.addToMenu("lasagna");
		r.displayMenu();
    }


}
