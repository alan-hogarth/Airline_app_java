import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PassengerTest {

    private Passenger passenger;
    private Flight flight;

    @Before
    public void before(){
        passenger = new Passenger("Carlos", 1, 1, flight);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Carlos", passenger.getName());
    }

    @Test
    public void passengerHasBag(){

        assertEquals(1, passenger.getBags());
    }

    @Test
    public void canSetBags(){
        assertEquals(1, passenger.setBags(1));
    }

    @Test
    public void canGetSeatNo(){
        assertEquals(1, passenger.getSeatNo());
    }

    @Test
    public void canSetSeatNo(){
        assertEquals(1, passenger.setSeatNo(1));
    }

    @Test
    public void canGetFlight(){
        assertEquals(flight, passenger.getFlight());
    }
}
