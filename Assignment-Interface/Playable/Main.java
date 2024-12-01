import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playable player = null;

        System.out.println("Select a music player:");
        System.out.println("1. MP3 Player");
        System.out.println("2. CD Player");
        System.out.println("3. Streaming Player");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                player = new MP3Player();
                break;
            case 2:
                player = new CDPlayer();
                break;
            case 3:
                player = new StreamingPlayer();
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        // Player control loop
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Stop");
            System.out.println("4. Exit");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    player.play();
                    break;
                case 2:
                    player.pause();
                    break;
                case 3:
                    player.stop();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting player control.");
                    break;
                default:
                    System.out.println("Invalid action.");
            }
        }

        scanner.close();
    }
}
