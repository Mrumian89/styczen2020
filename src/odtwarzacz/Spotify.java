package odtwarzacz;

public class Spotify extends MusicPlayer {

    @Override
    public String odtwarzaj() {
        return "Spotify";
    }

    @Override
    public String pauza() {
        return "Pauza Spotify";
    }

    @Override
    public String nastepnyUtwor() {
        return "Następny utwór Spotify";
    }

    @Override
    public String poprzedniUtwor() {
        return "Poprzedni utwór Spotify";
    }
}
