import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private String planeType;
    private int capacity;
    private int totalWeight;
    private List<Passenger> bookedPassengers;

    public Plane(String planeType, int capacity, int totalWeight) {
        this.planeType = planeType;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
        this.bookedPassengers = new ArrayList<>();
    }

    public String getPlaneType() {
        return planeType;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public int getAvailableSeats() {
        return capacity - bookedPassengers.size();
    }

    public boolean bookPassenger(Passenger passenger) {
        if (bookedPassengers.size() < capacity) {
            bookedPassengers.add(passenger);
            return true;
        }
        return false;
    }
}