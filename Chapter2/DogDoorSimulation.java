package Chapter2;


public class DogDoorSimulation {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        remote.pressButton();

        remote.pressButton();
    }
}
