package stereo;

public class Mp3Player extends MusicPlayer {
    @Override
    public void play() {
        System.out.println("Mp3 odtwarza");
    }

    @Override
    public void stop() {
        System.out.println("Mp3 stop");
    }

    @Override
    public void pause() {
        System.out.println("Mp3 pauza");

    }

    @Override
    public void next() {
        System.out.println("Mp3 nastepny");
    }

    @Override
    public void previous() {
        System.out.println("Mp3 poprzedni");
    }
}
