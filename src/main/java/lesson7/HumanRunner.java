package lesson7;

public class HumanRunner {//Взаимосвязан с классом "Human".

    public static void main(String[] args) {
        Human me = new Human();//Обращение к "конструктору" класса.
        //Конструктор - это возможность сделать объекты с подготовленным набором значений.
        //() - Вызов конструктора по умолчанию без каких либо параметров.
        me.name = "Semen";//Заполнение значения
        me.surname = "Swallow";
        me.age = 15;
        me.weight = 148.8;
        me.height = 190;
        me.hasQrCode = false;

        Human nataliaIvanovna = new Human();
        nataliaIvanovna.name = "Natalia";
        nataliaIvanovna.surname = "Petrova";
        nataliaIvanovna.age = 27;
        nataliaIvanovna.weight = 55;
        nataliaIvanovna.height = 165;
        nataliaIvanovna.hasQrCode = true;

        Human incognito = new Human("Unknown", "Unknown");

        Human vasyaPupkin = new Human("Vasiliy", "Pupkin", 50, -1, -1, null);

        System.out.println(me == vasyaPupkin);//Сравнение "me" и "vasyaPupkin"
        System.out.println(me == me);

        //Объединение людей в массив,чтобы в последующем оставить только тех кому есть 50.
        Human[] humans = new Human[]{me, nataliaIvanovna, incognito, vasyaPupkin};
        for (Human human : humans) {
            if (50 == human.age) {//Проверка лет
                System.out.println("Человек с именем " + human.name + " и фамилия " + human.surname + " имеет возраст 50!");
            }
        }

        me.beOlder();
        System.out.println("На следующий год мне будет " + me.getAge());
        me.chippirovan();
        System.out.println("Наличие кода " + me.getHasQrCode());

        me.setName("John");
        System.out.println("Теперь я " + me.getName());
    }
}
