package behavioral.state.media_player;

public interface State {
    void play(MediaPlayer mediaPlayer);

    void stop(MediaPlayer mediaPlayer);
}
