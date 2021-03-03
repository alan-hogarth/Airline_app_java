import java.util.*;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private ArrayList<Integer> seatNumbers;



    public Flight (Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = new Plane(PlaneType.BOEING747);
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.seatNumbers = generateSeatNumbers();

    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    private ArrayList<Integer> generateSeatNumbers() {
        ArrayList<Integer> seatNumbers = new ArrayList<>();
        for(int i = 1; i <= this.plane.getPlaneCapacity(); i ++){
            seatNumbers.add(i);
        }
        return seatNumbers;
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
                assignRandomSeatNumber(passenger);
        }
    }

    public int countRemainingSeats() {
      int freeSeats = plane.getPlaneCapacity() - getPassengerCount();
      return freeSeats;
    }

    public void assignRandomSeatNumber(Passenger passenger) {
        Random random = new Random();
        int randomIndex = random.nextInt(this.seatNumbers.size());
        Integer seatNumber = this.seatNumbers.remove(randomIndex);
        passenger.setSeatNo(seatNumber);
    }

    public ArrayList<Integer> getSeatNumbers() {
        return seatNumbers;
    }


}
