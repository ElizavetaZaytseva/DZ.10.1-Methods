package app;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SquareCalculation {

    public static void main(String[] args) {
        //  1 task
        System.out.println("Task #1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int integer = scanner.nextInt();
        int square = calculateSquare(integer);
        System.out.println("The square of " + integer + " is: " + square);

        System.out.println("/////////////////////////////////////////////////");
        // 2 task
        System.out.println("Task #2");

        double radius = (double) integer;
        System.out.println("Radius is: " + integer);
        double squareForVolume = (double) square;
        System.out.println("Enter an height : ");
        double height = scanner.nextDouble();
        double volume = cylinderVolumeCalculation(square, height);

        System.out.printf("The volume of a cylinder with a radius of %.2f  " +
                        "and a height of %.2f is %.2f",
                radius,
                height,
                volume);
        // 3 task

        System.out.println();
        System.out.println("/////////////////////////////////////////////////");
        //3 task
        System.out.println("Task #3");
        int[] arr = {10, 20, 30, 40, 50};

        int sum = calculateSum(arr);
        System.out.println("Array of numbers " + Arrays.toString(arr));
        System.out.println("The sum of all array elements is " + sum);
        System.out.println("/////////////////////////////////////////////////");
        // 4 task
        System.out.println("Task #4");
        System.out.println("Enter the string: ");
        //   Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String originalText = scanner.nextLine();
        String reversedText = reversedText(originalText);
        System.out.println("Row in reverse order " + reversedText);
        System.out.println("/////////////////////////////////////////////////");

//        //5 task
        System.out.println("Task #5");
        System.out.println("Number #1  from the Task#1:" + integer);
        System.out.println("Enter number #2: ");
        int number2 = scanner.nextInt();
        int numberRaisedPower = raisedPower(integer, number2);
        System.out.println("The result of " + integer + "^" + number2 + " is " + numberRaisedPower);
        System.out.println("/////////////////////////////////////////////////");
        //     6 task
        System.out.println("Task #6");
        System.out.println("Enter number:");
        int numberOfTimes = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter text line: ");
        String lineString = scanner.nextLine();
        repeatString(numberOfTimes, lineString);

    }

        //1   task
        static int calculateSquare ( int integer){
            int result = integer * integer;
            return result;
        }

        //2 task
        static double cylinderVolumeCalculation ( double square, double height){
            double PI = Math.PI;
            double result = PI * square * height;
            return result;
        }

        // 3 task
        static int calculateSum ( int[] arr){
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum;
        }

        // 4 task
        static String reversedText (String str){
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                result = str.charAt(i) + result;
            }
            return result;
        }

        // 5 task
        static int raisedPower ( int integer, int number2){
            int result = 1;
            for (int i = 0; i < number2; i++) {
                result *= integer;
            }
            return result;
        }

     static void repeatString(int numberOfTimes, String lineString) {
        for (int i = 0; i < numberOfTimes; i++) {
           System.out.println(lineString);
        }

    }
}



















