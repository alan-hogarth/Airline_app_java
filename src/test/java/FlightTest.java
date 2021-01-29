import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Plane plane;

    @Before
    public void before(){
        passenger1 = new Passenger("Slick", 1);
        passenger2 = new Passenger("Franco", 2);
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
        assertEquals(1, flight.getPassengerCount());
    }
}
