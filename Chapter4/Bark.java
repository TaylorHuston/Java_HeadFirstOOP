package Chapter4;


public class Bark {
    private String sound;

    public Bark (String sound) {
        this.sound = sound;
    }

    public String getSoud() {
        return this.sound;
    }

    public boolean equals(Bark bark) {
        if (bark instanceof Bark) {
            return this.sound.equalsIgnoreCase(bark.getSoud());
        }
        return false;
    }

}