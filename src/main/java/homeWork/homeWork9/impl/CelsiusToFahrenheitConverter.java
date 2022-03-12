package homeWork.homeWork9.impl;

import homeWork.homeWork9.Convertable;
import homeWork.homeWork9.TemperatureValue;

import static homeWork.homeWork9.impl.FahrenheitToCelsiusConverter.DELTA;
import static homeWork.homeWork9.impl.FahrenheitToCelsiusConverter.KOEFFICIENT;

//Конвертер Цельсий в Фаренгейты
public class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() * KOEFFICIENT + DELTA;
    }
}
