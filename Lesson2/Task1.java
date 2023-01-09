package Lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void checkIfUserNumberIsFloat() {
        while (true) {
            System.out.println("Введите дробное число:");
            Scanner sc = new Scanner(System.in);
            try {
                float userFloat = sc.nextFloat();
                System.out.println(userFloat);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введенное значение не является дробным числом, пожалуйста, повторите ввод:");
            }
        }
    }
}