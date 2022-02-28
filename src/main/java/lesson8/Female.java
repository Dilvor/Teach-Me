package lesson8;

public class Female extends Human{

    public Female(String fio, int age, String nationality, boolean sex) {//Решение проблемы с "private" в "Humans"
        super(fio, age, nationality, sex);
    }

    public void cook(){//Задаем доп.возможности женщине
        System.out.println("Женщина умеет готовить");
    }

    @Override//что ты такое?
    public void changeName(String newName){
        super.changeName(newName);
        System.out.println("Женщина сменила себе имя");//Добавление вспомогательной информации при смене имени
    }
}
