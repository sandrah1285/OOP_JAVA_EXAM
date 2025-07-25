import java.util.Random;

// Represents the passenger requests i.e. from hotel, company, or tourist organisation
public class PassengerSource {

    private static final Random RNG = new Random();
    private final Company company;

    public PassengerSource(Company company) {
        this.company = company;
    }

    // Requests pickup for new passenger
    public boolean requestPickup() {
        Passenger p = new Passenger(
            randomLocation(), randomLocation(), seatsNeeded()
        );
        return company.schedulePickup(p); // Returns true if vehicle was assigned
    }

    // Generates a random new location with x, y in the range [0, 100]
    private static Location randomLocation() {
        int x = RNG.nextInt(101); // 0 to 100 inclusive
        int y = RNG.nextInt(101);
        return new Location(x, y);
    }

    // Randomly determines number of seats needed
    private static int seatsNeeded() {
        return RNG.nextDouble() < 0.7 ? 1 : 2 + RNG.nextInt(3); 
    }
}
