import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;
    private Passenger passenger6;
    private Plane plane;

    @Before
    public void before(){
        passenger1 = new Passenger("Slick", 1, 2);
        passenger2 = new Passenger("Franco", 2, 3);
        passenger3 = new Passenger("Barbara", 3, 4);
        passenger4 = new Passenger("Gwen", 1, 5);
        passenger5 = new Passenger("Dolly", 1, 6);
        passenger6 = new Passenger("Molly", 1, 7);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "EZ234", "New Orleans",
                "Glasgow", "9am");
    }
    
    @Test
    public void passengerListStartsAt0(){
        int result = flight.getPassengerCount();
        assertEquals(0, result);
    }


    @Test
    public void hasFlightNumber(){
        assertEquals("EZ234", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("New Orleans", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("Glasgow", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("9am", flight.getDepartureTime());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);
        assertEquals(5, flight.getPassengerCount());

    }

    @Test
    public void canCountSeats() {
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(3, flight.getPassengerCount());
        assertEquals(2, flight.countRemainingSeats());
    }


}
