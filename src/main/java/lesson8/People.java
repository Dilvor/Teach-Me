package lesson8;

public class People {//Тут будут вызваны классы

    public static void main(String[] args) {
        //Задаем параметры так из за "private" в "Humans
        Human me = new Male("Семен Свалов Мэн", 33, "русский", true);
        Human nataliaIvanovna = new Female("Петрова Наталья Ивановна", 25, "русская", true);
        me.beOlder();
        nataliaIvanovna.changeNationality("Немка");
        me.changeName("Semen Swallow");
        nataliaIvanovna.changeName("Меркель Ангела");
        nataliaIvanovna.setAge(67);
        System.out.println(me);
        System.out.println(nataliaIvanovna);
        Human[] people = new Human[] {me, nataliaIvanovna};//Занесение в массив
        for (Human human: people){
            human.setAge(40);//Смена возраста всем кто есть в массиве
        }
        System.out.println("----------------");
        System.out.println(me);
        System.out.println(nataliaIvanovna);
        System.out.println("----------------");
        ((Male)me).drive();//Закован в скобки с добавлением "Male" чтобы получить доступ к нему из другово класса
        ((Female)nataliaIvanovna).cook();
    }
}
