package lesson8;

public class Male extends Human {//Так свойства из класса "Human" перекочуют сюда.

    public Male(String fio, int age, String nationality, boolean sex){//Решение проблемы с "private" в "Humans"
        super(fio, age, nationality, sex);
    }

    public void drive(){//Задаем доп.возможности мужчине
        System.out.println("Мужчина может водить машину");
    }

}
