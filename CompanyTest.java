import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CompanyTest {
    private Company company;

    @BeforeEach
    void setup() {
        company = TestFixtures.companyWith( // We use a helper method that creates the 3 idle vehicles to get more focused error declarations.
            new Taxi(), new Taxi(), new Shuttle()
        );
    }

    @Test
    void schedulesVehicleWhenAvailable() {
        Passenger p = Fixtures.singleSeatPassenger();
        assertTrue(company.schedulePickup(p));
        assertEquals(2, company.getIdleVehicleCount());
    }

    @Test
    void recordsLostFareWhenNoVehicle() {
        Passenger p = Fixtures.TimeGroupPassenger(8); // seats needs to be more than fleet size
        assertFalse(company.schedulePickup(p));
        assertEquals(1, company.getLostFareCount());
    }
}
