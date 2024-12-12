// Вывод всех четных чисел от 1 до 100
// Напишите метод printEvenNums, который выведет на экран все четные числа
// в промежутке от 1 до 100, каждое на новой строке.

// public class dz1 {
//     public static void main(String[] args) {
//         printEvenNums();
//     }
//         public static void printEvenNums(){
//             for(int i = 0; i <= 100; i++){
//                 if ( i % 2 == 0){
//                     System.out.println(i);
//                 }
//             }
//         }
//     }

public class dz1 {
    public static void main(String[] args) {
        printEvenNums();
    }

    public static void printEvenNums() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
