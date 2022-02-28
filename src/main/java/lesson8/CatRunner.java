package lesson8;

public class CatRunner {

    public static void main(String[] args) {
        Cat barsik = new Cat();//Создаем котиков,каждый "new" - новый котик
        barsik.name = "Барсик";//Задание характеристик котиков
        barsik.age = 1;
        barsik.poroda = "Персидский";
        barsik.bossName = "Виталий";
        Cat persik = new Cat();//Shift + F6 можно переименовать все использования переменной разом
        persik.name = "Барсик";
        persik.age = 1;
        persik.poroda = "Персидский";
        persik.bossName = "Виталий";
        Cat bobik = new Cat();
        Cat malysh = new Cat();
        System.out.println(barsik == persik);
        System.out.println(barsik == bobik);
        System.out.println(barsik == malysh);
        System.out.println("-------------------");
        System.out.println(barsik.equals(persik));
    }
}
