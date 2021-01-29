import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight (Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = new Plane(PlaneType.BOEING747);
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


    public int getPassengerCount() {
        return passengers.size();
    }

    public String getFlightNumber(){
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void addPassenger(Passenger passenger) {
        if (getPassengerCount() < plane.getPlaneCapacity()) {
            passengers.add(passenger);
        }
    }

    public int countRemainingSeats() {
      int freeSeats = plane.getPlaneCapacity() - getPassengerCount();
      return freeSeats;
    }



}
