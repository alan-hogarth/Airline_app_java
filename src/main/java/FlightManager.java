import java.util.ArrayList;

public class FlightManager {

    private Passenger passenger;
    private Plane plane;
    private Flight flight;

    public FlightManager(Plane plane, Passenger passenger, Flight flight){
        this.flight = flight;
        this.passenger = passenger;
        this.plane = new Plane(PlaneType.BOEING747);

    }

    public int bagWeightPerPassenger() {
        int totalBagAllowance = plane.getPlaneWeight() / 2;
        int singleBagAllowance = totalBagAllowance / plane.getPlaneCapacity();
        return singleBagAllowance;
    }

    public int getBagWeight(){
        return passenger.getBags() * bagWeightPerPassenger();
    }

    public int getRemainingHoldWeight() {
        int totalBagAllowance = plane.getPlaneWeight() / 2;
        return totalBagAllowance - getBagWeight();
    }

    public ArrayList<Passenger> sortPassengersBySeatNumber() {

        ArrayList<Passenger> passengers = flight.getPassengers();

        int numOfPassengers = passengers.size();

        for (int i = 0; i < numOfPassengers; i++){
            int maxIter = numOfPassengers - i - 1;
            for (int j = 0; j < maxIter; j++) {
                Passenger next = passengers.get(j + 1);
                Passenger current = passengers.get(j);
                if (current.getSeatNo() > next.getSeatNo()) {
                    passengers.set(j, next);
                    passengers.set(j+ 1, current);
                }
            }
        }
        return passengers;
    }


}
