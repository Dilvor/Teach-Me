package homeWork.homeWork5;

import java.util.Random;
import java.util.Scanner;

public class FifthWork {
    //Вычисление максимального,минимального и среднего значения массива,его длинна будет задана через консоль,
    //а значения рандомно сегенерены в заданном диапазоне
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        while (!scanner.hasNextInt()) {
            String text = scanner.next();
            System.out.println(text + " не число дурилка");
        }
        int index = scanner.nextInt();
        index = index - 1;//Зачем тут -1?Я....не помню....

        Random random = new Random();

        int[] numbers = new int[index];
        for (int i = 0; i < index; i++) {
            numbers[i] = random.nextInt(index);//При каждой новой итерации рандом будет генерить новое число,
            //в заданных пользователем рамках длинны массива).
        }
        for (int i = 0; i < numbers.length; i++) {//Задан цикл до границ "numbers.lenght".
            System.out.print(numbers[i] + " ");//Выведение всех сгенеренных чисел," " - нужны для пробела между числами
        }

        System.out.println(" ");//Это нужно для перевода последующих выводов результатов на новых строках

        //Нахождение значения максимума массива.
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Max массива: " + max);

        //Нахождение значения минимума массива.
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Min массива: " + min);

        //Нахождение среднего значения массива.
        double avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            avg += (double) numbers[i] / numbers.length;//Через итерации,сумма чисел будет поделена на количество чисел.
        }
        System.out.printf("Avg массива: %.2f ", avg);//Выведение среднего округленного значения(2 знака после запятой).
    }
}