package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {


        for (int i = 0; i < height; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print '8's
            for (int j = 0; j < 2 * (height - i) - 1; j++) {
                System.out.print("8");
            }

            // Move to the next line
            System.out.println();
        }

        for (int i = height - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print '8's
            for (int j = 0; j < 2 * (height - i) - 1; j++) {
                System.out.print("8");
            }

            // Move to the next line
            System.out.println();
        }

    }
}
