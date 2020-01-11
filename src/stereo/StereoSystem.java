package stereo;

public class StereoSystem {
    public static void main(String[] args) {
        Player[] players = {new Mp3Player(), new CDPlayer()};

        players[0].play();
        players[0].pause();
        players[0].stop();

        players[1].play();
        players[1].pause();
        players[1].previous();
        players[1].stop();
    }
}
