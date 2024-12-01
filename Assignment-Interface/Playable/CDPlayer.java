
public class CDPlayer implements Playable {
    private boolean isPlaying;

    @Override
    public void play() {
        if (!isPlaying) {
            System.out.println("Playing CD...");
            isPlaying = true;
        } else {
            System.out.println("CD is already playing.");
        }
    }

    @Override
    public void pause() {
        if (isPlaying) {
            System.out.println("Pausing CD...");
            isPlaying = false;
        } else {
            System.out.println("CD is already paused.");
        }
    }

    @Override
    public void stop() {
        if (isPlaying) {
            System.out.println("Stopping CD...");
            isPlaying = false;
        } else {
            System.out.println("CD is already stopped.");
        }
    }
}
