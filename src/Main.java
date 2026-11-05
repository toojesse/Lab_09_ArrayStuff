import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        // Task 1: Declare an array of type int named dataPoints with a length of 100
        int[] dataPoints = new int[100];

        // Task 2: Initialize each element in dataPoints to a random value between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        // Task 3: Display the dataPoints values separated by " | "
        System.out.println("--- Task 3: Array Values ---");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println("\n");
        // Task 4: Calculate the sum and average of the values in dataPoints
        int sum = 0;
        for (int val : dataPoints) {
            sum += val;
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("--- Task 4: Sum and Average ---");
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average + "\n");

        // Task 5 & 6: Prompt user for a value and count occurrences
        System.out.println("--- Task 6: Linear Scan (Count Occurrences) ---");
        int userSearchVal = SafeInput.getRangedInt(in, "Enter an integer value to search for", 1, 100);

        int count = 0;
        for (int val : dataPoints) {
            if (val == userSearchVal) {
                count++;
            }
        }
        System.out.println("The value " + userSearchVal + " was found " + count + " time(s) in the array.\n");

        // Task 7: Prompt user again, find first occurrence with short-circuit (break)
        System.out.println("--- Task 7: Find First Position (Short-circuit) ---");
        int userTargetVal = SafeInput.getRangedInt(in, "Enter another integer value to search for", 1, 100);

        int foundIndex = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userTargetVal) {
                foundIndex = i;
                break; // Short-circuit out of the loop
            }
        }

        if (foundIndex != -1) {
            System.out.println("The value " + userTargetVal + " was found at array index " + foundIndex + ".");
        } else {
            System.out.println("The value " + userTargetVal + " was not found in the array.");
        }
        System.out.println();
        // Task 8: Scan for minimum and maximum values
        System.out.println("--- Task 8: Min and Max ---");
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max + "\n");
        // Task 9: Call the static getAverage method
        System.out.println("--- Task 9: Static Method getAverage ---");
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    // Task 9: Static method to calculate and return average
    public static double getAverage(int values[]) {
        int total = 0;
        for (int val : values) {
            total += val;
        }
        return (double) total / values.length;
    }
}