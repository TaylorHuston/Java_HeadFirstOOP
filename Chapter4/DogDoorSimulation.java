package Chapter4;


public class DogDoorSimulation {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        //Simulate hardware hearing bark
        System.out.println("Fido starts barking");
        recognizer.recognize("Woof");

        System.out.println("\nFido is outside");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
        }

        System.out.println("Fido starts barking");
        recognizer.recognize("Woof");
        System.out.println("\nFido is inside");
    }
}
