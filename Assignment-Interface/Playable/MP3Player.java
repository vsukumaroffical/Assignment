
public class MP3Player implements Playable {
    private boolean isPlaying;

    @Override
    public void play() {
        if (!isPlaying) {
            System.out.println("Playing MP3...");
            isPlaying = true;
        } else {
            System.out.println("MP3 is already playing.");
        }
    }

    @Override
    public void pause() {
        if (isPlaying) {
            System.out.println("Pausing MP3...");
            isPlaying = false;
        } else {
            System.out.println("MP3 is already paused.");
        }
    }

    @Override
    public void stop() {
        if (isPlaying) {
            System.out.println("Stopping MP3...");
            isPlaying = false;
        } else {
            System.out.println("MP3 is already stopped.");
        }
    }
}
