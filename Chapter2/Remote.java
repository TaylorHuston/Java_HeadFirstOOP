package Chapter2;

public class Remote {
    private DogDoor door;
    public Remote(DogDoor door) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("Button pressed");
        if (door.isOpen() == true) {
            door.close();
        } else {
            door.open();
        }
    }
}

