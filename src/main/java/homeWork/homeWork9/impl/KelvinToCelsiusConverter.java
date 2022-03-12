package homeWork.homeWork9.impl;
//Создаем парный класс для "CelsiusToKelvinConverter",его логику он по сути будет повторять
import homeWork.homeWork9.Convertable;
import homeWork.homeWork9.TemperatureValue;
//Поскольку константа(DELTA) задана,просто импортируем ее сюда
import static homeWork.homeWork9.impl.CelsiusToKelvinConverter.DELTA;

public class KelvinToCelsiusConverter implements Convertable {
    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() - DELTA;//метод реализован при помощи импортированной константы (DELTA)
    }
}
