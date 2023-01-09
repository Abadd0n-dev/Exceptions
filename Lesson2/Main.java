package Lesson2;

public class Main {
	public static void main(String[] args) {
		Task1.checkIfUserNumberIsFloat();
		Task2.divideArrayNums();
		try {
			int a = 90;
			int b = 0;
			String x = null;
			int[] abc = {1, 2};
			System.out.println(abc[3]); // Вызовет IndexOutOfBoundsException
			abc[3] = 9; // Вызовет IndexOutOfBoundsException
			System.out.println(x.length()); // Вызовет NullPointerException
			System.out.println(a / b); // Вызовет ArithmeticException
			Task3.printSum(23, 234); // Исключение невозможно

		} catch (NullPointerException ex) {
			System.out.println("Указатель не может указывать на null!");
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Массив выходит за пределы своего размера!");
		} catch (ArithmeticException e) {
			System.out.println("Деление на ноль!");
		} catch (Throwable ex) {
			System.out.println("Что-то пошло не так...");
		}
		Task4.printUserString();
	}
}

