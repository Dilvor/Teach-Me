package homeWork.homeWork10;

public class AutomobileRunner {
    public static void main(String[] args) {
        PassengerCar Car1 = new PassengerCar(1488, 50, 1000, 2.0, 1.5);//Проедет свободно
        PassengerCar Car2 = new PassengerCar(322, 81, 1000, 2.0, 1.5);//Превысил - предупреждение
        PassengerCar Car3 = new PassengerCar(4242, 101, 1000, 2.0, 1.5);//Сильно превысил - на бутылку
        Truck Truck1 = new Truck(666, 50, 9000, 2.0, 1.5);//Слишком тяжелый
        Truck Truck2 = new Truck(777, 50, 1000, 5.0, 1.5);//Слишком высокий
        Truck Truck3 = new Truck(888, 50, 1000, 2.0, 4.5);//Слишком широкий
        Automobile[] automobiles = new Automobile[]{Car1, Car2, Car3, Truck1, Truck2, Truck3};
        for (Automobile automobile : automobiles) {
            if (81 <= automobile.speed) {
                System.out.println("Автомобиль с номером: " + automobile.number + " атата,еще немного и хуже будет");
            }
            if (101 <= automobile.speed) {
                System.out.println("Автомобиль с номером: " + automobile.number + " доигрался,задержан полицией");
            }
            if (8001 <= automobile.weight | 4.1 <= automobile.width | 2.6 <= automobile.height) {
                System.out.println("На автомобиль с номером: " + automobile.number +
                        " невозможно проехать КПП из за несоотвествия габаритов");
            }
        }
    }
}
