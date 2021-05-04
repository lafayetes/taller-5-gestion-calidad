public class Person {
    int floorToGo;
    int personFloor;

    public Person() throws Exception {
        createPerson();
    }

    public int getFloorToGo() {
        return floorToGo;
    }

    public void assignRandomFloor() {
        this.floorToGo = (int) (Math.random() * 3 + 1);

    }

    public void randomFloorMaxMinController() throws Exception {
        assignRandomFloor();
        if (floorToGo > 3 || floorToGo < 1) {
            throw new Exception("Invalid Floor Number");
        }

    }


    public void callElevator() throws Exception {
        assignRandomFloor();
        if (createPerson() == getFloorToGo()) {
            throw new Exception("Same floor");
        }
    }

    public int createPerson() throws Exception {
        personFloor = (int) (Math.random() * 3 + 1);
        if (personFloor > 3 || personFloor < 1) {
            throw new Exception("Out of range");
        }
        return personFloor;
    }
}
