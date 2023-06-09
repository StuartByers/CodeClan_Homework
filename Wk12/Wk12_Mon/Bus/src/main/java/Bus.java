import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public boolean addPassenger(Person person) {
        if (this.passengers.size() < this.capacity) {
            this.passengers.add(person);
            return true;
        }
        return false;
    }

    public boolean removePassenger(Person person) {
        return this.passengers.remove(person);
    }
}
