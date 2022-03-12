package homeWork.homeWork9.starter;

import homeWork.homeWork9.Convertable;
import homeWork.homeWork9.TemperatureMeasurementSystem;

import java.util.Scanner;

//Cтартер,который будет запускать логику
public class TemperatureStarter {
    public static void main(String[] args) {//Будут использованы реализации "UniversalConverter"
//в котором передадим на вход значения полученные через консоль,
//так же можно запросить значение исходной системы и в какую систему будет переводить
//Поприветствуем пользователя
        System.out.println("Добро пожаловать в конвертер. Тут вы сможете переводить температуру из одной системы в другую.");
        System.out.println("Введите значения для конвертации:");
//Ожидаем ввод значения "double",настраиваем логику сканера
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()){
            String inputValue = scanner.next();
            System.out.printf("Вместо %s ожидали значение температуры как вещественного числа\n", inputValue);
        }
        double value = scanner.nextDouble();//Сканер заполняет значение "value",далее укажем конвертируемые системы
        System.out.println("Введите исходную систему измерений (возможные варианты - C, K, F):");
//Пытаемся проверить текущий ввод,как значение которое может принять 3 возможных константы("C", "K" и "F")
//но прописывать их как константы в данном классе не будем,а вынесем в перечисление "TemperatureMeasurementSystem"
        String temperatureSystem = scanner.next();
        System.out.println("Теперь введите систему измерений в которую будет переведено указанное ранее значение (возможные варианты - C, K, F):");
        String destinationTemperatureSystem = scanner.next();
//Указываем параметры,а далее будем получать их удобным способом(способы описаны выше,были дабавлены  после)
        System.out.printf("Результат: %.2f\n", Convertable.convert(value,//%.2f после запятой будет 2 знака
                TemperatureMeasurementSystem.of(temperatureSystem),
                TemperatureMeasurementSystem.of(destinationTemperatureSystem)));
    }
}
