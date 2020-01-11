package odtwarzacz;

abstract public class MusicPlayer implements Player {
    public static void main(String[] args) {

        Player[] player = new Player[3];
        player[0] = new Mp3();
        player[1] = new Spotify();
        player[2] = new CD();

        System.out.println(player[0].nastepnyUtwor());
        System.out.println(player[1].odtwarzaj());
        System.out.println(player[2].odtwarzaj());

        for (Player player1 : player) {
            System.out.println("Gra" + player1.odtwarzaj());
        }
    }
}




