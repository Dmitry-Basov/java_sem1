// Задача 4*. Нахождение максимального из трех чисел
// Реализуйте две функции:
// 1. Функция findMaxOfTwo должна принимать два числа и возвращать
// максимальное из них, используя только знак сравнения.
// 2. Функция findMaxOfThree должна принимать три числа и находить
// максимальное из них, используя первую функцию.

import java.util.InputMismatchException;
import java.util.Scanner;

public class dz4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Вызов метода readNumber для ввода корректных чисел
        int a = readNumber(scanner, "Введите 1-ое число: ");
        int b = readNumber(scanner, "Введите 2-ое число: ");
        int c = readNumber(scanner, "Введите 3-ое число: ");

        int maxoftwo = findMaxOfTwo(a, b);
        System.out.println("Максимальное из двух чисел: " + maxoftwo);

        int maxofthree = findMaxOfThree(a, b, c);
        System.out.println("Максимальное из трех чисел: " + maxofthree);
        
        scanner.close();
    }

    // Метод readNumber проверяет корректный ввод с консоли
    public static int readNumber(Scanner scanner, String prompt) {
        int number = 0;
        boolean validInput = false; 

        while (!validInput) {
            System.out.print(prompt);
            try {
                number = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Пожалуйста, введите целое число.");
                scanner.next(); 
            }
        }

        return number; 
    }
// метод для вычисления большего из 2
    public static int findMaxOfTwo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
// метод для вычисления большего из 3
    public static int findMaxOfThree(int a, int b, int c) {
        int maxAB = findMaxOfTwo(a, b);
        return findMaxOfTwo(maxAB, c); 
    }
}



