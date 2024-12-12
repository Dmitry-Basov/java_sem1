// Задание 1. Нахождение факториала числа
// Напишите метод factorial, который принимает число n и возвращает его
// факториал. Если число n < 0, метод должен вернуть -1.



public class dz {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("факториал числа " + n + " равен: " + result);
    }

        public static int factorial(int n){ 
            if (n < 0){
                return -1;
            }
            int result = 1;
            for(int i = 1; i <= n; i++ ){
                result *= i;
            }
            return result;
        }
    
}
