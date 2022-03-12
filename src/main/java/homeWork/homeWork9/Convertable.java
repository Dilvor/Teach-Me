package homeWork.homeWork9;

import homeWork.homeWork9.impl.*;

public interface Convertable {//Тут будет переводиться значение одной системы в другую

    //Реализация метода который позволит переводить значение с помощью вещественного типа "double"
    double convert(TemperatureValue value);

    static double convert(TemperatureValue value, TemperatureMeasurementSystem toSystem) {
        switch (toSystem) {
            case CELSIUS -> {
                switch (value.getMeasurementSystem()) {
                    case CELSIUS -> {//при попытке конвертировать Цельсий в Цельсий,введенное значение будет возвращено.
                        return new IdentityConverter().convert(value);
                    }
                    case KELVIN -> {
                        return new KelvinToCelsiusConverter().convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new FahrenheitToCelsiusConverter().convert(value);
                    }
                }
            }
            case KELVIN -> {
                switch (value.getMeasurementSystem()) {
                    case KELVIN -> {
                        return new IdentityConverter().convert(value);
                    }
                    case CELSIUS -> {
                        return new CelsiusToKelvinConverter().convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new FahrenheitToKelvinConverter().convert(value);
                    }
                }
            }
            case FAHRENHEIT -> {
                switch (value.getMeasurementSystem()) {
                    case CELSIUS -> {
                        return new CelsiusToFahrenheitConverter().convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new IdentityConverter().convert(value);
                    }
                    case KELVIN -> {
                        return new KelvinToFahrenheitConverter().convert(value);
                    }
                }
            }
        }
        throw new IllegalStateException("Сюда ты не должен попасть");
    }

    static double convert(double value, TemperatureMeasurementSystem fromSystem, TemperatureMeasurementSystem toSystem) {
        return Convertable.convert(new TemperatureValue(value, fromSystem), toSystem);//И свичи больше не нужны
    }
}
