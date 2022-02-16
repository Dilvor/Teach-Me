package homeWork;

import java.util.Scanner;

public class FourthWork {
//Вычисление значения в последовательности Фибоначи
//Прога запрашивает ввод в консоль число "n"(в пределах "int")
//Задача приложения вычислить "n" член последовательности
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n-ый член последовательности Фибоначи для получения его значения");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 2;i < n; ++i){
            int next = a + b;
            a = b;
            b = next;
        }
            System.out.println(n+"-ый член последовательности Фибоначи: "+b);
        }
    }
