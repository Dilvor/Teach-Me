package homeWork.homeWork10;

public class AutomobileRunner {
    public static void main(String[] args) {
        PassengerCar Car1 = new PassengerCar(1488, 50, 1000, 2.0, 1.5);//Проедет свободно
        PassengerCar Car2 = new PassengerCar(322, 81, 1000, 2.0, 1.5);//Превысил - предупреждение
        PassengerCar Car3 = new PassengerCar(4242, 101, 1000, 2.0, 1.5);//Сильно превысил - на бутылку
        Truck Truck1 = new Truck(666, 50, 9000, 2.0, 1.5);//Слишком тяжелый
        Truck Truck2 = new Truck(777, 50, 1000, 5.0, 1.5);//Слишком высокий
        Truck Truck3 = new Truck(888, 50, 1000, 2.0, 4.5);//Слишком широкий

        int limitSpeed = 80;//превышение скорости
        int violationSpeed = 100;//сильное превышение скорости
        int maxWeight = 8000;//максимально допустимый вес(в КГ)
        double maxWidth = 4.0;//максимально допустимая ширина(в метрах)
        double maxHeight = 2.5;//максимально допустимая высота(в метрах)

        Automobile[] automobiles = new Automobile[]{Car1, Car2, Car3, Truck1, Truck2, Truck3};
        for (Automobile automobile : automobiles) {
            if (limitSpeed < automobile.speed) {
                System.out.println("Автомобиль с номером: " + automobile.number + " атата");
            }
            if (violationSpeed < automobile.speed) {
                System.out.println("Автомобиль с номером: " + automobile.number + " задержан полицией");
            }
            if (maxWeight < automobile.weight | maxWidth < automobile.width | maxHeight < automobile.height) {
                System.out.println("На автомобиль с номером: " + automobile.number +
                        " невозможно проехать КПП из за несоотвествия габаритов");
            }
        }
    }
}
