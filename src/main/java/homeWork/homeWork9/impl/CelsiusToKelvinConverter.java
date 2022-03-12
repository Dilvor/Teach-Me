package homeWork.homeWork9.impl;

import homeWork.homeWork9.Convertable;
import homeWork.homeWork9.TemperatureValue;

//Создаем перевод из Цельсии в Кельвины
public class CelsiusToKelvinConverter implements Convertable {//Реализуем заданный интерфейс
//У конвертера есть константа которой будем пользоваться,она может быть доступна в других участках программы,
// поэтому можно сделать ее "public"
    public static final double DELTA = 273.15;
//Для реализации интерфейса:
//Generate -> Implement Methods ->convert(value:double)double
    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() + DELTA;//Логика перевода Цельсий в Кельвины,на этом первый конвертер готов
        //Далее создаем ему парный конвертер "KelvinToCelsiusConverter"
    }
}
