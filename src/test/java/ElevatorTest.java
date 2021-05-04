import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class ElevatorTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();
    private Elevator elevator;

    @Before
    public void before() {
        //PARTES DE UNA PRUEBA Preparacion // Logica // Verificacion
        elevator = new Elevator();
    }

    @Test
    public void onlyOnePersonInElevator() throws Exception {
        elevator.personGetting();
        exception.expect(Exception.class);
        elevator.personGetting();
    }

    @Test
    public void personInsideElevator() throws Exception {
        elevator.personInsideElevator(1);
    }

    @Test
    public void ElevatorMovementController() {
        assertEquals(3, elevator.elevatorMovesTo(3));
        assertEquals(1, elevator.elevatorMovesTo(1));
        assertEquals(3, elevator.elevatorMovesTo(3));
        assertEquals(1, elevator.elevatorMovesTo(1));

    }

    @Test
    public void onlyThreeFloorsInTheBuilding() {
        int floors = 3;
        assertEquals(floors, elevator.getFloors());
    }

    @Test
    public void beginningDayWaitsDoorClosedOnFirstFloor() {
        assertFalse(elevator.getDoorOpenStatus());
    }

    @Test
    public void doorController() {
        assertTrue(elevator.isDoorOpen(true));
        assertFalse(elevator.isDoorOpen(false));
    }

    @Test
    public void personExitTheElevator() throws Exception {
        exception.expect(Exception.class);
        elevator.personExitsTheElevator();
    }

}