package Lesson2;

import java.util.Scanner;

public class Task4 {
    public static void printUserString() {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        if (userInput.trim().isEmpty()) {
            throw new NullPointerException("Empty string is not allowed");
        } else System.out.printf("Entered string: %s", userInput);
    }
}
