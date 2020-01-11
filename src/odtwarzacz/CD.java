package odtwarzacz;

public class CD extends MusicPlayer {
    @Override
    public String odtwarzaj() {
        return "odtwarzacz CD";
    }

    @Override
    public String pauza() {
        return "Pauza odtwarzacz CD";
    }

    @Override
    public String nastepnyUtwor() {
        return "Następny utwór CD";
    }

    @Override
    public String poprzedniUtwor() {
        return "Poprzedni utwór CD";
    }
}
