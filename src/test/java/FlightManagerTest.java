import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager1;
    private FlightManager flightManager2;
    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;
    private Plane plane;

    @Before
    public void before(){
        passenger1 = new Passenger("Slick", 1, 1);
        passenger2 = new Passenger("Franco", 2, 2);
        passenger3 = new Passenger("Barbara", 3, 3);
        passenger4 = new Passenger("Gwen", 1, 4);
        passenger5 = new Passenger("Dolly", 1, 5);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "EZ234", "New Orleans",
                "Glasgow", "9am");
        flightManager1 = new FlightManager(plane, passenger1, flight);
        flightManager2 = new FlightManager(plane, passenger2, flight);
    }

    @Test
    public void canCheckBagWeightAllowance(){
        int total = flightManager1.bagWeightPerPassenger();
        assertEquals(12, total, 0.0);
    }

    @Test
    public void canGetBagWeightPerPassenger_1(){
        int total = flightManager1.getBagWeight();
        assertEquals(12, total, 0.0);
    }

    @Test
    public void canGetBagWeightPerPassenger_2(){
        int total = flightManager2.getBagWeight();
        assertEquals(24, total, 0.0);
    }

    @Test
    public void canGetRemainingHoldWeight_1(){
        flightManager1.getBagWeight();
        assertEquals(48, flightManager1.getRemainingHoldWeight());
    }

    @Test
    public void canGetRemainingHoldWeight_2(){
        flightManager2.getBagWeight();
        assertEquals(36, flightManager2.getRemainingHoldWeight());
    }

}
