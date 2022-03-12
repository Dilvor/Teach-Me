package homeWork.homeWork9;

public class TemperatureValue {//В этом классе будет храниться два значения:
    private final double value;//Само значение которое хотим переводить(final - значение не пердполагает изменений)
    private final TemperatureMeasurementSystem measurementSystem;//Cсылка на "TemperatureMeasurementSystem"
//Generate -> Constructor ->(от этих двух полей)
    public TemperatureValue(double value, TemperatureMeasurementSystem measurementSystem) {
        this.value = value;
        this.measurementSystem = measurementSystem;
    }//С возможностью получения необходимой информации через геттеры(Generate->Getter->all)

    public double getValue() {
        return value;
    }

    public TemperatureMeasurementSystem getMeasurementSystem() {
        return measurementSystem;
    }
}
