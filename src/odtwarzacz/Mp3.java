package odtwarzacz;

public class Mp3 extends MusicPlayer {
    @Override
    public String odtwarzaj() {
        return "odtwarzacz Mp3";
    }

    @Override
    public String pauza() {
        return "MP3 Pauza";
    }

    @Override
    public String nastepnyUtwor() {
        return "Następny utwór MP3";
    }

    @Override
    public String poprzedniUtwor() {
        return "Poprzedni utwór MP3";
    }
}
