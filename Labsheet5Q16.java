interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {
    @Override
    public void takePhoto() {
        System.out.println("Capturing high-resolution photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing audio playlist...");
    }
}

public class Labsheet5Q16 {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.takePhoto();
        phone.playMusic();
    }
}