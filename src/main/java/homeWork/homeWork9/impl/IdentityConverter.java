package homeWork.homeWork9.impl;

import homeWork.homeWork9.Convertable;
import homeWork.homeWork9.TemperatureValue;

//Общий конвертер,который будет переводить кельвин в кельвин,фаренгейт в фаренгет,цельсий в цельсий
//тоесть ничего не делать,возвращать самого себя
public class IdentityConverter implements Convertable {//Имплементируем
//Generate-> Implement Methods
    @Override
    public double convert(TemperatureValue value) {
        return value.getValue();//Возвращает введенное значение(конвертация метода в самого себя ничего не меняет)
    }
}
