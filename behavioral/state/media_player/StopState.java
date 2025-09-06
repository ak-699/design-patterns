package behavioral.state.media_player;

public class StopState implements State {

    @Override
    public void play(MediaPlayer mediaPlayer) {
        System.out.println("Starting player...");
        mediaPlayer.setState(new PlayState());
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        System.out.println("Already stopped!");
    }

}
