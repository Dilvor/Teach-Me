package homeWork.homeWork9.impl;

import homeWork.homeWork9.Convertable;
import homeWork.homeWork9.TemperatureValue;

//Кельвин в Фаренгейты
public class KelvinToFahrenheitConverter implements Convertable {
    @Override
    public double convert(TemperatureValue value) {
        return (value.getValue() - CelsiusToKelvinConverter.DELTA) * FahrenheitToCelsiusConverter.KOEFFICIENT
                + FahrenheitToCelsiusConverter.DELTA;
    }
}
