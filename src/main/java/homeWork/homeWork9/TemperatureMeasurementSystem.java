package homeWork.homeWork9;

import java.util.Objects;

//Вспомогательное перечисление,
//которое будет задавать список возможных систем измерений,из которых будем переводить одно значение в другое.
public enum TemperatureMeasurementSystem {
    //Задаем три возможных значения
    CELSIUS("C"), KELVIN("K"), FAHRENHEIT("F");

    private  final String shortName;//Сокращения для класса "TemperatureStarter" - (C, K, F)
//Далее создаем конструктор с этим полем,которое будем передавать в качестве аргументов нашим константам
    TemperatureMeasurementSystem(String shortName) {
        this.shortName = shortName;
    }
//Логика работы сокращений и проверка на ошибки
    public static TemperatureMeasurementSystem of(String input){
        for(TemperatureMeasurementSystem measurementSystem: values()){
         //   if(Objects.equals(measurementSystem.shortName, input))
            if(measurementSystem.shortName.equalsIgnoreCase(input)){
                return measurementSystem;//Получаем нужную константу
            }
        }//В противном случае
        return CELSIUS;//Как вариант(?)
    }
}
