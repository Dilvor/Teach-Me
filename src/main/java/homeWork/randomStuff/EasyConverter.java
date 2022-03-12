package homeWork.randomStuff;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EasyConverter {
//Простой конвертер температут(Фаренгейтов в Цельсий)
    public static void main(String[] args) {
        //Добавлен сканер для ввода
        Scanner scanner = new Scanner(System.in);
        //Приветственное сообщение будет выведено в консоль
        System.out.println("Здрасти!");
        System.out.println("Введите температуру(в Фаренгейтах)которая будет конвертирована в Цельсий");
        //Сканер примет число
        double tempToConvert = scanner.nextDouble();
        //Задание логики
        double tempConverted = fahrenheitToCelsium(tempToConvert);
        //Тут задание формата результата с одной дробью
        DecimalFormat df = new DecimalFormat("####.#");
        String tempFormatted = df.format(tempConverted);
        //Вывод результата конвертации
        System.out.println(tempToConvert + " градусов Фаренгейта это " + tempFormatted + " по Цельсию");
    }//Как логика работает
    public static double fahrenheitToCelsium(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
}
