// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Введите ваше имя: ");
//         String name = scanner.nextLine();
//         System.out.println("Привет, " + name + "!");
//         scanner.close();
//     }

// }

// Task1

// import java.time.LocalDateTime;
// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Введите ваше имя: ");
//         String s = scanner.next();

//         LocalDateTime dateTime = LocalDateTime.now();
//         int i = dateTime.getHour();

//         String temp = "";
//         if(i >= 5 && i < 12){
//             temp = "Доброе утро";
//         }
//         if(i >= 12 && i < 18){
//             temp = "Добрый день";
//         }
//         if(i >= 18 && i < 23  ){
//             temp = "Добрый вечер";
//         }
//         if(i<5 || i==23){
//             temp = "Доброй ночи";
//         }

//         System.out.println(temp + "," + s);
//     }

// }

// Task2 Дан массив двоичных чисел, например [1,1,0,1,1,1] вывести
// максимальное количество подряд идущих

// public class Main{
//         public static void main(String[] args){
//             int[] array = {0,1,1,1,0,0};

//             int counter = 0;
//             int max = 0;
//             for(int i: array){
//                 if(i == 1){
//                     counter++;
//                 }
//                 if(i == 0){
//                     if(counter != 0){
//                        if(max < counter){
//                             max = counter;
//                        } 
//                        counter = 0;
//                     }
//                 }
//             }
//             if (counter != 0){
//                 if (max < counter){
//                     max = counter;
//                 }
//             }
//             System.out.println(max);
//         }
//     }


//Задание 4. Во фразе "Добро пожаловать на курс java" переставить слова 
// в обратном порядке

// public class Main{
//     public static void main(String[] args) {
//         String phrase = "Добро пожаловать на курс по Java";
//         String [] array = phrase.split(" ");
//         for(int i = array.length -1; i>= 0; i--){
//             System.out.println(array[i] + " ");
//         }
//     }
// }

// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Введите целое число a: ");
//         int a = scanner.nextInt();
//         System.out.print("Введите целое число b: ");
//         int b = scanner.nextInt();

//         int result = 1;
//         for(int i = 1; i <= b; i++){
//             result = result * a;
//         }
//         System.out.println(result);
//     }
// } 

// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Введите целое число a: ");
//         int a = scanner.nextInt();
//         System.out.print("Введите целое число b: ");
//         int b = scanner.nextInt();

//         int c = pow(a,b);
//         System.out.println(c);

       
//     }
//     public static int pow(int a, int b){
//         if (b == 1){
//             return a;
//         }
//         else {
//             return a * pow(a, b - 1);
//         }
//     } 

// } 

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите целое число b: ");
        int b = scanner.nextInt();

        double c = Math.pow(a, b);
        System.out.println(c);
    

       
    }

} 



    
    
