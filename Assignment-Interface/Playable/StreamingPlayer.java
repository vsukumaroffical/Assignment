public class StreamingPlayer implements Playable {
    private boolean isPlaying;

    @Override
    public void play() {
        if (!isPlaying) {
            System.out.println("Streaming music...");
            isPlaying = true;
        } else {
            System.out.println("Streaming is already playing.");
        }
    }

    @Override
    public void pause() {
        if (isPlaying) {
            System.out.println("Pausing streaming...");
            isPlaying = false;
        } else {
            System.out.println("Streaming is already paused.");
        }
    }

    @Override
    public void stop() {
        if (isPlaying) {
            System.out.println("Stopping streaming...");
            isPlaying = false;
        } else {
            System.out.println("Streaming is already stopped.");
        }
    }
}
