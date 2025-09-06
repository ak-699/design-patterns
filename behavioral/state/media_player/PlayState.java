package behavioral.state.media_player;

public class PlayState implements State {

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Already playing...");
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        System.out.println("Stopping player...");
        mediaPlayer.setState(new StopState());
    }

}
