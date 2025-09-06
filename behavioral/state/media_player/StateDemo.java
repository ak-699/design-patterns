package behavioral.state.media_player;

public class StateDemo {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.pressPlay();
        mediaPlayer.pressPlay();
        mediaPlayer.pressStop();
        mediaPlayer.pressPlay();
    }
}
