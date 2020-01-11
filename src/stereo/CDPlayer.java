package stereo;

public class CDPlayer extends MusicPlayer {
    @Override
    public void play() {
        System.out.println("CD odtwarza");
    }

    @Override
    public void stop() {
        System.out.println("CD stop");
    }

    @Override
    public void pause() {
        System.out.println("CD pauza");

    }

    @Override
    public void next() {
        System.out.println("CD nastepny");
    }

    @Override
    public void previous() {
        System.out.println("CD poprzedni");
    }
}
