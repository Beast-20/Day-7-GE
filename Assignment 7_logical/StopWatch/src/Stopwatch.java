import java.util.Scanner;

public class Stopwatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Stopwatch Program");
        System.out.println("Press Enter to start the stopwatch.");

        // Wait for the user to press Enter to start the stopwatch
        scanner.nextLine();

        long startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started. Press any key to stop.");

        // Wait for any input to stop the stopwatch
        scanner.nextLine();

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println("Stopwatch stopped.");
        System.out.println("Elapsed Time: " + formatElapsedTime(elapsedTime));
    }

    private static String formatElapsedTime(long milliseconds) {
        long seconds = milliseconds / 1000;
        long minutes = seconds / 60;
        seconds = seconds % 60;
        milliseconds = milliseconds % 1000;

        return String.format("%02d:%02d:%03d", minutes, seconds, milliseconds);
    }
}

