interface Playable {
    void play(); // Abstract method
}
class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing video...");
    }
}
class AudioPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing audio...");
    }
}
public class Main {
    public static void main(String[] args) {
        Playable videoPlayer = new VideoPlayer();
        Playable audioPlayer = new AudioPlayer();
        videoPlayer.play();
        audioPlayer.play();
    }
}
