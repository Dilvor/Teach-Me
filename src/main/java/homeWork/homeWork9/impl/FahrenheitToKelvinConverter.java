package homeWork.homeWork9.impl;
//Фаренгейт в Кельвины
import homeWork.homeWork9.Convertable;
import homeWork.homeWork9.TemperatureValue;

public class FahrenheitToKelvinConverter implements Convertable {
    @Override
    public double convert(TemperatureValue value) {
        return (value.getValue() - FahrenheitToCelsiusConverter.DELTA) / FahrenheitToCelsiusConverter.KOEFFICIENT + CelsiusToKelvinConverter.DELTA;
    }
}
