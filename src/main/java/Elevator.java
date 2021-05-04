public class Elevator {
    private final int floors = 3;
    private int actualFloor = 1;
    private int capacity = 0;
    private int persons = 0;
    private boolean doorOpen = false;

    public void personInsideElevator(int person) throws Exception {
        capacity += person;
        if (capacity == 1) {
            System.out.println("Person inside");
        } else if (capacity == 0) {
            System.out.println("Empty elevator");

        } else {
            throw new Exception("invalid capacity number");
        }
    }

    public void personGetting() throws Exception {
        persons++;
        if (persons > 1)
            throw new Exception("Only can be one person at time");

    }

    public int getFloors() {
        return floors;
    }

    int getActualFloor() {
        return actualFloor;
    }

    public boolean isDoorOpen(boolean status) {
        doorOpen = status;
        if (doorOpen) {
            System.out.println("Elevator door opened");
        } else {
            System.out.println("door closed");
        }

        return doorOpen;
    }

    public boolean getDoorOpenStatus() {
        return doorOpen;
    }

    public int elevatorMovesTo(int desiredFloor) {
        int aux;
        if (actualFloor != desiredFloor && actualFloor < desiredFloor) {
            aux = desiredFloor - actualFloor;
            actualFloor += aux;
        } else {
            aux = actualFloor - desiredFloor;
            actualFloor -= aux;
        }
        return actualFloor;
    }

    public void personExitsTheElevator() throws Exception {
        persons--;
        if (persons != 0) {
            throw new Exception("Invalid person number");
        }
    }
}

