package homeWork.homeWork9.impl;

import homeWork.homeWork9.Convertable;
import homeWork.homeWork9.TemperatureValue;
//Конвертация Фаренгейтов в Цельсии
public class FahrenheitToCelsiusConverter implements Convertable {

    public static final int DELTA = 32;

    public static final double KOEFFICIENT = 1.8;//9 / 5

    @Override
    public double convert(TemperatureValue value) {//Refactor->Introduce Constant->Помещаем число в "DELTA"
        return (value.getValue() - DELTA) / KOEFFICIENT  ;
    }
}
