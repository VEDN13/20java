import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задача 1
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число:");
//        float input = in.nextFloat();
//
//        if (input % 2 == 0) {
//            System.out.println("Число четное.");
//        } else {
//            System.out.println("Число нечетное.");
//        }
//
//        in.close();
// -----------------------------------------------------------------------------------

        // Задача 2
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите первое число:");
//        int input1 = in.nextInt();
//        System.out.println("Введите второе число:");
//        int input2 = in.nextInt();
//        System.out.println("Введите третье число:");
//        int input3 = in.nextInt();
//        int minNum = Math.min(input1, Math.max(input2, input3));
//
//        System.out.println("Наибольшее число: " + minNum);
// -----------------------------------------------------------------------------------

        // Задача 3
// -----------------------------------------------------------------------------------
//        for (int i = 1; i <= 10; i++)
//        {
//            System.out.println("5 * " + i +  "="  + 5 * i);
//        }
// -----------------------------------------------------------------------------------

        // Задача 4
// -----------------------------------------------------------------------------------
//                Scanner in = new Scanner(System.in);
//                System.out.println("Введите число:");
//                int input = in.nextInt();
//
//                int result = 0;
//
//                for (int i = 1; i <= input; i++) {
//                    result += i;
//                }
//
//                System.out.println(result);
//                in.close();
// -----------------------------------------------------------------------------------

        // Задача 5
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число:");
//        int N = in.nextInt();
//
//        if (N <= 0) {
//            System.out.println("Введите положительное целое число.");
//        } else {
//            System.out.print("Первые " + N + " чисел Фибоначчи: ");
//            int a = 0, b = 1;
//
//            for (int i = 1; i <= N; i++) {
//                System.out.print(a + " ");
//
//                int next = a + b;
//                a = b;
//                b = next;
//            }
//        }
//        in.close();
// -----------------------------------------------------------------------------------

        // Задача 6
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число:");
//        float N = in.nextFloat();
//        boolean hard = false;
//        for (int i = 2; i < N; i++)
//        {
//            if (N % i == 0)
//            {
//                hard = true;
//            }
//        }
//        if (N == 1) {hard = true;}
//        if (hard == true)
//        {
//            System.out.println(N + " является сложным числом");
//        }
//        else
//        {
//            System.out.println(N + " является простым числом");
//        }
//        in.close();
// -----------------------------------------------------------------------------------

        // Задача 7
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число:");
//        int input = in.nextInt();
//        for (int i = input; i >= 1; i--) {
//            System.out.println(i);
//        }
//        in.close();
// -----------------------------------------------------------------------------------

        // Задача 8
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число A:");
//        int A = in.nextInt();
//        System.out.println("Введите число B:");
//        int B = in.nextInt();
//        int Sum = 0;
//        for (int i = A; i <= B; i++)
//        {
//            if (i % 2 == 0)
//            {
//                Sum += i;
//            }
//        }
//        System.out.println(Sum);
//        in.close();
// -----------------------------------------------------------------------------------

        // Задача 9
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите строку:");
//        String input = in.nextLine();
//        String reversed = new StringBuilder(input).reverse().toString();
//        System.out.println("Реверсированная строка: " + reversed);
//        in.close();
// -----------------------------------------------------------------------------------

        // Задача 10
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число:");
//        String input = in.nextLine();
//        if (input.charAt(0) == '-')
//        {
//            input = input.substring(1);
//        }
//        int count = input.length();
//        System.out.println("Количество цифр в числе: " + count);
//        in.close();
// -----------------------------------------------------------------------------------

        // Задача 11
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число:");
//        int input = in.nextInt();
//        int fak = 1;
//        for (int i = input; i >= 1; i--)
//        {
//            fak *= i;
//        }
//        in.close();
//        System.out.println("Факториал числа " + input + " равна " + fak);
// -----------------------------------------------------------------------------------

        // Задача 12
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число:");
//        int sum = 0;
//        int input = in.nextInt();
//        input = Math.abs(input);
//        while (input > 0)
//        {
//            sum += input % 10;
//            input /= 10;
//        }
//        System.out.println("Сумма всех цифр: " + sum);
//        in.close();
// -----------------------------------------------------------------------------------

        // Задача 13
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите строку:");
//        String input = in.nextLine();
//        String reversed = new StringBuilder(input).reverse().toString();
//        if (input.equals(reversed))
//        {
//            System.out.println("Cтрока палиндромом");
//        }
//        else
//        {
//            System.out.println("Cтрока не палиндромом");
//        }
// -----------------------------------------------------------------------------------

        // Задача 14
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите размер массива: ");
//        int size = in.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++)
//        {
//            array[i] = in.nextInt();
//        }
//        int max = array[0];
//        for (int i = 1; i < size; i++)
//        {
//            if (array[i] > max)
//            {
//                max = array[i];
//            }
//        }
//        System.out.println("Максимальное число в массиве: " + max);
//        in.close();
// -----------------------------------------------------------------------------------

        // Задача 15
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите размер массива: ");
//        int size = in.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++)
//        {
//            array[i] = in.nextInt();
//        }
//        int max = array[0];
//        for (int i = 1; i < size; i++)
//        {
//            if (array[i] > max)
//            {
//                max = array[i];
//            }
//        }
//        System.out.println("Максимальное число в массиве: " + max);
//        in.close();
// -----------------------------------------------------------------------------------

        // Задача 15
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите размер массива: ");
//        int size = in.nextInt();
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++)
//        {
//            array[i] = in.nextInt();
//        }
//        int sum = 0;
//        for (int i = 0; i < size; i++) {
//            sum += array[i];
//        }
//        System.out.println("Сумма элементов массива: " + sum);
//        in.close();
// -----------------------------------------------------------------------------------

        // Задача 16
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = in.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++)
//        {
//            array[i] = in.nextInt();
//        }
//        int plus = 0;
//        int minus = 0;
//        for (int i = 0; i < size; i++)
//        {
//            if (array[i] > 0)
//            {
//                plus++;
//            } else if (array[i] < 0)
//            {
//                minus++;
//            }
//        }
//        System.out.println("Количество положительных чисел: " + plus);
//        System.out.println("Количество отрицательных чисел: " + minus);
//        in.close();
// -----------------------------------------------------------------------------------

        // Задача 17
// -----------------------------------------------------------------------------------
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число A: ");
//        int A = in.nextInt();
//        System.out.print("Введите число B: ");
//        int B = in.nextInt();
//        System.out.println("Простые числа в диапазоне от " + A + " до " + B + ":");
//        for (int i = Math.max(A, 2); i <= B; i++)
//        {
//            if (isPrime(i))
//            {
//                System.out.println(i);
//            }
//        }
//        in.close();
//    }
//    private static boolean isPrime(int n)
//    {
//        if (n <= 1) return false;
//        for (int i = 2; i * i <= n; i++)
//        {
//            if (n % i == 0) return false;
//        }
//        return true;
// -----------------------------------------------------------------------------------

        // Задача 18
// -----------------------------------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строку: ");
//        String input = scanner.nextLine().toLowerCase();
//        int glasnie = 0;
//        int soglasnie = 0;
//        for (char ch : input.toCharArray())
//        {
//            if (Character.isLetter(ch))
//            {
//                if ("аеёиоуыэюя".indexOf(ch) != -1)
//                {
//                    glasnie++;
//                }
//                else
//                {
//                    soglasnie++;
//                }
//            }
//        }
//        System.out.println("Количество гласных букв: " + glasnie);
//        System.out.println("Количество согласных букв: " + soglasnie);
//        scanner.close();
// -----------------------------------------------------------------------------------

        // Задача 19
// -----------------------------------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//        String[] words = input.split(" ");
//        StringBuilder reversedWords = new StringBuilder();
//        for (int i = words.length - 1; i >= 0; i--)
//        {
//            reversedWords.append(words[i]);
//            if (i != 0)
//            {
//                reversedWords.append(" ");
//            }
//        }
//        System.out.println("Слова в обратном порядке: " + reversedWords.toString());
//        scanner.close();
// -----------------------------------------------------------------------------------

        // Задача 20
// -----------------------------------------------------------------------------------
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите целое число: ");
    int input = scanner.nextInt();
    int original = input;
    int sum = 0;
    int numberOfDigits = String.valueOf(input).length();
    while (input > 0)
    {
        int digit = input % 10;
        sum += Math.pow(digit, numberOfDigits);
        input /= 10;
    }
    if (sum == original)
    {
        System.out.println(original + " является числом Армстронга.");
    }
    else
    {
        System.out.println(original + " не является числом Армстронга.");
    }
    scanner.close();
    }
}