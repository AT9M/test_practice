package ie.gmit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class PassengerTest {

    private Passenger myPassenger;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry("Testing  "+testInfo.getDisplayName());
         myPassenger = new Passenger("Mr","John","A1B2C3D42020","12345678910",22);
    }
    @DisplayName("Test If constructor is created with valid arg ")
    @Test
    void TestConstructor() {

        assertEquals(22,myPassenger.getAge());
    }

    @DisplayName("Test If constructor is created with wrong arg Age ")
    @Test
    void testWrongConstructor() {

        assertThrows(IllegalArgumentException.class, new Executable(){

            public void execute() throws Throwable {
                Passenger p = new Passenger("Mrff","Jn","A1B242020","1278910",2);
            }
        });
    }

    @DisplayName("Test getTitle ")
    @Test
    void testGetTitle() {
        myPassenger.setTitle("Mrs");
        assertEquals("Mrs",myPassenger.getTitle());
    }

    @DisplayName("Test setTitle ")
    @Test
    void testSetTitle() {

        assertThrows(IllegalArgumentException.class, new Executable(){

            public void execute() throws Throwable {
                Passenger p = new Passenger("Mr","Joon","A1B24rtysrt2020","1278fghdf910",20);
                p.setTitle("hgsdg");
            }
        });
    }

    @DisplayName("Test getID ")
    @Test
    void testGetID() {

        assertEquals("A1B2C3D42020",myPassenger.getID());
    }
    @DisplayName("Test Wrong setID ")
    @Test
    void testWrongID() {

        assertThrows(IllegalArgumentException.class, new Executable(){

            public void execute() throws Throwable {
                Passenger p = new Passenger("Mr","Joon","A1B24rtysrt2020","1278fghdf910",20);
                p.setID("sfdsfsd");
            }
        });
    }
    @DisplayName("Test getName ")
    @Test
    void testGetName() {

        assertEquals("John",myPassenger.getName());
    }
    @DisplayName("Test getPhone ")
    @Test
    void testGetPhone() {

        assertEquals("12345678910",myPassenger.getPhone());
    }
    @DisplayName("Test getAge ")
    @Test
    void testGetAge() {

        assertEquals(22,myPassenger.getAge());
    }
    @DisplayName("Test Wrong setname ")
    @Test
    void testWrongName() {

        assertThrows(IllegalArgumentException.class, new Executable(){

            public void execute() throws Throwable {
                Passenger p = new Passenger("Mr","Joon","A1B24rtysrt2020","1278fghdf910",20);
                p.setName("sf");
            }
        });
    }
    @DisplayName("Test Wrong setPhone ")
    @Test
    void testWrongPhone() {

        assertThrows(IllegalArgumentException.class, new Executable(){

            public void execute() throws Throwable {
                Passenger p = new Passenger("Mr","Joon","A1B24rtysrt2020","1278fghdf910",20);
                p.setPhone("sfdsfsd");
            }
        });
    }
    @DisplayName("Test Wrong setAge ")
    @Test
    void testWrongAge() {

        assertThrows(IllegalArgumentException.class, new Executable(){

            public void execute() throws Throwable {
                Passenger p = new Passenger("Mr","Joon","A1B24rtysrt2020","1278fghdf910",20);
                p.setAge(1);
            }
        });
    }
}
