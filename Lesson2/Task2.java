package Lesson2;

public class Task2 {
    public static void divideArrayNums() {
        try {
            int d = 10;
            double[] intArray = {1, 3, 6, 2, 3, 5, 0, 5, 0};
            double catchedRes1 = intArray[8] / d;
            if (Double.isNaN(catchedRes1) | Double.isInfinite(catchedRes1)) {
                System.out.println("Catching exception: Division by zero");
                } else System.out.println("catchedRes1 = " + catchedRes1);
            } catch (IndexOutOfBoundsException | ArithmeticException e) {
                System.out.println("Catching exception: " + e.getLocalizedMessage());
            }
        }
    }
