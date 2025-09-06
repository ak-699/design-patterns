package behavioral.state.media_player;

public class MediaPlayer {
    private State state;

    public MediaPlayer() {
        this.state = new StopState();
    }

    public void setState(State state) {
        this.state = state;
    }

    void pressPlay() {
        state.play(this);
    }

    void pressStop() {
        state.stop(this);
    }
}
