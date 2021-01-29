import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightManagerTest {

//    Assumptions:
//
//    Each passenger bag weighs the same
//    Planes reserve half of their total weight for passenger bags
//    The weight of bag per person is the weight reserved for passenger bags divided by the capacity
//    60/5 = 12

//    Create a FlightManager class which has methods to:
//
//    calculate how much baggage weight should be reserved for each passenger for a flight
//    calculate how much baggage weight is booked by passengers of a flight
//    calculate how much overall weight reserved for baggage remains for a flight

    private FlightManager flightManager;
    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;
    private Plane plane;

    @Before
    public void before(){
        passenger1 = new Passenger("Slick", 1);
        passenger2 = new Passenger("Franco", 2);
        passenger3 = new Passenger("Barbara", 3);
        passenger4 = new Passenger("Gwen", 1);
        passenger5 = new Passenger("Dolly", 1);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "EZ234", "New Orleans",
                "Glasgow", "9am");
        flightManager = new FlightManager(plane, passenger1, flight);
    }

    @Test
    public void canCheckBagWeightAllowance(){
        int total = flightManager.bagWeightPerPassenger();
        assertEquals(12, total, 0.0);
    }

    @Test
    public void canGetBagWeightPerPassenger(){
        int total = flightManager.getBagWeight();
        assertEquals(12, total, 0.0);
    }
    
}
