public class Main1 {
    public static void main(String[] args) {
        System.out.println("Hacking under process");

        int total = 100;
        for (int i = 0; i <= total; i++) {
            printColoredProgressBar(i, total);
            try {
                Thread.sleep(100); // Sleep for 0.1 second (100 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nHacking complete!");
    }

    public static void printColoredProgressBar(int progress, int total) {
        int barWidth = 50;
        int pos = barWidth * progress / total;

        // Choose color based on progress
        String color;
        if (progress <= total / 3)
            color = "\u001B[32m"; // Green
        else if (progress <= 2 * total / 3)
            color = "\u001B[33m"; // Yellow
        else
            color = "\u001B[31m"; // Red

        System.out.print("\r" + color + "[");
        for (int i = 0; i < barWidth; ++i) {
            if (i < pos)
                System.out.print("█");
            else
                System.out.print(" ");
        }
        System.out.printf("] %d%%\u001B[0m", progress); // Reset color
        System.out.flush();
    }
}
