import java.util.ArrayList;
import java.util.List;

public class Flight {
    private List<Pilot> pilots;
    private List<CabinCrewMember> cabinCrewMembers;
    private List<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(List<Pilot> pilots, List<CabinCrewMember> cabinCrewMembers, Plane plane,
                  String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = pilots;
        this.cabinCrewMembers = cabinCrewMembers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.bookedPassengers = new ArrayList<>();
    }

    public int getAvailableSeats() {
        return plane.getCapacity() - bookedPassengers.size();
    }

    public boolean bookPassenger(Passenger passenger) {
        if (getAvailableSeats() > 0) {
            bookedPassengers.add(passenger);
            return true;
        } else {
            return false;
        }
    }
}