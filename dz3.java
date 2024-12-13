// Задача 3. Подсчет суммы цифр числа
// Напишите метод sumDigits, который принимает целое число n и возвращает
// сумму его цифр

import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Введите число: ");
           int n = scanner.nextInt();
           int result = sumDigits(n);
           System.out.println("Сумма цифр числа " + n + " равна " + result);
           scanner.close();
    }


    public static int sumDigits(int n){
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
        }
    }

