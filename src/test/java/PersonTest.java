import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class PersonTest {
    private Person person;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void before() throws Exception {
        //PARTES DE UNA PRUEBA Preparacion // Logica // Verificacion
        person = new Person();
    }

    @Test
    public void createNewPerson() throws Exception {
        person.createPerson();
        assertTrue(1 <= person.createPerson() && person.createPerson() <= 3);
    }

    @Test
    public void destinationFloorCantBeSameFloorOrigin() throws Exception {
        person.callElevator();
    }

    @Test
    public void personNotNull() {
        assertNotNull(person);
    }

    @Test
    public void floorToGoNotNull() {
        person.assignRandomFloor();
        assertNotNull(person.getFloorToGo());
    }

    @Test
    public void floorToGoNotExceedFloorMaxNumber() throws Exception {
        person.randomFloorMaxMinController();
    }
}