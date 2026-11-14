import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Part 1

        int[] dataPoints = new int[100];
        Random rnd = new Random();

        for (int i = 0; i < 100; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(dataPoints[i]);
            if (i < 99) {
                System.out.print(" | ");
            }
        }
        System.out.println("\n");

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += dataPoints[i];
        }

        double average = (double) sum / 100;

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.printf("The average of the random array dataPoints is: %.2f\n", average);


        // Part 2


        int userValue = SafeInput.getRangedInt(in, "Enter an integer value between 1 and 100", 1, 100);

        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (dataPoints[i] == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " time(s) in the array.\n");

        int targetValue = SafeInput.getRangedInt(in, "Enter another integer value", 1, 100);

        int foundIndex = -1;
        for (int i = 0; i < 100; i++) {
            if (dataPoints[i] == targetValue) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("The value " + targetValue + " was found at array index " + foundIndex + ".\n");
        } else {
            System.out.println("The value " + targetValue + " was not found in the array.\n");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < 100; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in the dataPoints array is: " + min);
        System.out.println("The maximum value in the dataPoints array is: " + max + "\n");

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += values[i];
        }
        return (double) sum / 100;
    }
}